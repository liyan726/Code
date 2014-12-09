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
	 * ִ��ʱ������ͼ�Ѿ����������,����try catch ���finally
	 */
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception ex)
			throws Exception {
		
	}

	/**
	 * ִ��ʱ����controllerִ���꣬��ͼ������û�а���ͼ������ҳ��,
	 * ����ͼ��ͳһ���޸ģ���Ҫ������Model�� ����jspҳ�涼���Ի�ø�map��testֵ
	 */
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView mv) throws Exception {

	}

	/**
	 * ִ��ʱ������ִ��controller֮ǰ��ִ��
	 * ����ֵ���ͣ�boolean��true������п��Է���controller��false�����Է���controller
	 */
	public boolean preHandle(HttpServletRequest req, HttpServletResponse rep,
			Object obj) throws Exception {
			
	  User session=(User) req.getSession().getAttribute("user");
		if(session==null||session.equals("")){
			
			Mes ms= new Mes();
			ms.setMes_name("���ȵ�¼�ڽ��к�������");
			req.setAttribute("err", ms);
			req.getRequestDispatcher("/WEB-INF/login/login.jsp").forward(req, rep);
			return false;
		}
		else 
		return true;
	}

}
