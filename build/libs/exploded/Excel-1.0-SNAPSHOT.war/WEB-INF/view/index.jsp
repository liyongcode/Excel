<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.js"></script>
</head>
<body>
    <input type="button" value="导出数据" onclick="download()"/>
    <a href="download_customer.do">导出数据</a>

    <script>
        function download(){
            var url="download_customer.do";
            window.open(url);
        }
    </script>
</body>
</html>
