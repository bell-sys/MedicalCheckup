<%-- 
    Document   : healthCheckResult.jsp
    Created on : 2022/11/17, 10:11:38
    Author     : abi05
--%>

<%@page import="model.Health"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>診断結果</title>
    </head>
    <body>
        <%
            Health health = (Health)request.getAttribute("health");
        %>
            
            <h1>健康診断(スクリプトレット・スクリプト式)</h1>
            <p>
                身長：<%= health.getHeight() %><br>
                体重：<%= health.getWeight() %><br>
                BMI：<%= String.format("%.1f", health.getBmi()) %><br>

<!--                身長：<%= request.getParameter("height")%><br>
                体重：<%= request.getParameter("weight")%><br>
                BMI：<%= String.format("%.1f", request.getAttribute("bmi")) %><br>
                体系：-->
            </p>
            
              <h1>健康診断(EL式)</h1>    
              <p>
                身長：${health.height}<br>
                体重：${health.weight}<br>
                BMI：${health.bmiStr}<br>
                
            </p>
            <a href="/Test/HealthCheck">戻る</a>
    </body>
</html>
