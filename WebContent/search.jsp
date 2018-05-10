<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/search.css">
</head>
<body>
<!-- 头部导航栏1 -->
	<div class="header">
		<div class="content">
			<div class="toplogo">
				<span>
					<a href="${pageContext.request.contextPath}/index.jsp">
						<img src="${pageContext.request.contextPath}/images/globalheader_logo.png" alt="">
					</a>
				</span>
				
			</div>
			<div class="menulist">
				<a href="${pageContext.request.contextPath}/index.jsp">商店</a>
				<a href="">社区</a>
				<a href="">关于</a>
			</div>
			<div class="loginmenu">
				<c:if test="${sessionScope.loginUser==null}"><a href="${pageContext.request.contextPath}/login.jsp">登录</a></c:if>
				<c:if test="${sessionScope.loginUser!=null}"><a href="${pageContext.request.contextPath}/user/outLogin">注销</a></c:if>
				<span>|</span>
				<a href="${pageContext.request.contextPath}/reg.jsp">注册</a>
				
			</div>
		</div>
		
	</div>
	<div class="container">
		<div class="top">
			
			
			<!-- 商店导航栏-->
			<div class="spacer"><!-- 垫片 -->
				<div class="sotre_header">
					<div class="nav_area">
						<!-- 显示下拉菜单 -->
						<div class="tab_pull">
							<a href="">
								您的商店
							</a>
							<span></span>
						</div>
						<!-- 显示下拉菜单 -->
						<div class="tab_pull">
							<a href="">
								游戏
							</a>
							<span></span>
							
						</div>
						<!-- 显示下拉菜单 -->
						<div class="tab_pull">
							<a href="">
								用户中心
							</a>
							<span></span>
							
						</div>
						<!-- 搜索框 -->
						<form action="${pageContext.request.contextPath}/item/findGame" class="search_form">
							<div class="search">
								
								
								<input type="text" class="search_input" name="gName">
								<button type="submit" class="search_bu">
									<img src="${pageContext.request.contextPath}/images/search_icon_btn.png" alt="" >
								</button>
							
							</div>
							
						</form>
						
						<div class="login_username">
							<p>欢迎您 ${sessionScope.loginUser}</p>
							
						</div>

						
					</div>


					
				</div>

				
			</div>

			<div class="search_top">
				<h2>正在浏览</h2>
			
			</div>

			<!-- 主页面搜索栏 -->
			<div class="search_form2">
				<form action="${pageContext.request.contextPath}/item/findGame" class="search_form3" id="findGame">
					<input id="page" name="pageNo" type="hidden" value="1">
						<div class="search2">
							
							
							<input type="text" class="search_input" name="gName" value="${gName}">
							<button type="submit" class="search_bu">
								<img src="${pageContext.request.contextPath}/images/search_icon_btn.png" alt="">
							</button>
							
						
						</div>
							
				</form>
				<c:if test="${sessionScope.UserGroup==0}">
								<a href="${pageContext.request.contextPath}/addGame.jsp">
									添加游戏商品
								</a>
				</c:if>
				<a href="${pageContext.request.contextPath}/item/findCar?userId=${sessionScope.userId}">购物车</a>
				
			</div>
			<!-- 搜索内容栏 -->
			<c:forEach items="${infoList}" var="info">
				<div class="search_context">
					<a href="${pageContext.request.contextPath}/item/findGameByPk?gId=${info.gId}" class="search_result">
						<div class="result_left">
							<img src="${pageContext.request.contextPath}${info.gPhoto}" alt="">
							
						</div>
						<div class="result_right">
							<div class="gname">
								<span>
									${info.gName}
								</span>
								<p>
									<span></span>
								</p>
							</div>
							<div class="publish_time">
								${info.publishDate}
							</div>
							<c:if test="${sessionScope.UserGroup==1}">
							<div class="g_price">
								
								¥ ${info.gPrice}	 			
							</div>
							</c:if>
							<c:if test="${sessionScope.UserGroup==0}">
							<div class="g_price">
								<a href="${pageContext.request.contextPath}/item/findGameByPkToUpdata?gId=${info.gId}"> 修改</a>
								<a href="${pageContext.request.contextPath}/item/delGameItem?gId=${info.gId}" onclick="javascript:return del()"> 删除</a>
								
							</div>

							</c:if>
							
							
						</div>
					</a>
				</div>
			</c:forEach>
			<script type="text/javascript">
			function del() { 
				 var msg = "您真的确定要删除吗？\n\n请确认！"; 
				 if (confirm(msg)==true){ 
				  return true; 
				 }else{ 
				  return false; 
				 } 
				} 
			</script>
			<div class="page">
		      	【当前为第${pageInfo.pageNum}页，总共有${pageInfo.pages}页】
		        <a href="javascript:jumpPage(1)" >首页</a>
		        <a href="javascript:jumpPage(${pageInfo.prePage})" title="">上一页</a>
		       
		        
		        <a href="javascript:jumpPage(${pageInfo.nextPage})" >下一页</a>
		        <a href="javascript:jumpPage(${pageInfo.pages})" >尾页</a> 
      		</div>
      		<script>
			  	function jumpPage(pageNo) {
			  		document.getElementById("page").value=pageNo;
			  		
			  		document.getElementById("findGame").submit();
					
				}
			 </script>
 

			
		</div>

		

		

		
	</div>
	<div class="footspace"></div>
	<div class="footer">
		<div class="foot_content">
			<div class="foot_nav">
				<div class="nav_content">
					<span class="nav_back">
						<span>商品类型</span>
						
					</span>
					<span class="nav_back">
						<span>关于Steam</span>
					</span>
					<span class="nav_back">
						<span>关于VALVE</span>
					</span>
					<span class="nav_back">
						<span>帮助</span>
					</span>
					<span class="nav_back">
						<span>动态信息</span>
						
					</span>
				</div>
			</div>
			<div class="foot_bottom">

				<div class="footer_logo">
					<a href="">
						<img src="${pageContext.request.contextPath}/images/logo_valve_footer.png" alt="">
					</a>

					
				</div>

				<div class="foot_left">
					<div>
						©2017 Valve Corporation。保留所有权利。所有商标均为其在美国及其它国家/地区的各自持有者所有。
					</div>
					<div>
						所有的价格均已包含增值税（如适用）。   隐私政策   |   法律信息   |   Steam 订户协议   |   退款
					</div>
					
				</div>


			</div>
			<div class="foot_right">
					<img src="${pageContext.request.contextPath}/images/logo_steam_footer.png" alt="">
					
			</div>
			
		</div>
		
	</div>


</body>
</html>