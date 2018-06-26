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
		<title>Admin画面</title>

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
			<p>管理者Page</p>
		</div>

		<div>
			<h3>===ユーザー情報===</h3>
			<s:form>
				<input type="button" value="新規登録" onclick="submitAction('UserCreateAction')"/><br><br>
				<input type="button" value="ユーザー一覧" onclick="submitAction('GoUserListAction')"/><br><br>
			</s:form>

			<h3>===商品情報===</h3>
			<s:form>
				<input type="button" value="新規登録" onclick="submitAction('ItemCreateAction')"/><br><br>
				<input type="button" value="商品一覧" onclick="submitAction('GoItemListAction')"/><br><br>
			</s:form>
		</div>

		<div>
			<span>ログアウトは</span>
			<a href='<s:url action="LogoutAction"/>'>こちら</a>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>