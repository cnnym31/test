<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta http-equiv="Content-Style-Type" content="text/css"/>
		<meta http-equiv="Content-Script-Type" content="text/javascript"/>
		<meta http-equiv="imagetoolbar" content="no"/>
		<meta name="description" content=""/>
		<meta name="keywords" content=""/>
		<link rel="stylesheet" href="./css/style.css">
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		<title>UserUpdate画面</title>

		<script type="text/javascript">
			function submitAction(url){
				$('form').attr('action', url);
				$('form').submit();
			}
		</script>
	</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<p>UserUpdate</p>
		</div>

		<div>
			<s:form action="UserUpdateConfirmAction">
			<table>
				<tr>
					<td><label>ログインID:</label></td>
					<td><input type="text" name="loginId" value='<s:property value="#session.loginId"/>'/></td>
				</tr>
				<tr>
					<td><label>ログインPASS:</label></td>
					<td><input type="text" name="loginPassword" value='<s:property value="#session.loginPassword"/>'/></td>
				</tr>
				<tr>
					<td><label>ユーザー名：</label></td>
					<td><input type="text" name="userName" value='<s:property value="#session.userName"/>'/></td>
				</tr>
				<s:submit value="更新"/>
			</table>
			</s:form>

			<div>
				<span>前画面に戻る場合は</span>
				<a href='<s:url action="GoUserListAction"/>'>こちら</a>
				<br>
				<span>管理者画面に戻る場合は</span>
				<a href='<s:url action="GoAdminPage"/>'>こちら</a>
			</div>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>