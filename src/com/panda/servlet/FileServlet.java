package com.panda.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FileServlet")
public class FileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FileServlet() {
        super();
       System.out.println("正在构造FileServlet***");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//获得表单传过来的文件参数
		String filename = request.getParameter("file");
		//正文要有输出，必须要设置ContentType
		response.setContentType("image/jpeg");
		//告诉客户端出现下载提示框，并指定下载提示对话框中的文件名
		response.setHeader("Content-Disposition", "attachment;filename=" + filename);
		//指定下载在哪儿
		request.getRequestDispatcher("d:\\java\\"+filename).forward(request, response);
		
	}
	
}
