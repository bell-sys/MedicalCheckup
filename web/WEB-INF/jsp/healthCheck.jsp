<%-- 
    Document   : OK
    Created on : 2022/11/16, 11:20:05
    Author     : abi05
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>健康診断</title>
    </head>
    <body>
            <h1>健康診断</h1>
        <form method="POST" action="HealthCheck">               
                身長：<input type="text" name="height">(cm)<br>
                体重：<input type="text" name="weight">(kg)<br>
                <input type="submit" value="診断">
            </form>
        

    </body>
</html>
