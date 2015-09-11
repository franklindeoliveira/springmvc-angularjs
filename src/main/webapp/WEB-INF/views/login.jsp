<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
		<h2>Login</h2>
		<form action="login" method="post">
		    <c:if test="${param.error != null}">
		        <p>
		            Credênciais inválidas.
		        </p>
		    </c:if>
		    <c:if test="${param.logout != null}">
		        <p>
		            Logout efetuado com sucesso.
		        </p>
		    </c:if>
		    <p>
		        <label for="username">Username</label>
		        <input type="text" id="username" name="username"/>
		    </p>
		    <p>
		        <label for="password">Password</label>
		        <input type="password" id="password" name="password"/>
		    </p>
		    <input type="hidden"
		        name="${_csrf.parameterName}"
		        value="${_csrf.token}"/>
		    <button type="submit" class="btn">Log in</button>
		</form>
	</body>
</html>