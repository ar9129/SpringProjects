<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<div class="container">
	<h1>Welcome Mr. ${name}</h1>
	<hr>
	<h1>
		Enter Todo details:-
		</h2>

		<form:form method="post" modelAttribute="todo">
			<form:label path="description">Description</form:label>
			<form:input type="text" path="description" required="required" />
     TargetDate: <form:input type="LocalDate" path="targetDate"
				required="required" />
			<form:errors path="description" cssClass="text-warning" />
			<form:input type="int" path="id" />
			<form:input type="hidden" path="done" />
			<form:input type="String" path="username" />
			<input type="submit" class="btn btn-success" />
		</form:form>
</div>
<script scr="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<script scr="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>

<%@include file="common/footer.jspf"%>

