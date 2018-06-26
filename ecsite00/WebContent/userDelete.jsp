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
		<title>UserDelete画面</title>

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
			<p>UserDelete</p>
		</div>

		<div>
			<h3>以下のユーザーを削除してよろしいですか。</h3>

			<table>
				<tr>
					<td><label>ログインID：</label></td>
					<td><s:property value="#session.loginId"/></td>
				</tr>
				<tr>
					<td><label>ログインPASS：</label></td>
					<td><s:property value="#session.loginPassword"/></td>
				</tr>
				<tr>
					<td><label>ユーザー名：</label></td>
					<td><s:property value="#session.userName"/></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<s:form action="UserDeleteCompleteAction">
							<s:hidden name="id" value="%{id}"/>
							<s:submit value="削除する"/>
						</s:form>
					</td>
				</tr>
			</table>
		</div>

		<div>
			<br>
			<span>前画面に戻る場合には</span>
			<a href='<s:url action="GoUserListAction"/>'>こちら</a>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>