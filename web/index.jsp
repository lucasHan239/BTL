<%@page import="Data.User"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/includes/header.jsp" %>
            <%
            String message = (String) request.getAttribute("message");
            User Actor = (User) request.getAttribute("actor");
            if (message == null) message = "";
            %>
            <center>
            <div>
                
                <p><i> <%=message%> </i></p>
            </div>
            </center>
<%@include file="/includes/footer.jsp"  %>
    
