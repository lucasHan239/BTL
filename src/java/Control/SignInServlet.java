/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Data.User;
import Control.UserIO;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author DELL
 */
public class SignInServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


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
        String User = request.getParameter("User");
        String Pass = request.getParameter("Password");
        String Pass2 = request.getParameter("re-Password");
        String message = "";
        String url = "";
        User newUser = new User();

        UserIO.Read();
        if(!checkUser(User)){
            message = "Tên đăng nhập " + User + " đã được sử dụng.";
            url = "/signin.jsp";
        }
        else
        if (Pass.length()<5){
            message = "Mật khẩu cần nhiều hơn 6 ký tự.";
            url = "/signin.jsp";
        }
        else
        if (Pass.compareTo(Pass2) != 0){
            message = "Mật khẩu không trùng nhau.";
            url = "/signin.jsp";
        }
        else{

            newUser.setUser(User);
            newUser.setPassword(Pass);
            message = "Bạn đã đăng nhập thành công.";
            url ="/index.jsp";
            UserIO.Write(User, Pass);
            UserIO.listUser.add(newUser);
        }
        request.setAttribute("actor", newUser);
        request.setAttribute("message", message);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
        


    }
    protected boolean checkUser(String User){
        int index = 0;
        while (index < UserIO.listUser.size()) {            
            if (User.compareTo(UserIO.listUser.get(index).getUser())==0) return false;
            index ++;
        }
        return true;
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
