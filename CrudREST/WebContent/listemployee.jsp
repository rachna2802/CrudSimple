<%@page import="com.tm.model.Employee"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="style.css"/>
<title>Employee data</title>
</head>
<body>
<table>
<tr>EMPID</tr>
<td>EMPNAME</td>
<%List emplist=(java.util.ArrayList)request.getAttribute("emplist");
java.util.Iterator it=emplist.iterator();
while(it.hasNext()){
	com.tm.model.Employee e=(Employee)it.next();
	out.println(e.getEmp_id());
	out.println(e.getEmp_name());
}
%>
</table>
</body>
</html>