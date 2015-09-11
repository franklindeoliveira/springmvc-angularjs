<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
		<h2>Home</h2>
		Bem vindo ${usuario}!
		<form action="logout" method="post">
		    <input type="hidden"
		        name="${_csrf.parameterName}"
		        value="${_csrf.token}"/>
		    <button type="submit" class="btn">Log out</button>
		</form>
	</body>
</html>