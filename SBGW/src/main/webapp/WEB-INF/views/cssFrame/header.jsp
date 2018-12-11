<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
* {
	margin: 0 auto;
}

.header_header {
	width: 1280px;
	height: 50px;
	background: #31343b;
	text-align: center;
	line-height: 50px;
	color: white;
}

.title {
	margin-left: 15px;
	float: left;
	font-size: 2em;
}

.tMenu {
	float: right;
}

.tMenu>div {
	float: left;
	margin-right: 10px;
	margin-left: 10px;
}

.headerMenu {
	width: 1280px;
	height: 60px;
	background: #4981f2;
	color: white;
	font-weight: bold;
	font-size: 1.2em;
}

.dropBtn {
	line-height: 60px;
	text-align: center;
	float: left;
	width: 140px;
	height: 60px;
	transition: 0.2s;
}

.dropBtn:hover {
	background: rgba(0, 0, 0, 0.4);
	transition: 0.2s;
	cursor: pointer;
}

.dropBottom {
	background: #383d47;
	color: #a4adbc;
	position: relative;
	top: -60px;
	z-index: -1;
	transition: 0.2s;
}

.dropTop:hover ~ .dropBottom {
	transform: translateY(60px);
	transition: 0.2s;
}

.dropBottom:hover {
	transform: translateY(60px);
}
</style>
<body>
	<div class="header_header">
		<div class="title">ITT그룹웨어</div>
		<div class="tMenu">
			<div class="tMsg">mimi님 환영합니다.</div>
			<div class="tLog">로그아웃</div>
			<div class="tPage">마이페이지</div>
		</div>
	</div>
	<div class="headerMenu">
		<div class="dropBtn">
			<div class="dropTop">전자결재</div>
			<div class="dropBottom">하단메뉴</div>
		</div>
		<div class="dropBtn">
			<div class="dropTop">문서관리</div>
			<div class="dropBottom">하단메뉴</div>
		</div>
		<div class="dropBtn">
			<div class="dropTop">이슈</div>
			<div class="dropBottom">하단메뉴</div>
		</div>
		<div class="dropBtn">
			<div class="dropTop">일정관리</div>
			<div class="dropBottom">하단메뉴</div>
		</div>
		<div class="dropBtn">
			<div class="dropTop">업무관리</div>
			<div class="dropBottom">하단메뉴</div>
		</div>
		<div class="dropBtn">
			<div class="dropTop">주소록</div>
			<div class="dropBottom">하단메뉴</div>
		</div>
		<div class="dropBtn">
			<div class="dropTop">쪽지</div>
			<div class="dropBottom">하단메뉴</div>
		</div>
		<div class="dropBtn">
			<div class="dropTop">게시판</div>
			<div class="dropBottom">하단메뉴</div>
		</div>
		<div class="dropBtn">
			<div class="dropTop">동호회</div>
			<div class="dropBottom">하단메뉴</div>
		</div>
	</div>
</body>
</html>