<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/login.css">
</head>
<body>
<div class="bodyV6">
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

						
					</div>


					
				</div>

				
			</div>


			
		</div>
		

		<div class="page_content">
			<div class="error"><h4>${errorMsg}</h4></div>
			<div class="page_left">
				<div class="page_login">

					<div class="login">
						<h2>登录</h2>
						<p>登录到现有账户</p>
						<br>
						
					</div>
					<form action="${pageContext.request.contextPath}/user/login" method="post">
						<div class="user">
							<p>Steam账户名称</p>
						
							<input type="text" name="username">
						</div>
						<div class="password">
							<p>密码</p>
						
							<input type="password" name="password">
						</div>

						<button type="submit" class="form_submit">
							<span>登录</span>

							
						</button>
					</form>
				</div>
				<!-- 分割线 -->
				<div class="parting">
					
				</div>

				<div class="register">
					<div>
						<h2>创建</h2>
					</div>
					<div>一个免费的新账户</div>
					<br>
					<div>欢迎免费加入及轻松使用。继续创建 Steam 帐户并获取 Steam - 适合 PC 和 Mac 玩家的前沿数字解决方案。
					</div>

					<a href="${pageContext.request.contextPath}/reg.jsp" class="regi">
						<button type="submit" class="form_submit">
							<span >加入Steam</span>

							
						</button>
					</a>

					
				</div>

			</div>
			<div class="page_right">
				
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
						<img src="images/logo_valve_footer.png" alt="">
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
					<img src="images/logo_steam_footer.png" alt="">
					
			</div>
			
		</div>
		
	</div>
</div>

</body>
</html>