<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
	<head>
		<!-- Bibliotecas CSS -->
		
		<!-- Bootstrap -->
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/lib/bootstrap-3.3.5/css/bootstrap.min.css" />"></link>
		
		<!-- Optional theme -->
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/lib/bootstrap-3.3.5/css/bootstrap-theme.min.css" />"></link>
		
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	    <!--[if lt IE 9]>
	      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	    <![endif]-->
	    
	    <!-- CSS -->
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/global.css" />"></link>
	    
	</head>
	<body>
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-4 col-sm-4 col-md-offset-4 col-sm-offset-4">
					<div class="row">
						<div class="col-md-12">
							<h1>Cadastro</h1>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<form action="cadastro" method="post" data-toggle="validator">
								<form:errors cssClass="mensagemErro" path="usuario.nome" ></form:errors>
								<div class="form-group has-feedback">
									<label for="nome">Nome</label>
						        	<input class="form-control" name="nome" id="nome" class="form-control" placeholder="Nome" value="${usuario.nome}" required>
						        	<span class="glyphicon form-control-feedback" aria-hidden="true"></span>
							    </div>
							    <form:errors cssClass="mensagemErro" path="usuario.email"></form:errors>
								<div class="form-group has-feedback">
									<label for="email">Email</label>
						        	<input name="email" id="email" class="form-control" placeholder="Email" value="${usuario.email}" required>
						        	<span class="glyphicon form-control-feedback" aria-hidden="true"></span>
							    </div>
							    <form:errors cssClass="mensagemErro" path="usuario.senha"></form:errors>
							    <div class="form-group has-feedback">
							    	<label for="senha">Senha</label>
						        	<input type="password" id="senha" name="senha" class="form-control" placeholder="Senha" value="${usuario.senha}" required>
						        	<span class="glyphicon form-control-feedback" aria-hidden="true"></span>
							    </div>
							    <input class="btn btn-default" type="submit" value="Cadastrar">
							    <input type="hidden"
							        name="${_csrf.parameterName}"
							        value="${_csrf.token}"/>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<!-- Biblotecas JS -->
		
		<!-- Jquery -->
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script type="application/javascript" src="<c:url value="/resources/lib/jquery-1.11.3.min.js" />"></script>
		
		<!-- Bootstrap -->
		<!-- Latest compiled and minified JavaScript -->
		<script type="application/javascript" src="<c:url value="/resources/lib/bootstrap-3.3.5/js/bootstrap.min.js" />"></script>
		
		<!-- Bootstrap Validator -->
		<script type="application/javascript" src="<c:url value="/resources/lib/validator.min.js" />"></script>
		
		<!-- JS -->
		
		<!-- JS da tela de cadastro de usuários -->
		<script type="application/javascript" src="<c:url value="/resources/js/cadastro.js" />"></script>
		
	</body>
</html>