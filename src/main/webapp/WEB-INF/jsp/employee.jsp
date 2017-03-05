<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp" />
<div class="ui segment">
	<h1>Employee Page</h1>

	<table class="ui sortable celled table">
		<thead>
			<tr>
				<th class="sorted descending">Id</th>
				<th class="">Name</th>
				<th class="">Position</th>
				<th class="">Address</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allEmployees}" var="employee">
				<tr>
					<td>${employee.id}</td>
					<td>${employee.name}</td>
					<td>${employee.position}</td>
					<td>${employee.address}</td>
				</tr>
			</c:forEach>
	</table>
</div>

<jsp:include page="footer.jsp" />
