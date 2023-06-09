<%@include file="common/header.jspf"%>

<%@include file="common/navigation.jspf"%>

<div class="container">
	<h1>Welcome Mr. ${name}</h1>
	<hr>
	<h1>
		Your Todos are:-
		</h2>

		<table class="table">

			<thead>
				<tr>
					<th>id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
						<td><a href="delete-todo?id=${todo.id}"
							Class="btn btn-warning">Delete</a></td>
						<td><a href="update-todo?id=${todo.id}"
							Class="btn btn-success">update</a></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>

		<a href="add-todo" class="btn btn-success"> Add ToDo</a>
</div>
<script scr="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<script scr="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>

<%@include file="common/footer.jspf"%>

