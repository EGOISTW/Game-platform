<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/search.css">
<title>Insert title here</title>
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
					<!-- 购物车内容 -->
			<div class="car_content">
				<div class="c_tittle">
					<h1>您的购物车</h1>
					
				</div>
				<form>
					<div class="c_main">
						<!-- 循环显示购物车商品 -->
	
						<div class="c_topContent">
										<c:forEach items="${carList}" var="car">
											<div class="search_context">
													<a href="" class="search_result">
														<div class="result_left">
															<img src="${pageContext.request.contextPath}${car.cGamephoto}" alt="">
							
														</div>
														<div class="result_right">
															<div class="gname">
																<span>
																	${car.gameName}
																</span>
																<p>
																	<span></span>
																</p>
															</div>
															
															
															<div class="g_price">
																
																¥ ${car.cPrice}	 
																<a href="${pageContext.request.contextPath}/item/delcarItem?gameId=${car.gameId}&userId=${car.userId}" onclick="javascript:return del()"> 删除</a>
																			
															</div>
															<div class="g_price">
																
															</div>
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
															
															
			
															
															
														</div>
													</a>
												</div>
										</c:forEach>
						</div>
						<div class="c_bottom">
							<div class="total_price">
								预计总额   ¥  ${total}
								
							</div>
							<div class="btn_addtocar">
								<button type="submit">
									<span>提交订单</span>
								</button>
								
								
							</div>
							
						</div>
						
					</div>
				</form>
	
				
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