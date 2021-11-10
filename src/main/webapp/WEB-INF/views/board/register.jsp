<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!--  jstl -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	<!-- date -->

<%@ include file="/WEB-INF/views/includes/header.jsp" %>
	
	
	<link rel="stylesheet" href="/resources/css/register.css" type="text/css">
    <title>register</title>

			<div class="register">
                <h2><span>글쓰기</span></h2>
                <form role="form" action="register" method="post">
                    <p class="title"><input type="text" placeholder="제목을 입력하여 주세요" name="title"></p>
                    <p>
                    	<select name="boardName">
                    		<option value="">게시판 선택</option>
                    		<option value="no">NOTICE</option>
                    		<option value="qa">Q&A</option>
                    		<option value="ev">EVENT</option>
                    		<option value="ne">NEWS</option>
                    	</select>
                    </p>
                    <p class="writer"><input type="text" placeholder="작성자를 입력하여 주세요" name="writer"></p>
                    <p><input type="hidden" value="no" name="cm_board"></p>
                    
                    <p class="content"><textarea rows="70" cols="126" name="content"></textarea></p>
                    <div class="registerBtn">
                        <input type="submit" value="글쓰기">
                    </div>
                </form>
            </div> <!-- .post-->


	<%@ include file="/WEB-INF/views/includes/footer.jsp" %>