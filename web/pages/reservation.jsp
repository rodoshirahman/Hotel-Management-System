<%-- 
    Document   : reservation
    Created on : Apr 14, 2019, 1:43:22 PM
    Author     : khadi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8" />
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
if(cookies !=null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("email")) email= cookie.getValue();
}
}
if(email == null) response.sendRedirect("http://localhost:8084/Hotel_Management/pages/login.jsp");
%>
         <div id="wrapper">
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">

                    <li>
                        <a href="http://localhost:8084/Hotel_Management/index.jsp"><i class="fa fa-home"></i> Homepage</a>
                    </li>
                     
                   <li>
                      <h4 class="text-center" style="color: white;"> Welcome </h4>
                      <h4 class="text-center" style="color: white;"><%=email%></h4>
                  </li>
                   <li> 
                    <a href="http://localhost:8084/Hotel_Management/pages/user_profile.jsp" style="color: white"><i class="fa fa-user" aria-hidden="true"></i>Profile</a> 
                  </li>
                  <li> 
                        <form action="../logoutServlet" method="post">
                          <i class="fa fa-sign-out" aria-hidden="true" style="color: white; padding: 10px;"></i>
                          <button type="submit" id="book" class="btn btn-amber">
                              logout
                          </button>  
                        </form>
                    </ul>

            </div>

        </nav>
       
        <div id="page-wrapper" >
            <div id="page-inner">
             <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-header">
                            RESERVATION <small></small>
                        </h1>
                    </div>
                </div> 
                 
                               
            <div class="row">
                <div class="col-md-12 col-sm-12">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            RESERVATION INFORMATION
                        </div>
                        <div class="panel-body">
                            <form method="post" action="../reservationServlet">
                                <div class="form-group">
                                     <label>User Email*</label>
                                     <input name="email" type="text" value="<%=email%>" class="form-control" readonly>
                                        
                                </div>
                                <div class="form-group">
                                            <label>Type Of Room *</label>
                                            <select name="troom"  class="form-control" required>
                                                <option value selected ></option>
                                                <option value="Superior Room">SUPERIOR ROOM</option>
                                                <option value="Deluxe Room">DELUXE ROOM</option>
                                                <option value="Guest House">GUEST HOUSE</option>
                                                <option value="Single Room">SINGLE ROOM</option>
                                            </select>
                              </div>
                              <div class="form-group">
                                            <label>Bedding Type</label>
                                            <select name="bed" class="form-control" required>
                                                <option value selected ></option>
                                                <option value="Single">Single</option>
                                                <option value="Double">Double</option>
                                                <option value="Triple">Triple</option>
                                                <option value="Quad">Quad</option>
                                                
                                                
                                             
                                            </select>
                              </div>
                              <div class="form-group">
                                            <label>No.of Rooms *</label>
                                            <select name="nroom" class="form-control" required>
                                                <option value selected ></option>
                                                <option value="1">1</option>
                                                <option value="2">2</option>
                                                <option value="3">3</option>
                                                <option value="4">4</option>
                                                <option value="5">5</option>
                                                <option value="6">6</option>
                                                <option value="7">7</option> 
                                            </select>
                              </div>
                             
                             
                              <div class="form-group">
                                            <label>Meal Plan</label>
                                            <select name="meal" class="form-control"required>
                                                <option value selected ></option>
                                                <option value="Room only">Room only</option>
                                                <option value="Breakfast">Breakfast</option>
                                                <option value="Half Board">Half Board</option>
                                                <option value="Full Board">Full Board</option>
                                                
                                                
                                             
                                            </select>
                              </div>
                              <div class="form-group">
                                            <label>Check-In</label>
                                            <input name="cin" type ="date" class="form-control">
                                            
                               </div>
                               <div class="form-group">
                                            <label>Check-Out</label>
                                            <input name="cout" type ="date" class="form-control">
                                            
                               </div>
                               <div>
                                   <button type="submit" class="btn" name="reserve">Submit</button>
                               </div>
                       </div>
                        
                    </div>
                </div>
                
               
                </div>
            </div>
           
                
                </div>
                    
            
                
                    </div>
             <!-- /. PAGE INNER  -->
<!--            </div>-->
         <!-- /. PAGE WRAPPER  -->

     <!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- Bootstrap Js -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
      <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script>
    
       
    </body>
</html>
