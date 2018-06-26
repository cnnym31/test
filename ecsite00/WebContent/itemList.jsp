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
		<title>ItemList画面</title>

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
			<p>ItemList</p>
		</div>

		<div>
			<s:if test ="itemList == null">
				<h3>登録商品はありません。</h3>
			</s:if>

			<s:else>
				<table border="1">
					<tr>
						<th>No.</th>
						<th>商品画像</th>
						<th>商品名</th>
						<th>価格</th>
						<th>在庫数</th>
						<th>登録日</th>
						<th>最終更新日</th>
						<th></th>
					</tr>
					<s:iterator value="itemList">
					<tr>
						<td><s:property value="id"/></td>
						<td><img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="item-image-box"/></td>
						<td><s:property value="itemName"/></td>
						<td><s:property value="itemPrice"/></td>
						<td><s:property value="itemStock"/></td>
						<td><s:property value="insert_date"/></td>
						<td><s:property value="update_date"/></td>
						<td>
							<s:form action="ItemUpdateAction">
								<s:hidden name="id" value="%{id}"/>
								<s:submit value="更新"/>
							</s:form>
							<s:form action="ItemDeleteAction">
								<s:hidden name="id" value="%{id}"/>
								<s:submit value="削除"/>
							</s:form>
					</tr>
					</s:iterator>
				</table>
				<br>
				<s:form>
					<input type="button" value="全削除" onclick="submitAction('ItemAllDeleteAction')"/>
				</s:form>
			</s:else>

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