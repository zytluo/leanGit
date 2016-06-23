<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body style="text-align: center;">
    <h1>雇员管理系统</h1>
    <div style="text-align: center;width: 500px;height: 500px;">
    <form action="/MySSH/login.do?flag=login" method="post"> 
        <table style="width: 251px;">
              <tr>
                   <td align="left">UserName：</td><td><input id="username" type="text" name="username"/></td>
             
              </tr>
              <tr>
              		<td align="left">PassWord:</td><td><input id="password" type="password" name="password"/></td>
              </tr>
              <tr>
                   <td  align="center" colspan="2"><input type="submit" value="login"><input type="button" value="cancel"></td>                        
              </tr>
        </table>
    </form>
    </div>
  </body>
</html>
