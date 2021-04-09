<%-- 
    Document   : calculo
    Created on : 8 abr 2021, 15:30:19
    Author     : arete
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.mostrarResultado" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Cookie ck[] = request.getCookies();
            if (ck != null){
                for (int i =0; i < ck.length; i++) {
                    if(ck[i].getName().equals("AREA")){
                       out.print("<h2>La área anterior es: " + ck[i].getValue() + "");
                    }
                     if(ck[i].getName().equals("PERIMETRO")){
                        out.print("<h2>El perímetro anterior es: " + ck[i].getValue() + "");
                    }
                }
                
            }
            if (request.getAttribute("flag") != null) {
                out.print("<h1>No puedes digitar numeros negativos</h1>");
            }
        %>
        <h1>APLICACIÓN WEB</h1>
        
        <form action="mostrarResultado" method="post"> 
            <label>Base: </label> <br>
            <input type="text" name="numero1" placeholder="Ingresa la base"> <br>
            <label>Altura: </label> <br>
            <input type="text" name="numero2" placeholder="Ingresa la altura"> <br>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
