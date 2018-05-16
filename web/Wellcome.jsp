<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WELLCOME</title>
    </head>
    <body style="background-color: indigo">
    <center> 
        <h1>
            <%  //evita acesso sem login via url
                if (session.getAttribute("name") == null) {
                    response.sendRedirect("Index.jsp");

                } else {
                    out.print("Bem vindo " + session.getAttribute("name"));
                }
            %>
        </h1>
        <div>
            <br>
            <form action="Tiago.jsp" method="POST">
                <input type="submit" value="TIAGO"  name="btnT" style="color: red" />
            </form>
            </br>
        </div>

        <div> 
            <br>
            <form action="Coelho.jsp" method="POST">
                <input type="submit" value="COELHO" name="btnC" style="color: lime"   />
            </form>
            </br>
        </div>
        <!--        <div>
                    <br>
                    <form action="ServletDecide" method="POST">
                        <input type="submit" value="TIAGO" name="btnT" style="color: red" />  <br></br>
                        <input type="submit" value="COELHO" name="btnC" style="color: lime  "   />
                    </form>
                    </br>
                                <br> <a style="color: red" href="ServletDecide">  PAGINA TIAGO</a>  </br>
                </div>-->

        <br>
        <form action="Servlet_out" method="post">
            <input type="submit" value="Logout"/>
        </form> 
        </br>

    </center>
</body>
</html>