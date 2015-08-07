<%-- 
    Document   : index
    Created on : Aug 1, 2015, 5:54:03 PM
    Author     : agentmilindu
--%>
<%@page import="com.cisco.axl.api._10.LUser"%>
<%@page import="java.util.List"%>
<%@page import="com.xtremenetworkx.UserManager"%>
<%@page import="com.xtremenetworkx.controllers.UserController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UC Tool!</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
             List<LUser> users = new UserManager().Test();
             for(LUser user : users){
                out.print("<li>"+user.getFirstName()+"</li>");
             }
             //new UserController().addUser();
             for(LUser user : new UserController().getUsers()){
                out.print("<li>"+user.getFirstName()+"</li>");
             }
        %>
    </body>
</html>
