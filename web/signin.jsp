<%-- 
    Document   : login
    Created on : Oct 3, 2019, 12:43:34 PM
    Author     : DELL
--%>

<%@page import="Data.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/includes/header.jsp" %>
    <body>
        <%
            String message = (String) request.getAttribute("message");
            User Actor = (User) request.getAttribute("actor");
            if (message == null) message = "";
            %>
        <style>
            .boxlogin{
                margin: 100px 0px 0px 0px;
            }
            .button{
                margin: 30px 0px 0px 0px;
            }
        </style>
    <center>
        <div class="boxlogin" >
            <h1> Đăng Ký </h1>
            <p><i style="color: red"><%= message %> </i></p>
            <form action="SignInServlet" method="post"/>
            <table border="0"  width ="200" height ="100" >
                <tr>
                    <td>User</td>
                    <td>
                        <input name = "User" type="text" placeholder="user" width ="200" height ="100" >
                    </td>
                    
                </tr>
                <tr>
                    <td>Password</td>
                    <td>
                        <input name = "Password" type="password" placeholder="Password" width ="200" height ="100" >
                    </td>
                </tr>
                <tr>
                    <td>Confirm Password</td>
                    <td>
                        <input name = "re-Password" type="password" placeholder="Password" width ="200" height ="100" >
                    </td>
                </tr>     
                <td><br>
                <input type="submit" value="Đăng Kí">
            
                
               
                </td>
            </table>
            
        </div>
        
    </center>
            <%@include  file="/includes/footer.jsp" %>