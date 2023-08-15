<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<div align="center">
	
		<h1>Data Mahasiswa</h1>
		<h3><a href="new">New Contact</a></h3>
		<table border="1" cellpadding="5">
			<tr>
				<th>Nim</th>
				<th>Nama</th>
				<th>Jurusan</th>
				<th>Tahun Masuk</th>
			</tr>
			
			<c:forEach items="${listMahasiswa}" var="mahasiswa">
				<tr>
					<td>${mahasiswa.nim}</td>
					<td>${mahasiswa.nama}</td>
					<td>${mahasiswa.jurusan}</td>
					<td>${mahasiswa.tahun}</td>
				</tr>
			</c:forEach>
		
		</table>
		
	</div>
</body>
</html>