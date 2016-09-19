<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基础框架</title>
</head>
<c:import url="/pages/include/pageHead.jsp" />
<body>
	<div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="#">基础框架</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav pull-right">
                            <li class="dropdown">
                                <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">
									<i class="icon-user"></i>欢迎您登录：${userToken.vuser.user.name}<i class="caret"></i>
                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a tabindex="-1" href="${basepath}/user/addpass">修改密码</a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a tabindex="-1" href="${basepath}/delSession">注销</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                        <ul class="nav">
                            <li class="dropdown">
                                <a href="${basepath}/user">首页</a>
                            </li>
                            <c:forEach items="${userToken.menulist}" var="menu" varStatus="stat0">
                            <c:if test="${menu.parentId==''}">
                            <li class="dropdown">
                                <a href="${basepath}${menu.href}" data-toggle="dropdown" class="dropdown-toggle">${menu.name}<b class="caret"></b></a>
                                <ul class="dropdown-menu" id="menu_${stat0.index+1}">
                               	 <c:forEach items="${userToken.menulist}" var="menusubtwo" varStatus="stat1">
                               	 <c:if test="${menusubtwo.parentId==menu.id}">
                                    <li>
                                    	<a href="${basepath}${menusubtwo.href}">${menusubtwo.name}</a>
                                    	<!-- 开启三层
                                        <ul class="dropdown-menu sub-menu"><i class="icon-arrow-right"></i>
                                        	<c:forEach items="${userToken.menulist}" var="menusubthree" varStatus="stat2">
                                        	<c:if test="${menusubthree.parentId==menusubtwo.id}">
                                            <li>
                                                <a href="#">${menusubthree.name}</a>
                                            </li>
                                            </c:if>
                                            </c:forEach>
                                        </ul>
                                         -->
                                    </li>
                                    </c:if>
                                  </c:forEach>
                                </ul>
                            </li>
                            </c:if>
                          </c:forEach>  
                        </ul>
                    </div>
                    <!--/.nav-collapse -->
                </div>
            </div>
        </div>
</body>
</html>