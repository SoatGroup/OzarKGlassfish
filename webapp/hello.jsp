<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <link href="${mvc.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${mvc.contextPath}/js/jquery.js"></script>
    <script src="${mvc.contextPath}/js/bootstrap.min.js"></script>

	</head>

<body>

	<div>
		Message test : ${helloWorld.message} !
	</div>
	
	
</body>
</html>