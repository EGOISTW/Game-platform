<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Detail.css">
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
								<button type="submit" class="search_bu
								">
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

			<div class="gameinfo_page">	
				<div class="game_tittle">
					
					${infoPhoto.gName}

					
				</div>
				<div class="game_context">
					<div class="context_left">
						<div class="context_top">
							<div class="big_photo">
								<img src="${pageContext.request.contextPath}${infoPhoto.infoPhoto.bigA}" alt="">
								
							</div>
							<div class="big_photo">
								<img src="${pageContext.request.contextPath}${infoPhoto.infoPhoto.bigB}" alt="">
								
							</div>
							<div class="big_photo">
								<img src="${pageContext.request.contextPath}${infoPhoto.infoPhoto.bigC}" alt="">
								
							</div>
							<div class="big_photo">
								<img src="${pageContext.request.contextPath}${infoPhoto.infoPhoto.bigD}" alt="">
								
							</div>
							<div class="big_photo">
								<img src="${pageContext.request.contextPath}${infoPhoto.infoPhoto.bigE}" alt="">
								
							</div>
							
						</div>
						<div class="context_buttom">
							<div>
								<img src="${pageContext.request.contextPath}${infoPhoto.infoPhoto.smallA}" alt="">
								
							</div>
							<div>
								<img src="${pageContext.request.contextPath}${infoPhoto.infoPhoto.smallB}" alt="">
								
							</div>
							<div>
								<img src="${pageContext.request.contextPath}${infoPhoto.infoPhoto.smallC}" alt="">
							</div>
							<div>
								<img src="${pageContext.request.contextPath}${infoPhoto.infoPhoto.smallD}" alt="">
							</div>
							<div>
								<img src="${pageContext.request.contextPath}${infoPhoto.infoPhoto.smallE}" alt="">
							</div>
							
						</div>
						
						
					</div>
					<div class="context_right">
						<div class="rPhoto">
							<img src="${pageContext.request.contextPath}${infoPhoto.infoPhoto.pHeader}" alt="">
							
						</div>
						<div class="game_description_snippet">

															
								${infoPhoto.gContext}
						</div>
						<div class="publish_time">
							发行日期: ${infoPhoto.publishDate}
							
						</div>
						<div class="publisher">
							开发商:  ${infoPhoto.gPublisher}
						</div>
						<c:if test="${infoPhoto.gStatus==1}">
						<form action="${pageContext.request.contextPath}/item/addToCar" method="post">
							<input type="hidden" name="gId" value="${infoPhoto.gId}">
							<input type="hidden" name="gName" value="${infoPhoto.gName}">
							<input type="hidden" name="gPhoto" value="${infoPhoto.gPhoto}">
							<input type="hidden" name="gPrice" value="${infoPhoto.gPrice}">
							<input type="hidden" name="userId" value="${sessionScope.userId}">
							
							
							
							<div class="btn_addtocar">
								<button type="submit">
									<span>添加到购物车</span>
								</button>
									
									
							</div>
						</form>

						</c:if>

						
					</div>
					
				</div>

				
			</div>


			
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