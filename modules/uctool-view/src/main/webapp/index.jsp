<%-- 
    Document   : index
    Created on : Aug 1, 2015, 5:54:03 PM
    Author     : agentmilindu
--%>
<%@page import="com.xtremenetworkx.UserManager"%>
<%@page import="com.xtremenetworkx.controllers.UserController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UC Tool</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
             String s = new UserManager().Test();
             
             out.print(s+new UserController().getUsers());
        %>
    </body>
</html>
