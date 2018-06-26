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
		<title>BuyItemDetails画面</title>

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
			<p>BuyItemDetails</p>
		</div>

		<div>
			<s:form action="AddCartAction">
			<table>
					<tr>
						<td></td>
						<td><img src='<s:property value="#session.imageFilePath"/>/<s:property value="#session.imageFileName"/>' class="item-image-box"/><img src='<s:property value="#session.imageFilePath"/>/<s:property value="#session.imageFileName"/>' class="item-image-box"/></td>
					</tr>
					<tr>
						<td><span>商品名</span></td>
						<td><s:property value="#session.itemName"/><br></td>
					</tr>
					<tr>
						<td><span>値段</span></td>
						<td><s:property value="#session.itemPrice"/><span>円</span></td>
					</tr>
					<tr>
						<td><p>購入個数</p></td>
						<td>
							<select name="itemCount">
								<option value="1" selected="selected">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
							</select>
						</td>
					</tr>
					<tr>
						<td></td>
						<td>
							<s:hidden name="id" value="%{id}"/>
							<s:submit value="カートに追加する"/>
						</td>
					</tr>
				</table>
				</s:form>
		</div>

		<div>
			<br>
			<span>商品一覧に戻る場合には</span>
			<a href='<s:url action="BuyItemListAction"/>'>こちら</a>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>