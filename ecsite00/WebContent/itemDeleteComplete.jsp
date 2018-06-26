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
		<title>ItemDeleteComplete画面</title>

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
			<p>ItemDelteComplete</p>
		</div>

		<div>
			<h3>商品情報を削除しました。</h3>
		</div>

		<div>
			<a href='<s:url action="GoItemListAction"/>'>商品一覧へ</a>
			<a href='<s:url action="GoAdminPageAction"/>'>管理者画面へ</a>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>