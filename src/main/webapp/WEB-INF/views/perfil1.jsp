<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<!-- Bibliotecas CSS -->
		
		<!-- Bootstrap -->
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/lib/bootstrap-3.3.5/bootstrap.min.css" />"></link>
		
		<!-- Optional theme -->
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/lib/bootstrap-3.3.5/bootstrap-theme.min.css" />"></link>
		
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	    <!--[if lt IE 9]>
	      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	    <![endif]-->
	    
	    <!-- CSS -->
		
	    
	</head>
	<body>
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-4 col-sm-4 col-md-offset-4 col-sm-offset-4">
					<div class="row">
						<div class="col-md-12">
							<h1>PERFIL1</h1>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p>
								Página acessível apenas para usuário com o perfil de acesso "PERFIL1".
							</p>
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
		<script type="application/javascript" src="<c:url value="/resources/lib/bootstrap-3.3.5/bootstrap.min.js" />"></script>
		
		<!-- JS -->
		
		
	</body>
</html>