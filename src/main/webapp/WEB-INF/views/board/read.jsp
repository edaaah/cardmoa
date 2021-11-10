<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!--  jstl -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	<!-- date -->


<%@ include file="/WEB-INF/views/includes/header.jsp" %>

	
	<link rel="stylesheet" href="/resources/css/read.css" type="text/css">
	<link rel="stylesheet" href="/resources/css/upload.css" type="text/css">
    <title>read</title>


			<div class="read">
                <h2>
	                <c:choose>
	               		<c:when test="${read.boardName=='no'}"><a href="http://localhost:8080/board/list?boardName=no">NOTICE</a></c:when>
	               		<c:when test="${read.boardName=='qa'}"><a href="http://localhost:8080/board/list?boardName=qa">Q&A</a></c:when>
	               		<c:when test="${read.boardName=='ev'}"><a href="http://localhost:8080/board/list?boardName=ev">EVENT</a></c:when>
	               		<c:when test="${read.boardName=='ne'}"><a href="http://localhost:8080/board/list?boardName=ne">NEWS</a></c:when>
	                </c:choose>
                </h2>
              	<div class="readIn">
              		<input type="hidden" value="${read.bno}" id="bno">
                    <h3>${read.title}</h3>
                    <p class="writer"><a href="#">${read.writer}</a></p>
                    <p class="content">${read.content}</p>
                    <div class="readBtn">
                        <button class="readModifyBtn"><a href="/board/modify?bno=${read.bno}">수정하기</a></button>
						<button class="readDeleteBtn"><a href="/board/remove?bno=${read.bno}">삭제하기</a></button>
                    </div>
                </div> <!-- .readIn -->
            </div> <!-- .read-->
            
            <!-- <div class='bigPictureWrapper'>
  				<div class='bigPicture'>
  				</div>
			</div>
			<div class='uploadDiv'>
				<input type='file' name='uploadFile' multiple>
			</div>

			<div class='uploadResult'>
				<ul>

				</ul>
			</div>
			
			<button id='uploadBtn'>Upload</button> -->
	
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<i class="fa fa-comments fa-fw"></i> Reply
					<button id="addReplyBtn" class="btn btn-primary btn-xs pull-right">댓글쓰기</button>
					<!-- button에 어떠한 동작을 주고싶으면 무조건 js에서 event 써야 함 (input과 다름) -->
				</div> <!-- .panel-heading -->
				
				<div class="panel-body">
					<ul class="chat">

					</ul> <!-- .chat -->
				</div> <!-- .panel-body -->
				<div class="panel-footer">
				
				</div>
				
				
			</div> <!-- .panel .panel-default -->
		</div>	<!-- .col-lg-12 -->
	</div> <!-- .row -->
	
	

<%@ include file="/WEB-INF/views/includes/footer.jsp" %>