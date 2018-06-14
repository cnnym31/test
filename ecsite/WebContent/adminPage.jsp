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
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		<title>管理者画面</title>

		<style type="text/css">
		/* ========TAG LAYOUT======== */
			body {
				margin:0;
				padding:0;
				line-height:1.6;
				letter-spacing:1px;
				font-family:Verdana, Helvetica, sans-serif;
				font-size:12px;
				color:#333;
				background:#fff;
			}

			table {
				text-align:center;
				margin:0 auto;
			}

		/* ========ID LAYOUT========*/
			#top {
				width:780px;
				margin:30px auto;
				border:1px solid #333;
			}

			#header {
				width:100%;
				height:80px;
				background-color:black;
			}

			#main{
				width:100%;
				height:500px;
				text-align:center;
			}

			#footer{
				width:100%;
				height:80px;
				backgruond-color:black;
				clear:both;
			}
		</style>

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
			<p>管理者ページ</p>
		</div>

		<div>

			<h3>===ユーザー情報===</h3>
			<s:form>
				<input type="button" value="登録" onclick="submitAction('UserCreateAction')"/><br><br>
				<input type="button" value="更新" onclick="submitAction('GoUserUpdateAction')"/><br><br>
				<input type="button" value="削除" onclick="submitAction('UserDeleteAction')"/><br><br>
			</s:form>

			<h3>===商品情報===</h3>
			<s:form>
				<input type="button" value="登録" onclick="submitAction('ItemCreateAction')"/><br><br>
				<input type="button" value="更新" onclick="submitAction('GoItemUpdateAction')"/><br><br>
				<input type="button" value="削除" onclick="submitAction('GoItemDeleteAction')"/><br><br>
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