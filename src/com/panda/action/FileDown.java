package com.panda.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/*
* @author MrC
* @date 2016��9��29������4:51:47
* @parameter
* @version
*/
@SuppressWarnings("serial")
public class FileDown extends ActionSupport {
	private String filename ;
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public InputStream getTarget() throws Exception {
		//����Ҫ���ص��ļ���������
		return ServletActionContext.getServletContext().getResourceAsStream(filename);
	}

	public String execute() throws Exception {
		return SUCCESS;
	}
	
	
}
