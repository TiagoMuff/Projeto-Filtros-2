<%-- 
    Document   : Tiago.jsp
    Created on : 12/05/2018, 11:02:36
    Author     : USUSARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TIAGO</title>
    </head>

    <body style="background-image:url('14125147o_o.png')">
    <center>
        <h1 style="color: red"> <br> 
            <%  //evita acesso sem login via url
                if (session.getAttribute("name") == null) {
                    response.sendRedirect("Index.jsp");

                } else {
                    out.print("Bem vindo" + session.getAttribute("name"));
                }
            %>
            </br></h1>

        <h1> <br>
            <a href="Wellcome.jsp">VOLTAR</a>
            </br> </h1> 

        <form action="Servlet_out" method="post">
            <input type="submit" value="Logout"/>
        </form> 

    </center>
</body>
</html>
