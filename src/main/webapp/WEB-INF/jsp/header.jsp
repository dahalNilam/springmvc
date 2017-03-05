<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css"></link>
<title>Spring Boot JSP</title>
</head>

<body>

	<div class="ui pointing menu">
		<a href = "/" class="active item"> Home </a> 
		<a href = "/employees" class="item"> Employee </a>
		<a href = "/addresses" class="item"> Address </a>
		<div class="right menu">
			<div class="item">
				<div class="ui transparent icon input">
					<input type="text" placeholder="Search..." /> <i
						class="search link icon"></i>
				</div>
			</div>
		</div>
	</div>