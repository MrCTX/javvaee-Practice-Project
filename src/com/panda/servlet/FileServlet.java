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
       System.out.println("���ڹ���FileServlet***");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//��ñ����������ļ�����
		String filename = request.getParameter("file");
		//����Ҫ�����������Ҫ����ContentType
		response.setContentType("image/jpeg");
		//���߿ͻ��˳���������ʾ�򣬲�ָ��������ʾ�Ի����е��ļ���
		response.setHeader("Content-Disposition", "attachment;filename=" + filename);
		//ָ���������Ķ�
		request.getRequestDispatcher("d:\\java\\"+filename).forward(request, response);
		
	}
	
}
