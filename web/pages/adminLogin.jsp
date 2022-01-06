<%-- 
    Document   : adminLogin
    Created on : Apr 16, 2019, 2:50:31 PM
    Author     : khadi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>SILVER MARINE ADMIN</title>
   <link rel="stylesheet" href="css/style.css">  
</head>

<body>
  <div id="clouds">
	<div class="cloud x1"></div>
	
	<div class="cloud x2"></div>
	<div class="cloud x3"></div>
	<div class="cloud x4"></div>
	<div class="cloud x5"></div>
</div>

 <div class="container">


      <div id="login">

          <form method="post" action="../adminLoginServlet">

          <fieldset class="clearfix">

            <p><span class="fontawesome-user"></span><input type="text"  name="user" value="Username" onBlur="if(this.value == '') this.value = 'Username'" onFocus="if(this.value == 'Username') this.value = ''" required></p> <!-- JS because of IE support; better: placeholder="Username" -->
            <p><span class="fontawesome-lock"></span><input type="password" name="pass"  value="Password" onBlur="if(this.value == '') this.value = 'Password'" onFocus="if(this.value == 'Password') this.value = ''" required></p> <!-- JS because of IE support; better: placeholder="Password" -->
            <p><input type="submit" name="sub"  value="Login"></p>

          </fieldset>

        </form>

       

      </div> <!-- end login -->

    </div>
   <!--  <div class="bottom">  <h3><a href="../index.php"> HOMEPAGE</a></h3></div>
   -->
  
</body>
</html>
