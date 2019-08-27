<%-- 
    Document   : index
    Created on : 20-ago-2019, 20:17:31
    Author     : JMaick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            h2{
                color: red;
            }
        </style>
    </head>
    <body>
        <%
            String mensaje = (String) session.getAttribute("mensaje");
            if (mensaje != null) {
                out.print("<h2>" + mensaje + "</h2>");
                session.setAttribute("mensaje", null);
            }
        %>

        <div class="row">
            <div style="padding: 20px;" class="col-lg-12">

                <form action="Inicio" method="post">

                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">Bienvenido</h3>
                        </div>
                        <div class="panel-body">
                            <div class="col-lg-12">
                                <fieldset>
                                    <legend>Login</legend>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label>Usuario: </label>
                                            <input type="text" name="nombreUsuario"  class="form-control input-sm"  placeholder="Ingresa tu nombre Usuario" />
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label>Password: </label>
                                            <input type="password" name="password" class="form-control input-sm" placeholder="Ingresa tu password" />
                                        </div>
                                    </div>
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <input type="submit" class="btn btn-success" value="Login" />
                                        </div>
                                    </div>
                                </fieldset>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
