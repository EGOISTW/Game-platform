package store.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CheckUserLogin implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception)
			throws Exception {
		System.out.println("afterCompletion!");

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView mView)
			throws Exception {
		System.out.println("postHandle!");

	}
//	true表示放心，false表示拦截
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		System.out.println("preHandle!");
		
		String path=request.getRequestURI();
		if(path.indexOf("login")>0) {
			return true;
		}
		
		HttpSession session=request.getSession();
		System.out.println("拦截器"+request.getSession().getAttribute("loginUser"));
		
		if(session.getAttribute("loginUser")!=null) {
			System.out.println("合法身份");
			return true;
			
		}else {
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return false;
			
		}
		
		
		
	}

}
