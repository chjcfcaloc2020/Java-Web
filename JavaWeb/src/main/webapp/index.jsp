<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Khai bao</title>
</head>
<body>
	<h2>Khai bao thong tin sinh vien</h2>
	<form action="" method="post">
		<table>
			<tr>
				<td>So CMND:</td>
				<td><input type="text" name="cmnd" required /></td>
			</tr>
			<tr>
				<td>Ma Truong:</td>
				<td><input type="text" name="ma_truong" required /></td>
			</tr>
			<tr>
				<td>Ma Nganh:</td>
				<td><input type="text" name="ma_nganh" required /></td>
			</tr>
			<tr>
				<td>Ho va Ten:</td>
				<td><input type="text" name="ten" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td>So DT:</td>
				<td><input type="text" name="so_dt" /></td>
			</tr>
			<tr>
				<td>Dia Chi:</td>
				<td><input type="text" name="dia_chi" /></td>
			</tr>
			<tr>
				<td>He TN:</td>
				<td><input type="text" name="he_tn" /></td>
			</tr>
			<tr>
				<td>Ngay TN:</td>
				<td><input type="date" name="ngay_tn" /></td>
			</tr>
			<tr>
				<td>Loai TN:</td>
				<td><input type="text" name="loai_tn" /></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="Khai bao" />
	</form>
</body>
</html>