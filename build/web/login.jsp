<%-- 
    Document   : login
    Created on : Oct 3, 2019, 12:43:34 PM
    Author     : DELL
--%>

<%@page import="Data.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="/includes/header.jsp" %>

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
            <h1> Đăng Nhập </h1>
            <p><i style="color: red"><%=message%> </i></p>
            <form action="LoginServlet" method="post"/>
            <table border="0"  width ="200" height ="100" >
                <tr>
                    <td> User</td>
                    <td>
                        <input name = "user" type="text" placeholder="user" width ="200" height ="100" >
                    </td>
                    
                </tr>
                <tr>
                    <td>Password</td>
                    <td>
                        <input name = "password" type="password" placeholder="Password" width ="200" height ="100" >
                    </td>
                </tr>
                        <tr>
            <td></td>
            <td><br>
                <input type="submit" value="Đăng Nhập">
            
                
                <button  type = "submit" >
                                <a href="signin.jsp">Đăng Ký</a>
                            
                </button>
            </td>
            
            </tr>
            </table>

        </div>
        
    </center>
            <%@include file="/includes/footer.jsp" %>