<%-- 
    Document   : payment
    Created on : Apr 17, 2019, 8:51:59 AM
    Author     : khadi
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>SILVER MARINE HOTEL</title>
        <!-- Bootstrap Styles-->
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <!-- FontAwesome Styles-->
        <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- Morris Chart Styles-->

        <!-- Custom Styles-->
        <link href="assets/css/custom-styles.css" rel="stylesheet" />
        <!-- Google Fonts-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
        <!-- TABLE STYLES-->
        <link href="assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />
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
                            <a href="http://localhost:8084/Hotel_Management/pages/adminHome.jsp"><i class="fa fa-dashboard"></i> Status</a>
                        </li>
                        <li>
                            <a href="http://localhost:8084/Hotel_Management/pages/adminHome.jsp"><i class="fa fa-bar-chart-o"></i>Room Booking</a>
                        </li>
                        <li>
                            <a class="active-menu" href="http://localhost:8084/Hotel_Management/pages/payment.jsp"><i class="fa fa-qrcode"></i> Payment</a>
                        </li>
                        <li>
                            <form action="../adminlogoutServlet" method="post">
                                <i class="fa fa-sign-out" aria-hidden="true" style="color: white; padding: 10px;"></i>
                                <button type="submit" id="book" class="btn btn-amber">
                                    logout
                                </button>  
                            </form>
                        </li>



                </div>

            </nav>
            <!-- /. NAV SIDE  -->
            <div id="page-wrapper" >
                <div id="page-inner">
                    <div class="row">
                        <div class="col-md-12">
                            <h1 class="page-header">
                                Payment Details<small> </small>
                            </h1>
                        </div>
                    </div> 
                    <!-- /. ROW  -->


                    <div class="row">
                        <div class="col-md-12">
                            <!-- Advanced Tables -->
                            <div class="panel panel-default">
                                <div class="panel-body">
                                    <div class="table-responsive">
                                        <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                            <thead>
                                                <tr>
                                                    <th>Name</th>
                                                    <th>Room type</th>
                                                    <th>Bed Type</th>
                                                    <th>Check in</th>
                                                    <th>Check out</th>
                                                    <th>No of Room</th>
                                                    <th>Meal Type</th>

                                                    <th>Room Rent</th>
                                                    <th>Bed No</th>
                                                    <th>Meals </th>
                                                    <th>Gr.Total</th>


                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    try {
                                                        String email = null;
                                                        String troom = null;
                                                        String bed = null;
                                                        String nroom = null;
                                                        String meal = null;
                                                        String cin = null;
                                                        String cout = null;
                                                        String rent = null;
                                                        String brent = null;
                                                        String meals = null;
                                                        String total = null;

                                                        Class.forName("com.mysql.jdbc.Driver");
                                                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");
                                                        Statement stmt = conn.createStatement();
                                                        ResultSet rs = stmt.executeQuery("select *  from payment");
                                                        while (rs.next()) {
                                                            email = rs.getString("email");
                                                            troom = rs.getString("troom");
                                                            bed = rs.getString("bed");
                                                            cin = rs.getString("cin");
                                                            cout = rs.getString("cout");
                                                            nroom = rs.getString("nroom");
                                                            meal = rs.getString("meal");
                                                            rent = rs.getString("room rent");
                                                            brent = rs.getString("bed rent");
                                                            meals = rs.getString("meals");
                                                            total = rs.getString("total");
                                                        }


                                                %>                                        
                                                <tr>
                                                    <td><%=email%></td>
                                                    <td><%=troom%></td>
                                                    <td><%=bed%></td>
                                                    <td><%=cin%></td>
                                                    <td><%=cout%></td>
                                                    <td><%=nroom%></td>
                                                    <td><%=meal%></td>
                                                    <td><%=rent%></td>
                                                    <td><%=brent%></td>
                                                    <td><%=meals%></td>
                                                    <td><%=total%></td>

                                                </tr>
                                                <%


                                                %>


                                            </tbody>
                                        </table>
                                        <%              conn.close();
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                        %>
                                    </div>

                                </div>
                            </div>
                            <!--End Advanced Tables -->
                        </div>
                    </div>
                    <!-- /. ROW  -->

                </div>

            </div>


        </div>
        <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
        <!-- /. WRAPPER  -->
        <!-- JS Scripts-->
        <!-- jQuery Js -->
        <script src="assets/js/jquery-1.10.2.js"></script>
        <!-- Bootstrap Js -->
        <script src="assets/js/bootstrap.min.js"></script>
        <!-- Metis Menu Js -->
        <script src="assets/js/jquery.metisMenu.js"></script>
        <!-- DATA TABLE SCRIPTS -->
        <script src="assets/js/dataTables/jquery.dataTables.js"></script>
        <script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
        <script>
            $(document).ready(function () {
                $('#dataTables-example').dataTable();
            });
        </script>
        <!-- Custom Js -->
        <script src="assets/js/custom-scripts.js"></script>


    </body>
</html>
