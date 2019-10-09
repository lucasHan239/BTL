<%-- 
    Document   : header
    Created on : Oct 4, 2019, 12:55:56 AM
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PSShop Telephone</title>
        <style>
            #header{
                background-color: white;
                width: 1300px;
                height: 80px;
                margin: auto;
                border: none;
            }
            .box_search input[type=text]{
                padding: 6px;
                margin-top: 8px;
                font-size: 17px;
                border: 1px solid #000000;
            }
            .box_search button{
                float: right;
                padding: 6px;
                margin-top: 8px;
                background: #ddd;
                font-size: 17px;
                border: none;
                cursor: pointer;
            }
            .topnav {
                overflow: hidden;
                background-color: #ff6600;
                height: auto;
                width: 1300px;
            }
            .topnav a {
                float: left;
                display: block;
                color: #ffffff;
                text-align: center;
                padding: 10px 38px 10px 38px;
                text-decoration: none;
                border-right: 1px solid #ffffff;
            }
            .topnav a:hover {
                background-color: #ddd;
                color: black;
            }
        </style>
    </head>
    <body>
        <div id="header">
            <div style="float:left;width: 300px;height: 50px;margin: 25px 0 0 20px">
                <a href="#"> <image src = "https://didongthongminh.vn/dst/themes/ddtm/images/logo.png"> </a>
            </div>
            <div class="box_search" style="float:left;width: 300px;height: 50px;margin: 25px 0 0 170px">
                <form action="">
                    <input type="text" placeholder="Search.." name="search">
                    <button type="submit">Submit</button>
                </form>
                
            </div>
            <div style="float:left;width: 300px;height: 50px;margin: 25px 0 0 150px;border: 1px solid #000000">
                <span>
                    <button>
                        <a href="login.jsp">Đăng Nhập & Đăng Ký</a>
                    </button>
                        <br> Tài khoản
                </span>
            </div>
        </div>
        
        <div class="topnav">
            <a href="#">Điện thoại</a>
            <a href="#">Samsung</a>
            <a href="#">Xiaomi</a>
            <a href="#">Oppo</a>
            <a href="#">Realme</a>
            <a href="#">Iphone</a>
            <a href="#">Ipad</a>
            <a href="#">Phụ kiện</a>
            <a href="#">Sữa chữa</a>
            <a href="#">Khuyến mại</a>
        </div>
