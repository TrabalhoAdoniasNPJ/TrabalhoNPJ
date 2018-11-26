<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</head>
<body>

<div class="container">

<h2>Cadastro de Pessoa</h2>

<form action="npjControle" method="POST" >
<input type="hidden" name="action" value="cadastroPessoa">


	<div class="col">
		<label for="name">Nome: 
			<input type="text" class="form-control" name="nome" id="nome">
		</label>
	</div>

	<div class="col">
		<label for="cpf">CPF: 
			<input type="text" class="form-control" name="cpf" id="cpf">
		</label>
	</div>

	<div class="col">
		<label for="cep">CEP: 
			<input type="text" class="form-control" name="cep" id="cep">
		</label>
	</div>

	<div class="col">
		<label for="logra">Logradouro: 
			<input type="text" class="form-control" name="logradouro" id="logra">
		</label>
	</div>

	<div class="col">	
		<label for="complemento">Complemento: 
			<input type="text" class="form-control" name="complemento" id="complemento">
		</label>
	</div>

	<div class="col">
		<label for="numero">Numero: 
			<input type="text" class="form-control" name="numero" id="numero">
		</label> 
		<label>Bairro: 
			<input type="text" class="form-control" name="bairro" id="bairro">
		</label>
	</div>

	<div class="col">
		<label for="estado">UF: 
			<input type="text" class="form-control" name="estado" id="estado"></label>
		<label>Municipio: 
			<input type="text" class="form-control" name="municipio" id="municipio">
		</label>
	</div>

	<div class="col">
		<label for="email">E-mail: 
			<input type="email" class="form-control" name="email" id="email">
		</label>
		
		<label>Telefone: 
			<input type="text" class="form-control" name="telefone" id="telefone">
		</label>
	</div>

<input class="btn btn-secundary" type="button" value="Voltar" name="voltar" id="voltar"> <button class="btn btn-primary" type="submit" name="salvar" id="salvar">Salvar</button>
</form>


</div>
</body>
</html>