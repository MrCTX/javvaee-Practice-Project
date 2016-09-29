package com.panda.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.panda.vo.User;

/*
* @author MrC
* @date 2016年9月26日上午9:08:08
* @parameter
* @version
*/
@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String index() {
		System.out.println(user.getName());
		return SUCCESS;
	}

	public User getModel() {
		return user;
	}
}
