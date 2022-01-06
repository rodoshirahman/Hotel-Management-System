<%-- 
    Document   : adminHome
    Created on : Apr 17, 2019, 7:49:26 AM
    Author     : khadi
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Administrator	</title>
        <!-- Bootstrap Styles-->
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <!-- FontAwesome Styles-->
        <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- Morris Chart Styles-->
        <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
        <!-- Custom Styles-->
        <link href="assets/css/custom-styles.css" rel="stylesheet" />
        <!-- Google Fonts-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    </head>

    <body>
        <div id="wrapper">
            <nav class="navbar navbar-default top-navbar" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="http://localhost:8084/Hotel_Management/pages/adminHome.jsp">Admin </a>
                </div>

                <ul class="nav navbar-top-links navbar-right">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                            <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            
                            <li class="divider"></li>
                            <form action="../adminlogoutServlet" method="post">
                                <i class="fa fa-sign-out" aria-hidden="true" style="color: white; padding: 10px;"></i>
                                <button type="submit" id="book" class="btn btn-amber">
                                    logout
                                </button>  
                            </form>
                            </li>
                        </ul>
                        <!-- /.dropdown-user -->
                    </li>
                    <!-- /.dropdown -->
                </ul>
            </nav>
            <!--/. NAV TOP  -->
            <nav class="navbar-default navbar-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="main-menu">

                        <li>
                            <a class="active-menu" href="http://localhost:8084/Hotel_Management/pages/adminHome.jsp"><i class="fa fa-dashboard"></i> Status</a>
                        </li>
                        
                        <li>
                            <a href="http://localhost:8084/Hotel_Management/pages/adminHome.jsp"><i class="fa fa-bar-chart-o"></i> Room Booking</a>
                        </li>
                        <li>
                            <a href="http://localhost:8084/Hotel_Management/pages/payment.jsp"><i class="fa fa-qrcode"></i> Payment</a>
                        </li>
                      <li> 
                        <form action="../adminlogoutServlet" method="post">
                          <i class="fa fa-sign-out" aria-hidden="true" style="color: white; padding: 10px;"></i>
                          <button type="submit" id="book" class="btn btn-amber">
                              logout
                          </button>  
                        </form>
                    </li>




                    </ul>

                </div>

            </nav>
            <!-- /. NAV SIDE  -->
            <div id="page-wrapper">
                <div id="page-inner">


                    <div class="row">
                        <div class="col-md-12">
                            <h1 class="page-header">
                                Status <small>Room Booking </small>
                            </h1>
                        </div>
                    </div>
                    <!-- /. ROW  -->


                    <div class="row">
                        <div class="col-md-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">

                                </div>
                                <div class="panel-body">
                                    <div class="panel-group" id="accordion">

                                        <div class="panel panel-primary">
                                            <div class="panel-heading">
                                                <h4 class="panel-title">
                                                    <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
                                                        <button class="btn btn-default" type="button">
                                                             Room Bookings  <span class="badge"></span>
                                                        </button>
                                                    </a>
                                                </h4>
                                            </div>
                                            <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                                                <div class="panel-body">
                                                    <div class="panel panel-default">
                                           
                                                        <div class="panel-body">
                                                            <div class="table-responsive">
                                                                <form method="get">
                                                                <table class="table">
                                                                    <thead>
                                                                        <tr>
                                                                            <!--  <th>Name</th> -->
                                                                            <th>Email</th>
                                                                            <!--  <th>Country</th> -->
                                                                            <th>Room</th>
                                                                            <th>Bedding</th>
                                                                            <th>Meal</th>
                                                                            <th>Check In</th>
                                                                            <th>Check Out</th>
                                                                            <th>Status</th>

                                                                        </tr>
                                                                    </thead>
                                                                    <tbody>
<%
    try
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
    Statement stmt=conn.createStatement();
    ResultSet rs=stmt.executeQuery("select * from reservation");
    while(rs.next())
    {
     
    %>
       <tr>
        <td><%=rs.getString("email") %></td>
        <td><%=rs.getString("troom") %></td>
        <td><%=rs.getString("bed") %></td>
        <td><%=rs.getString("nroom") %></td>
        <td><%=rs.getString("meal") %></td>
        <td><%=rs.getString("cin") %></td>
        <td><%=rs.getString("cout") %></td>
        
    </tr>
          <%
     
    }
    %>
      
                                                                    </tbody>
                                                                </table>
        <%
        
        conn.close();
        }
    catch(Exception e)
    {
        e.printStackTrace();
        }
    %>

                                                                </form>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- End  Basic Table  --> 
                                                </div>
                                            </div>
                                        </div>

                                       
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>



                <!-- /. PAGE INNER  -->
            </div>
            <!-- /. PAGE WRAPPER  -->
        </div>
        <!-- /. WRAPPER  -->
        <!-- JS Scripts-->
        <!-- jQuery Js -->
        <script src="assets/js/jquery-1.10.2.js"></script>
        <!-- Bootstrap Js -->
        <script src="assets/js/bootstrap.min.js"></script>
        <!-- Metis Menu Js -->
        <script src="assets/js/jquery.metisMenu.js"></script>
        <!-- Morris Chart Js -->
        <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
        <script src="assets/js/morris/morris.js"></script>
        <!-- Custom Js -->
        <script src="assets/js/custom-scripts.js"></script>


    </body>

</html>
