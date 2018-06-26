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
		<title>BuyItemConfirm画面</title>

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
			<p>BuyItem</p>
		</div>

		<div>
			<s:form>
			<table>
				<tr>
					<td>商品名</td>
					<td><s:property value="#session.buyItem_name"/></td>
				</tr>
				<tr>
					<td>値段</td>
					<td><s:property value="#session.total_price"/></td>
				</tr>
				<tr>
					<td>購入個数</td>
					<td><s:property value="#session.count"/></td>
				</tr>
				<tr>
					<td>支払い方法</td>
					<td><s:property value="#session.pay"/></td>
				</tr>
				<tr>
					<td><input type="button" value="戻る" onclick="submitAction('HomeAction')"/></td>
					<td><input type="button" value="完了" onclick="submitAction('BuyItemConfirmAction')"/></td>
				</tr>
			</table>
			</s:form>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>