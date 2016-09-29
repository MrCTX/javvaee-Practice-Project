package com.panda.action;

import com.opensymphony.xwork2.ActionSupport;

/*
* @author MrC
* @date 2016年9月28日下午4:05:57
* @parameter
* @version
*/
@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	public String add() {
		System.out.println("正在执行添加操作");
		return null;
	}
	
	public String query() {
		System.out.println("正在执行查询操作");
		return null;
	}
}
