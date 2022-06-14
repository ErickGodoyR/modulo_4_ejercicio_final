<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Ingresar Estudiante</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
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
            OPCION	
          </a>
          <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/EstudianteServlet">VOLVER</a></li>
          </ul>
       	</li>
       </ul>
    </div>
  </div>
</nav>



	<div class="container-fluid">
		<h1 class="text-sm-center text-md-center text-lg-center text-xl-center fs-3 text-decoration-underline">Ingresar/Actualizar Facilitador</h1>
				
		<form class="card border-info" action="${pageContext.request.contextPath}/AgregarFacilitadorServlet" method="post">
			<input type="hidden" name="id" id="id" value="${facilitador.getId()}">
			
			<div class="row mt-4">
    			<div class="col align-self-start col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4">
      				<label for="rut" class="form-label">Rut</label> <input
					type="text" class="form-control text-sm-center text-md-center text-lg-center text-xl-center" name="rut" id="rut"
					placeholder="Ingresa rut" value="${facilitador.getRut()}" required>
    			</div>
    			<div class="col align-self-center col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4">
      				<label for="nombre" class="form-label">Nombre</label> <input
					type="text" class="form-control text-sm-center text-md-center text-lg-center text-xl-center" id="nombre" name="nombre"
					placeholder="Ingresa Nombre" value="${facilitador.getNombre()}" required>
    			</div>
   			 	<div class="col align-self-end col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4">
      				<label for="email" class="form-label">Email</label> <input
					type="email" class="form-control text-sm-center text-md-center text-lg-center text-xl-center" id="email" name="email"
					placeholder="Ingresa Email" value="${facilitador.getEmail()}" required>
    			</div>
  			</div>
  			
  			<div class="row mt-4">
  				<div class="col align-self-start col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4">
					<label for="telefono" class="form-label">Telefono</label> <input
					type="text" class="form-control text-sm-center text-md-center text-lg-center text-xl-center" id="telefono" name="telefono"
					placeholder="Ingresa Telefono" value="${facilitador.getTelefono()}" required>
    			</div>
    			<div class="col align-self-center col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4">
    				<label for="valorhora" class="form-label">Valor Hora</label> <input
					type="number" step="0.01" class="form-control text-sm-center text-md-center text-lg-center text-xl-center" id="valorhora" name="valorhora"
					placeholder="Ingresa Telefono" value="${facilitador.getValorhora()}" required>
    			</div>
    			<div class="col align-self-end col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4">
 					<label for="banco" class="form-label">Banco</label> <input
					type="text" class="form-control text-sm-center text-md-center text-lg-center text-xl-center" id="banco" name="banco"
					placeholder="Ingresa Telefono" value="${facilitador.getBanco()}" required>     		
    			</div>
			</div>
			
			<div class="row mt-4">
  				<div class="col align-self-start  col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4">
					<label for="ctabancaria" class="form-label">Cta Bancaria</label> <input
					type="text" class="form-control text-sm-center text-md-center text-lg-center text-xl-center sm-3" id="ctabancaria" name="ctabancaria"
					placeholder="Ingresa Telefono" value="${facilitador.getCtabancaria()}" required>
    			</div>
    			<div class="col align-self-center col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4">
    				<label for="last_update" class="form-label">Ultima Actualizacion</label> <input
					type="text" class="form-control" id="last_update" name="last_update"
					placeholder="Actuaizacion Ingreso" value="${facilitador.getLast_update()}" readonly>
    			</div>
    			<div class="col align-self-end">
 					     		
    			</div>
			</div>
			
			<div class="row mt-4">
  				<div class="col align-self-start">
					
    			</div>
    			<div class="col align-self-center">
    				<button class="btn btn-primary mb-3" type="submit">Agregar/Modificar</button>
    			</div>
    			<div class="col align-self-end">
      		
    			</div>
			</div>

		</form>
	</div>

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