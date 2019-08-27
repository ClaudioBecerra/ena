<%-- 
    Document   : menuPrincipal
    Created on : 20-ago-2019, 21:01:42
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
    </head>
    <body>
        <div class="row">
            <div style="padding: 20px;" class="col-lg-12">



                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">Menú Principal</h3>
                        </div>
                        <div class="panel-body">
                            <div class="col-lg-12">
                                <fieldset>
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <form action="Requerimiento" method="get">
                                                <input type="submit" class="btn btn-primary" value="Ingresar Requerimiento" />
                                            </form>

                                        </div>
                                    </div>
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <input type="button" class="btn btn-primary" value="Consultar Requerimiento" onclick="location = 'consultarRequerimiento.jsp'"/>
                                        </div>
                                    </div>
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <input type="button" class="btn btn-primary" value="Cerrar Requerimiento" onclick="location = 'cerrarRequerimiento.jsp'"/>
                                        </div>
                                    </div>
                                </fieldset>
                            </div>
                        </div>
                    </div>

            </div>
        </div>
    </body>
</html>
