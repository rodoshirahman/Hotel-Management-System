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
public class reservationServlet extends HttpServlet {

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

        String email = request.getParameter("email");
        String troom = request.getParameter("troom");
        String bed = request.getParameter("bed");
        String nroom = request.getParameter("nroom");
        String meal = request.getParameter("meal");
        String cin = request.getParameter("cin");
        String cout = request.getParameter("cout");

        DbHelper dbHelper = new DbHelper();
        ArrayList<String> reservationInfo = new ArrayList<>();
        reservationInfo.add(email);
        reservationInfo.add(troom);
        reservationInfo.add(bed);
        reservationInfo.add(nroom);
        reservationInfo.add(meal);
        reservationInfo.add(cin);
        reservationInfo.add(cout);

        if (dbHelper.insertNewReservation(reservationInfo)) {
            
           Cookie loginCookie = new Cookie("email",email);
			//setting cookie to expiry in 30 mins
	    loginCookie.setMaxAge(30*60);
	    response.addCookie(loginCookie);
            dbHelper.bill_generate(email);
            response.sendRedirect("http://localhost:8084/Hotel_Management/pages/user_profile.jsp");
        } else {
            String error_msg = "Couldn't save to database";
            HttpSession session = request.getSession(true);
            session.setAttribute("errormsg", error_msg);
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
            Logger.getLogger(reservationServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(reservationServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(reservationServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(reservationServlet.class.getName()).log(Level.SEVERE, null, ex);
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
