<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


    <form action="mailto:correo@dominio.com" method="post" enctype="text/plain">
      <fieldset><legend>Consultar de Atendimento</legend><p>Numero: <input type="text" numero="numero" size="20" maxlength="15">
      Situacao: <input type="text" name="apellidos" size="43" maxlength="30"></p>
      <p> Parte: <input type="text" name="apellidos" size="80"> 
      <p>CPF: <input type="text" name="apellidos" size="12">
      <br><br>
      <input type="hidden" name="datosformulario"> 
        <span>Periodo de Registro</span>
          <input type="date">
        
        <span>a</span>
          <input type="date">
        </li>
      <br>
      <center>
      <button type="submit">Pesquisar</button>
      <button type="button">Voltar</button>
      </center>
      <br><br>
      <table class="table" border="1">
  <thead>
    <tr>
      <th scope="col">Nome</th>
      <th scope="col">Data Registro</th>
      <th scope="col">Area</th>
      <th scope="col">Partes</th>
      <th scope="col">Situaçao</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row"></th>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <th scope="row"></th>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <th scope="row"></th>
      <td></td>
      <td></td>
      <td></td>
    </tr>
  </tbody>
</table>
      

  

</body>
</html>