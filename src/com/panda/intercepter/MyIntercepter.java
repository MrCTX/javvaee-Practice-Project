package com.panda.intercepter;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/*
* @author MrC
* @date 2016年9月28日下午3:55:18
* @parameter
* @version
*/
@SuppressWarnings("serial")
public class MyIntercepter extends AbstractInterceptor {
	public String intercept(ActionInvocation arg0) throws Exception {
		String login = (String) ServletActionContext.getRequest().getSession().getAttribute("login");
		if (login == null) {
			return "login";
		}
		String result = arg0.invoke();
		return result;
	}

}
