<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<% 
int countPage = 0;
int countRequest = 0;
int countSession = 0;
int countApplication = 0;


countPage = countPage + 1 ;


int temp;

if(request.getAttribute("countRequest") != null ){
	temp = (int) request.getAttribute("countRequest");
}else{
	temp = 0;
}
countRequest = temp;
countRequest = countRequest + 1;
request.setAttribute("countRequest", countRequest);


if(session.getAttribute("countSession") != null ){
	temp = (int) session.getAttribute("countSession");;
}else{
	temp = 0;
}

countSession = temp;
countSession = countSession + 1;
session.setAttribute("countSession", countSession);


if(application.getAttribute("countApplication") != null ){
	temp = (int) application.getAttribute("countApplication");;
}else{
	temp = 0;
}
countApplication = temp;
countApplication = countApplication + 1;
application.setAttribute("countApplication", countApplication);

%>


<%=countPage %><br> 
<%=countRequest %><br>
<%=countSession %><br>
<%=countApplication %><br>
</body>
</html>