<%-- 
    Document   : index
    Created on : 8 abr 2021, 15:29:42
    Author     : arete
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><b>APLICACIÓN WEB</b></h1>
        
        <form action="calculo.jsp" method="post"> 
            <input type="text" name="nombre" id="input-nombre" placeholder="Ingresa tu nombre"> <br>
             <button type="submit" id="boton">Iniciar</button>
              <button type="button" id="salvar">Guardar</button>
              </form>
          
        <div id="resultado"></div>
        <script src="JScript/Cuestionario.js"></script>
    </body>
</html>

