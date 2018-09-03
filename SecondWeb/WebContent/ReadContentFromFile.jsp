<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.io.*, java.net.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display</title>
</head>
<body>
	<%
		String fileName = "/WEB-INF/Data.txt";
		InputStream ins = application.getResourceAsStream(fileName);
		try {
			if (ins == null) {
				response.setStatus(response.SC_NOT_FOUND);
			} else {
				BufferedReader br = new BufferedReader((new InputStreamReader(ins)));
				String line;
				out.println("<table border = 2>");
				out.println("<th>Name</th>");
				out.println("<th>Email</th>");
				out.println("<th>Mobile</th>");
				while ((line = br.readLine()) != null) {
					
					for (int i = 0; i < 1 ; i++){
						out.println("<tr>" );
						String data[] = line.split(",");
						for (String value : data) {
					        out.println("<td>" + value + "</td>");
					    }
					    out.println("</tr>" );
					}
				}
				out.println("</table>");
			} 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			out.println(e.getMessage());
		}
	%>
</body>
</html>