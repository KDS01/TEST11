<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
#modal {
	position: fixed;
	z-index: 9999;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	overflow: auto;
	background-color: rgba(0, 0, 0, 0.4);
	display: none;
}
</style>
<div id="modal">
	<div class="modal-content">
		<h2>모달창 제목</h2>
		<p>모달창 내용</p>
		<button id="close-modal">닫기</button>
	</div>
</div>