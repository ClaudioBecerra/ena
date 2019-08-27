
<%@ page import="java.util.ArrayList" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--
    Document   : IngresarRequerimiento
    Created on : 21-ago-2019, 21:02:00
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
                <h3 class="panel-title">Ingresar Requerimiento</h3>
            </div>
            <div class="panel-body">
                <div class="col-lg-12">
                    <fieldset>
                        <div class="col-lg-12">
                            <div class="form-group">

                                <form action="Requerimiento" method="get">
                                    <label>Gerencia : </label>

                                    <select name="comboGerencia" onchange="this.form.submit()">
                                        <option value="0"> Seleccionar</option>
                                        <c:forEach items="${requestScope.listaGer}" var="item">
                                            <option value="${item.id}" ${requestScope.valorG==item.id?"selected":""} >
                                                    ${item.tipo}
                                            </option>
                                        </c:forEach>
                                    </select>


                            </div>
                        </div>
                        <div class="col-lg-12">
                            <div class="form-group">
                                <label>Depto : </label>

                                <select name="comboDepartamento" onchange="this.form.submit()">
                                    <option value="0"> Seleccionar</option>
                                    <c:forEach items="${requestScope.listaDep}" var="item">
                                        <option value="${item.idDepartamento}" ${requestScope.valorD==item.idDepartamento?"selected":""} >
                                                ${item.descripcion}
                                        </option>
                                    </c:forEach>
                                </select>

                            </div>
                        </div>
                        <div class="col-lg-12">
                            <div class="form-group">
                                <label>Asignar a : </label>
                                <select name="comboAsigna" onchange="this.form.submit()">
                                    <option value="0"> Seleccionar</option>
                                    <c:forEach items="${requestScope.listaAsi}" var="item">
                                        <option value="${item.idDepartamento}" ${requestScope.valorA==item.idDepartamento?"selected":""} >
                                                ${item.descripcion}
                                        </option>
                                    </c:forEach>
                                </select>

                            </div>
                        </div>
                        <div class="col-lg-12">
                            <div class="form-group">

                                <label>Encargado : </label>
                                <select name="comboUsuario" onchange="this.form.submit()">
                                    <option value="0"> Seleccionar</option>
                                    <c:forEach items="${requestScope.listaUse}" var="item">
                                        <option value="${item.rut}" ${requestScope.valorU==item.rut?"selected":""} >
                                                ${item.nombre}
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="col-lg-12">
                            <div class="form-group">
                                <label>Requerimiento : </label>
                                <div>
                                    <textarea name="comentarios" rows="10" cols="40" placeholder="Aqui va tu requerimiento"></textarea>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="form-group">
                                <input type="button" value="Guardar" onclick="this.form.method='POST';this.form.submit()">
                                </form>
                                <input type="button" class="btn btn-primary" value="Volver al Menú" onclick="location = 'menuPrincipal.jsp'"/>
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