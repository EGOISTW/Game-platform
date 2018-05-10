<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="${pageContext.request.contextPath}/JS/WebCalendar.js" type="text/javascript"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/updataItem.css">
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

			

			<div class="page_content">
			<div class="page_left">
				<div class="page_login">

					<div class="login">
						<h2>主页</h2>
						<p>修改商品</p>
						<br>
						
					</div>
					
					<form action="${pageContext.request.contextPath}/item/updataGameItem?gId=${infoPhoto.gId}" method="post">
						
						<div class="user">
							<p>游戏名称</p>
						
							<input type="text" name="gName" value="${infoPhoto.gName}">
						</div>
						<div class="password">
							<p>内容介绍</p>
						
							
							<textarea rows="5" cols="5" name="gContext">${infoPhoto.gContext}</textarea>
						</div>
						<div class="real_name">
							<p>出版商</p>
						
							<input type="text" name="gPublisher" value="${infoPhoto.gPublisher}">
						</div>
						<div class="email" >
							<p>图片地址</p>
						
							<input type="text" name="gPhoto" value="${infoPhoto.gPhoto}">
						</div>
						<div class="email" >
							<p>上架状态（0未上架，1已上架）</p>
						
							<input type="text" name="gStatus" value="${infoPhoto.gStatus}">
						</div>
						<div class="email">
							<p>发行日期</p>
						
							<input type="text" name="publishDate" onclick="selectDate(this,'yyyy-MM-dd hh:mm:ss')" value="<fmt:formatDate value="${infoPhoto.publishDate}" pattern="yyyy-MM-dd HH:mm:ss"/>">
						</div>
						<div class="email">
							<p>发行价格</p>
						
							<input type="text" name="gPrice" value="${infoPhoto.gPrice}">
						</div>
						


						<button type="submit" class="form_submit">
							<span>提交</span>

							
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

						<div><img src="images/why_join_preview.png" alt=""></div>

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