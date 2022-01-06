/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author khadi
 */
public class registrationServlet extends HttpServlet {

    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        
        String title = request.getParameter("title");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String nation = request.getParameter("nation");
        String country = request.getParameter("country");
        String phone = request.getParameter("phone");
        String pass_1 = request.getParameter("password_1");
        String pass_2 = request.getParameter("password_2");
        if (!(pass_1.equals(pass_2))) {
            String error_msg = "Password doesn't Match, Try again!";
            HttpSession session = request.getSession(true);
            session.setAttribute("errormsg", error_msg);
            response.sendRedirect("http://localhost:8084/Hotel_Management/Pages/register.jsp");
        } else {
            DbHelper dbHelper = new DbHelper();
            String num = dbHelper.countUser();    
            if(num.equals("error")){
               String error_msg = "Cannot connect db, Try again!";
               HttpSession session = request.getSession(true);
               session.setAttribute("errormsg", error_msg);
            }
            int n = Integer.parseInt(num);
            n++;
            String id = String.valueOf(n);
            
            ArrayList<String> userInfo = new ArrayList<>();
            userInfo.add(id);
            userInfo.add(title);
            userInfo.add(fname);
            userInfo.add(lname);
            userInfo.add(email);
            userInfo.add(nation);
            userInfo.add(country);
            userInfo.add(phone);
            userInfo.add(pass_1);
            userInfo.add(pass_2);
            
            dbHelper.insertNewUser(userInfo);
            
            Cookie loginCookie = new Cookie("email",email);
			//setting cookie to expiry in 30 mins
	    loginCookie.setMaxAge(30*60);
	    response.addCookie(loginCookie);
            
            response.sendRedirect("http://localhost:8084/Hotel_Management/pages/reservation.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
