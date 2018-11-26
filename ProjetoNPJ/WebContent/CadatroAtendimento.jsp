<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Atendimento</title>
<link href="Cadastro Atendimento/estilo.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		$('#pesquisar').click(function() {
			$.ajax({
				url: "npjControle",
				type: "post",
				data: {
					primeiroNome : $('#nome').val(), 
					acao: "consultarPessoa",
					CPF : $('#cpf').val()
					
					},
				success: function(response) {
					alert('oi');
					$('#teste').html(response);
					}
				})

		})
	})
</script>
<body>
	<form>
	<input type="hidden" name="acao" value="consultarPessoa">
		<h2>Cadastro Atendimento</h2>
		<div>
			<br> Nome: <input type="text" id="nome" name="nome" size=40px /> <br>
			<br> CPF: <input type="text" id="cpf" name="cpf" size="10" maxlength="11">
			<span id="teste"></span>
			<br> <br>
			<center>
				<button type="submit" id="pesquisar" class="btn btn-primary">Pesquisar</button>
				<button type="submit" class="btn btn-primary">
					<a href="http://localhost:8080/ProjetoNPJ/cadastroPessoa.jsp">
						Cadastrar Pessoa</a>
				</button>
			</center>
			<br>

			<table border>
				<tr>
					<th>Nome
					<th>CPF
					<th>Adicionar
					<th>Editar
				</tr>
				<tr>
					<td>Lula Lula</td>
					<td>825.465.789-95</td>
					<td><input type="radio" name="adicionar">Adicionar
					<td><button type="submit" name="editar">Editar</button>
				</tr>
			</table>
			<p>Relato do Fato:</p>
			<input class="relato" type="text" name="Relato" size=40px /> <br>
			<br>
			<center>
				<button type="submit" class="btn btn-primary">Adicionar</button>
			</center>
			<br>
		</div>
	</form>
</body>
</html>