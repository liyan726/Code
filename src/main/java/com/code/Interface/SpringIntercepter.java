package com.code.Interface;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.code.Model.Mes;
import com.code.Model.User;



public class SpringIntercepter implements HandlerInterceptor {

	/**
	 * 执行时机：视图已经被解析完毕,类似try catch 后的finally
	 */
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception ex)
			throws Exception {
		
	}

	/**
	 * 执行时机：controller执行完，视图解析器没有把视图解析成页面,
	 * 对视图做统一的修改，主要体现在Model上 所有jsp页面都可以获得该map的test值
	 */
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView mv) throws Exception {

	}

	/**
	 * 执行时机：在执行controller之前来执行
	 * 返回值类型：boolean：true代表放行可以访问controller，false不可以访问controller
	 */
	public boolean preHandle(HttpServletRequest req, HttpServletResponse rep,
			Object obj) throws Exception {
			
	  User session=(User) req.getSession().getAttribute("user");
		if(session==null||session.equals("")){
			
			Mes ms= new Mes();
			ms.setMes_name("请先登录在进行后续操作");
			req.setAttribute("err", ms);
			req.getRequestDispatcher("/WEB-INF/login/login.jsp").forward(req, rep);
			return false;
		}
		else 
		return true;
	}

}
