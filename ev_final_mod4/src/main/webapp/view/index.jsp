<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <!--  <meta name="viewport" content="width=device-width, initial-scale=1.0">  -->

    <title>EVALUACION FINAL MOD4</title>
     <!--LLAMAR A BOOTSTRAP-->
   <!--  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"-->
   <!--  rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
     -->
    
    <!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    
    <!--FONT AWESOME-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">      
    <!--FONT OSWALD-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Oswald:wght@400;500&display=swap" rel="stylesheet">
    <!--LLAMAR CSS-->
    <!-- <link rel="stylesheet" href="${pageContext.request.contextPath}/view/css/estilos.css"> -->
</head>
<body class="bg-light">

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
            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/FacilitadorServlet">FACILITADOR</a></li>
            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/EstudianteServlet">ESTUDIANTE</a></li>
            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/CursoServlet">CURSO</a></li>
            <li><a class="dropdown-item disabled" href="#">MATRICULA</a></li>
          </ul>
       	</li>
       </ul>
    </div>
  </div>
</nav>

<hr>



<div class="row mt-4">
  <div class="col align-self-start">			
  </div>
  <div class="col align-self-center">
  			<h1>DESARROLLO DE APLICACIONES</h1>
    		<h1>FULL STACK JAVA TRAINNE</h1>
    		<h2>RLAB-21-02-05-0008-1</h2>
    		<h2>ERICK ALEXIS GODOY ROJAS</h2>
  </div>
	<div class="col align-self-end">      		
	</div>
</div>

    
<br><br><br>


<%@include file="foot.jsp" %> 
    
    
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