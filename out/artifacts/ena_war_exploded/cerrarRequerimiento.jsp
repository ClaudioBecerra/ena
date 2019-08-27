<%-- 
    Document   : cerrarRequerimiento
    Created on : 21-ago-2019, 23:42:17
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

                <form action="cargarTabla.jsp"  method="post">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">Cerrar Requerimiento</h3>
                        </div>
                        <div class="panel-body">
                            <div class="col-lg-12">
                                <fieldset>
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <label>Gerencia : </label>      
                                            <select name="comboGerencia">
                                                <option value="Uno"> Uno</option>
                                                <option value="Dos"> Dos</option>
                                                <option value="Tres"> Tres</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <label>Depto : </label>
                                            <select name="comboDepartamentoSolicita">
                                                <option value="1"> Seleccionar Departamento...</option>
                                                <option value="2"> Ventas</option>
                                                <option value="3"> RRHH</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label>Asignar a : </label>
                                            <select name="comboDepartamentoSolicita">
                                                <option value="Uno"> Uno</option>
                                                <option value="Dos"> Dos</option>
                                                <option value="Tres"> Tres</option>
                                            </select>
                                            <input type="submit" class="btn btn-dark" value="Buscar"/>
                                        </div>
                                    </div>

                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <table border="1">

                                                <tr>
                                                    <th>Col.Cab.1</th>
                                                    <th>Col.Cab.2</th>
                                                    <th>Col.Cab.3</th>
                                                    <th>Col.Cab.4</th>
                                                    <th></th>
                                                </tr>
                                                <tr>
                                                    <td>Celda 1</td>
                                                    <td>Celda 2</td>
                                                    <td>Celda 3</td>
                                                    <td>Celda 4</td>
                                                    <td><input type="button" class="btn btn-danger" value="Cerrar" /></td>
                                                </tr>
                                            </table>
                                        </div>
                                    </div>


                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <input type="button" class="btn btn-primary" value="Volver al Menú" onclick="location = 'menuPrincipal.jsp'"/>
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
