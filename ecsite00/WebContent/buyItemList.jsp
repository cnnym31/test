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
		<title>BuyItemList画面</title>

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
			<p>BuyItemList</p>
		</div>

		<div id="item-list">
			<s:iterator value="itemList">
			<ul>
				<li>
					<a href='<s:url action="BuyItemDetailsAction"><s:param name="id" value="%{id}"/></s:url>'>

						<img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="item-image-box"/>
					</a><br>
					<s:property value="itemName"/><br>
					<s:property value="itemPrice"/>円<br>
				</li>
			</ul>
			</s:iterator>
		</div>

		<div id="text-link">
			<br>
			<p>Homeへ戻る場合は
				<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>