<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'news-list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div>
    	<div id="left"><!-- 菜单 -->
    	
    	</div>
    	<div id="right"><!-- 内容 -->
    		新闻列表
    		<table>
    			<tr>
    				<td>新闻标题</td>
    				<td>新闻作者</td>
    				<td>时间</td>
    				<td>所属主题</td>
    			</tr>
    			<c:forEach items="${page.data }" var="news">
    			<tr>
    				<td>${news.newsTitle }</td>
    				<td>${news.newsAuthor }</td>
    				<td><fmt:formatDate value="${news.createTime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
    				<td>${news.topic.topicName }</td>
    			</tr>
    			</c:forEach>
    			<tr>
    				<td colspan="4">
    					<c:if test="${page.currentPageNo == 1 }">首页&nbsp;上一页</c:if>
    					<c:if test="${page.currentPageNo > 1 }">
    						<a href="news/page">首页</a>
    						<a href="news/page?pageNo=${page.currentPageNo - 1 }">上一页</a>
    					</c:if>
    					<c:if test="${page.currentPageNo == page.totalPageCount }">
    						下一页&nbsp;末页
    					</c:if>
    					<c:if test="${page.currentPageNo < page.totalPageCount }">
    						<a href="news/page?pageNo=${page.currentPageNo + 1 }">下一页</a>
    						<a href="news/page?pageNo=${page.totalPageCount }">末页</a>
    					</c:if>
    				</td>
    			</tr>
    		</table>
    	</div>
    </div>
  </body>
</html>
