<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Mahasiswa</title>
</head>
<body>
	<div align="center">
	
		<h1>New Mahasiswa</h1>
		<form:form action="save" method="post" modelAttribute="mahasiswa">
		
		<table cellpadding="5">
			<tr>
				<td>NIM</td>
				<td>: <form:input path="nim"></form:input></td>
			</tr>
			<tr>
				<td>Name</td>
				<td>: <form:input path="nama"></form:input></td>
			</tr>
			<tr>
				<td>Jurusan</td>
				<td>: <form:input path="jurusan"></form:input></td>
			</tr>
			<tr>
				<td>Tahun Masuk</td>
				<td>: <form:input path="tahun"></form:input></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Save"/></td>
			</tr>
		</table>
		
		</form:form>
		
	</div>

</body>
</html>