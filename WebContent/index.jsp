<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/index.css">
<title>Insert title here</title>
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
			<!-- 侧边栏 -->
			<div class="gutter">
				<div class="gut_header">
					<img src="images/steamcards_promo.png" alt=""><br>
					礼物卡

				</div>
				<div class="game_news">
					浏览分类
					
				</div>
				<div class="news_items">
					<a href=""><span class="hot_items"></span>热销商品</a>
					<a href=""><span class="new_items"></span>最近更新</a>
					<a href=""><span class="newgame_items"></span>新品</a>
					<a href=""><span class="atonce_items"></span>即将推出</a>
					<a href=""><span class="sale_items"></span>优惠</a>
					<a href=""><span class="vr_items"></span>虚拟现实</a>
					<a href=""><span class="contorller_items"></span>可支持手柄控制器</a>
					
				</div>
				<div class="game_type">
					按类型分类
					
				</div>
				<div class="type_items">
					<a href="">免费游玩</a>
					<a href="">抢先体验</a>
					<a href="">休闲</a>
					<a href="">体育</a>
					<a href="">冒险</a>
					<a href="">动作</a>
					<a href="">大型多人在线</a>
					<a href="">模拟</a>
					<a href="">独立</a>
					<a href="">竞速</a>
					<a href="">策略</a>
					<a href="">角色扮演</a>
					
				</div>

				

				
			</div>
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
							<a href="${pageContext.request.contextPath}/item/findCar?userId=${sessionScope.userId}">购物车</a>
							
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


			
		</div>

		<div class="home-ctn">
			<div class="content">
				<h2>精选和推荐</h2>
				<!-- 轮播图 -->
				<div class="run">
					<div class="run_content">
						<!-- 重叠1 -->
						<a href="">
							<!-- 左部 -->
							<div class="main_content1">
								
							</div>
							<!-- 轮播图右侧栏 -->
							<div class="game_info">
								<div class="info_name">
									<div>Wallpaper Engine</div>
								</div>
								<div class="info_content">
									<div class="content1"></div>
									<div class="content2"></div>
									<div class="content3"></div>
									<div class="content4"></div>

									
								</div>
								<div class="reason">
									<h1>现已推出</h1>
									<div class="addi">
										<div>热销商品</div>
										
									</div>

									
								</div>
								<div class="price">
									<div>¥ 18</div>
									
								</div>
								
							</div>
						</a>
						<!-- 重叠2 -->
						<a href="">
							<!-- 左部 -->
							<div class="main_content2">
								
							</div>
							<!-- 轮播图右侧栏 -->
							<div class="game_info">
								<div class="info_name">
									<div>DRAGON BALL XENOVERSE 2 - Extra Pack Set</div>
								</div>
								<div class="info_content">
									<div class="content21"></div>
									<div class="content22"></div>
									<div class="content23"></div>
									<div class="content24"></div>

									
								</div>
								<div class="reason">
									<h1>现已推出</h1>
									<div class="addi">
										<div>热销商品</div>
										
									</div>

									
								</div>
								<div class="price">
									<div>¥ 115</div>
									
								</div>
								
							</div>
						</a>
						<!-- 重叠3 -->
						<a href="">
							<!-- 左部 -->
							<div class="main_content3">
								
							</div>
							<!-- 轮播图右侧栏 -->
							<div class="game_info">
								<div class="info_name">
									<div>Tom Clancy's Rainbow Six® Siege</div>
								</div>
								<div class="info_content">
									<div class="content31"></div>
									<div class="content32"></div>
									<div class="content33"></div>
									<div class="content34"></div>

									
								</div>
								<div class="reason">
									<h1>现已推出</h1>
									<div class="addi">
										<div>热销商品</div>
										
									</div>

									
								</div>
								<div class="price">
									<div>¥ 55</div>
									
								</div>
								
							</div>
						</a>
						<!-- 重叠4 -->
						<a href="">
							<!-- 左部 -->
							<div class="main_content4">
								
							</div>
							<!-- 轮播图右侧栏 -->
							<div class="game_info">
								<div class="info_name">
									<div>PLAYERUNKNOWN'S BATTLEGROUNDS</div>
								</div>
								<div class="info_content">
									<div class="content41"></div>
									<div class="content42"></div>
									<div class="content43"></div>
									<div class="content44"></div>

									
								</div>
								<div class="reason">
									<h1>现已推出</h1>
									<div class="addi">
										<div>热销商品</div>
										
									</div>

									
								</div>
								<div class="price">
									<div>¥ 55</div>
									
								</div>
								
							</div>
						</a>

						
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