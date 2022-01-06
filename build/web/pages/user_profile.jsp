<%-- 
    Document   : user_profile
    Created on : Apr 14, 2019, 11:30:32 PM
    Author     : khadi
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="autf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>RESERVATION SILVER MARINE HOTEL</title>
        <!-- Bootstrap Styles-->
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <!-- FontAwesome Styles-->
        <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- Custom Styles-->
        <link href="assets/css/custom-styles.css" rel="stylesheet" />
        <!-- Google Fonts-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    </head>
    <body>
        <%
            String email = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("email")) {
                        email = cookie.getValue();
                    }
                }
            }
            if (email == null) {
                response.sendRedirect("http://localhost:8084/Hotel_Management/pages/login.jsp");
            }
        %>

        <div id="wrapper">
            <nav class="navbar-default navbar-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="main-menu">

                        <li> 
                            <a href="http://localhost:8084/Hotel_Management/pages/user_profile.jsp" style="color: white"><i class="fa fa-user" aria-hidden="true"></i>User Profile</a> 
                        </li>
                        <li> 
                            <form action="../logoutServlet" method="post">
                                <i class="fa fa-sign-out" aria-hidden="true" style="color: white; padding: 10px;"></i>
                                <button type="submit" id="book" class="btn btn-amber">
                                    logout
                                </button>      
                        </li>

                    </ul>

                </div>

            </nav>

            <div id="page-wrapper" >
                <div id="page-inner">
                    <div class="row">
                        <div class="col-md-12">
                            <h1 class="page-header">
                                <p>Your reservation has been successful!!</p><small></small>
                            </h1>
                        </div>
                    </div> 
                    <div class="row">
                        <div class="col-md-12 col-sm-12">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    USER INFORMATION
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-body">
                                        <div class="table-responsive">
                                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                                <thead>
                                                    <tr>
                                                        <th>Title</th>
                                                        <th>First Name</th>
                                                        <th>Last Name</th>
                                                        <th>Email</th>
                                                        <th>Nationality</th>
                                                        <th>Country</th>
                                                        <th>Phone</th>       
                                                    </tr>
                                                </thead>
                                                <tbody> 
                                                    <%
                                                        try {
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");
                                                            Statement stmt = conn.createStatement();
                                                            ResultSet rs = stmt.executeQuery("SELECT * FROM register WHERE email= '" + email + "'");
                                                            while (rs.next()) {

                                                    %>
                                                    <tr>
                                                        <td><%=rs.getString("title")%></td>
                                                        <td><%=rs.getString("fname")%></td>
                                                        <td><%=rs.getString("lname")%></td>
                                                        <td><%=rs.getString("email")%></td>
                                                        <td><%=rs.getString("nation")%></td>
                                                        <td><%=rs.getString("email")%></td>
                                                        <td><%=rs.getString("phone")%></td>

                                                    </tr>
                                                    <%

                                                        }
                                                    %>

                                                </tbody>
                                            </table>
                                            <%
                                                    conn.close();
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                }
                                            %>                                      

                                        </div>

                                    </div>
                                </div>




                                <div class="row">
                                    <div class="col-md-12 col-sm-12">
                                        <div class="panel panel-primary">
                                            <div class="panel-heading">
                                                USER Bill
                                            </div>
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
                                                                        ResultSet rs = stmt.executeQuery("SELECT * FROM payment WHERE email= '" + email + "'");
                                                                        while (rs.next()) {
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


                                                            </tbody>
                                                        </table>
                                                        <%
                                                                conn.close();
                                                            } catch (Exception e) {
                                                                e.printStackTrace();
                                                            }
                                                        %>                                      

                                                    </div>

                                                </div>
                                            </div>






                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        </body>
                        </html>
