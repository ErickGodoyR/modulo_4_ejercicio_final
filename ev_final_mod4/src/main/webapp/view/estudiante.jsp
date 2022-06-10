<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<%@ page import = "java.util.Date,java.text.*" %>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->  
 
<title>LISTA DE ESTUDIANTES</title>

<!-- SWEET ALERT 2 -->
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<!-- CSS only -->


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>


<!-- CSS -->
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css">

<!-- JS -->
 <script
	src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script> 
<script src="https://kit.fontawesome.com/81a2ed02b0.js"
	crossorigin="anonymous"></script>

</head>




<body>

<!-- NUEVO MENU  -->
<nav class="navbar navbar-expand-lg navbar-dark bg-secondary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">MOD4</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
      <ul class="navbar-nav">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle " href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            OPCION NAVEGACION
          </a>
          <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
          	<li><a class="dropdown-item" href="${pageContext.request.contextPath}/PrincipalServlet">INICIO</a></li>
            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/FacilitadorServlet">FACILITADOR</a></li>
            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/CursoServlet">CURSO</a></li>
            <li><a class="dropdown-item disabled" href="#">MATRICULA</a></li>
          </ul>
       	</li>
       </ul>
    </div>
  </div>
</nav>



<div class="container-fluid">
	
	<h1 class="text-sm-center text-md-center text-lg-center text-xl-center fs-3 text-decoration-underline">LISTA DE ESTUDIANTES</h1>
	
	
	<a href="${pageContext.request.contextPath}/AgregarEstudianteServlet"
			class="btn btn-primary">Nuevo Estudiante</a>
		
	
	<div class="row">
		<div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
			<table id="tblestudiantes" class="table">
			<thead class="table-dark">
				<tr>
					<th>Id</th>
					<th>Rut</th>
					<th>Nombre</th>
					<th>Email</th>
					<th>Telefono</th>
					<th>Ultima Actualizacion</th> 
					<th>Editar</th>
					<th>Eliminar</th> 
				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${estudiante}">
					<tr>
						<td><c:out value="${e.getId()}"></c:out></td>
						<td><c:out value="${e.getRut()}"></c:out></td>
						<td><c:out value="${e.getNombre()}"></c:out></td>
						<td><c:out value="${e.getEmail()}"></c:out></td>
						<td><c:out value="${e.getTelefono()}"></c:out></td>
						<td> <c:out value = "${e.getLast_update()}"/></td>
						<td>
						
							 <a
							href="${pageContext.request.contextPath}/AgregarEstudianteServlet?id=${e.getId()}"
							class="btn btn-secondary"><i
								class="fa-solid fa-pen-to-square"></i></a>
						</td>
						<td>
								 <a
							href="${pageContext.request.contextPath}/AgregarEstudianteServlet?id=${e.getId()}&op=del"
							class="btn btn-secondary"><i class="fa-solid fa-trash"></i></a>							
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		</div>
	</div>
</div>

<br><br><br>


<%@include file="foot.jsp" %> 


	<script>
		$(document).ready(function() {
			$('#tblestudiantes').DataTable();
		});
	</script>

	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js"
		integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
		integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
		crossorigin="anonymous"></script>
</body>


</html>

