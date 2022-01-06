<%-- 
    Document   : login
    Created on : Apr 14, 2019, 9:53:20 PM
    Author     : khadi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Silver Marine</title>
    </head>
    <body>
        <form action="../loginServlet" method="post">
            <input class="text" type="text" name="email" placeholder="User Email" required="true">

            <input class="text" type="password" name="password" placeholder="Password" required="true">

            <%
                String msg = (String) session.getAttribute("errorlogin");
                if (msg != null) {
                    out.print("<p style='color:red;font-weight:bold;'> *" + msg + "</p>");
                }
            %>

            <a href="http://localhost:8084/Hotel_Management/pages/reservation.jsp"><input type="submit" value="LOG IN"></a>
        </form>
    </body>
</html>
