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
		<title>UserList画面</title>

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
			<p>UserList</p>
		</div>

		<div>
			<table border="1">
				<tr>
					<th>No.</th>
					<th>ログインID</th>
					<th>ログインPASS</th>
					<th>ユーザー名</th>
					<th>登録日</th>
					<th>最終更新日</th>
					<th></th>
				</tr>
				<s:iterator value="userList">
				<tr>
					<td><s:property value="id"/></td>
					<td><s:property value="loginId"/></td>
					<td><s:property value="loginPassword"/></td>
					<td><s:property value="userName"/></td>
					<td><s:property value="insert_date"/></td>

					<td><s:property value="update_date"/></td>
					<td>
						<s:form action="UserUpdateAction">
							<s:hidden name="id" value="%{id}"/>
							<s:submit value="更新"/>
						</s:form>
						<s:form action="UserDeleteAction">
							<s:hidden name="id" value="%{id}"/>
							<s:submit value="削除"/>
						</s:form>
				</tr>
				 </s:iterator>
			</table>

			<div>
				<br>
				<span>前画面に戻る場合は</span>
				<a href='<s:url action="GoAdminPageAction"/>'>こちら</a>
			</div>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>