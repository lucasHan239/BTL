/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Data.User;
import Control.UserIO;
import java.io.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author DELL
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
            

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
        String U = request.getParameter("user");
        String P = request.getParameter("password");
        User actor = new User();
        String message = "";
        String url ="";
        if (!check(U,P)){
            url = "/login.jsp";
            message = "Wrong User/Password";
        }
        else {
            url = "/index.jsp";
            message = "Xin chào " + U;
        }
        request.setAttribute("actor", actor);
        request.setAttribute("message", message);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
    }
    public static boolean check(String user, String password) {
        UserIO.Read();
        String cU = "", cP = "";
        int index = 0;
        while(index < UserIO.listUser.size()){
            User checkUser = UserIO.listUser.get(index);
            if (user.compareTo(checkUser.getUser())==0)
                if (password.compareTo(checkUser.getPassword())==0){
                    return true;
                }
            index++;
        }
                return false;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */


}
