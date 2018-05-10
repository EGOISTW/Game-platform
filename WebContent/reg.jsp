<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/register.css">
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
				<a href="${pageContext.request.contextPath}/login.jsp">登录</a>
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
			<div class="page_left">
				<div class="page_login">

					<div class="login">
						<h2>主页</h2>
						<p>创建账户</p>
						<br>
						
					</div>
					<form action="${pageContext.request.contextPath}/user/register" method="post">
						<div class="user">
							<p>创建Steam账户名称</p>
							<span>${userName}</span>
							<span>${echo}</span>
						
							<input type="text" name="userName">
						</div>
						<div class="password">
							<p>请输入密码</p>
							<span>${gamePassword}</span>
						
							<input type="password" name="gamePassword">
						</div>
						<div class="real_name">
							<p>您的姓名</p>
							<span>${realName}</span>
						
							<input type="text" name="realName">
						</div>
						<div class="email">
							<p>您当前的电子邮件</p>
							<span>${email}</span>
						
							<input type="text" name="email">
						</div>

						<button type="submit" class="form_submit">
							<span>注册</span>

							
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
					<div>为什么加入 STEAM？</div>
					<br>
					<div>购买和下载完整零售游戏
						加入 Steam 社区
						游戏时与好友聊天
						在任何电脑上都能玩
						安排游戏、比赛或 LAN 聚会
						获取自动游戏更新以及更多！</div><br>

						<div><img src="${pageContext.request.contextPath}/images/why_join_preview.png" alt=""></div>

					<div>


						系统需求
						Windows XP、Vista 或 7
						512 MB 内存
						1 Ghz 或更快的处理器

						Intel Mac、OS X 版本 10.7 (Lion) 或更新的版本。
						强烈推荐使用双键鼠标

						1GB 硬盘空间（推荐）
						互联网连接（推荐使用宽带）
					</div>

					

					
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
</div>


</body>
</html>