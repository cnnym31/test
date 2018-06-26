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
		<title>ItemDelete画面</title>

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
			<p>ItemDelete</p>
		</div>

		<div>
			<h3>以下の商品情報を削除してよろしいですか。</h3>

			<table>
				<tr>
					<td><label>商品名：</label></td>
					<td><s:property value="#session.itemName"/></td>
				</tr>
				<tr>
					<td><label>価格：</label></td>
					<td><s:property value="#session.itemPrice"/></td>
				</tr>
				<tr>
					<td><label>在庫数：</label></td>
					<td><s:property value="#session.itemStock"/></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<s:form action="ItemDeleteCompleteAction">
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
			<a href='<s:url action="GoItemListAction"/>'>こちら</a>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>