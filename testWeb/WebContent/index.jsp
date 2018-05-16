<%@ taglib prefix="h" uri="/WEB-INF/util.tld"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>
	<c:out value="Bonjour !" />
</p>


	<c:set var="variable" value="Mateo21" scope="page" />
	
	Var :<h:TagTest message="${ variable }" /><br>
	
	
	<p><c:out value="${ variable }">Valeur par défaut</c:out></p>
<p><h:Hello message = "This is custom tag" /></p>
<p><c:out value="${h:sayHello('Baptiste')}" /></p>

<c:forEach begin="1" end="4" var="i">
<c:out value="${i}"/><br>
</c:forEach>

</body>
</html>