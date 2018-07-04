<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>

<html>

<head>
	<title>Customer Registration Form</title>
</head>

<body>

Fill out the form.

	<form:form action="processForm" modelAttribute="customer" >
	
		First name: <form:input path="firstName" />
		
		<br><br>
		
		Last name (*): <form:input path="lastName" />
		<form:errors path="LastName" cssClass="error" />
	
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>

</body>


</html>