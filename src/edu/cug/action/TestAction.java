package edu.cug.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport implements ServletRequestAware {
	
	private static final long serialVersionUID = 1L;
	
	private HttpServletRequest request;

	public String test(){
		request.setAttribute("myMoon", "½ñÍí¸üÐÂ£¡");
		System.out.println("SPRING-STRUTS2");
		return SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		this.request=arg0;
	}
}
