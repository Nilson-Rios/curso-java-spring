<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF8">
<title>Página Nome Profissão</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
</head>
<body>
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">Cadastro</div>
			<div class="panel-body">
				<form action="FormularioProfissao">
					<fieldset>
						<div class="form-group">
							<label>Nome</label> <input type="text" class="form-control" name="nome" required>
						</div>
						<div class="form-group">
							<label>Profissão</label> <input type="text" class="form-control" name="profissao" required>
						</div>
					</fieldset>
					<input type="submit" name="Salvar" class="btn btn-primary">
				</form>
			</div>
		</div>
</body>
</html>