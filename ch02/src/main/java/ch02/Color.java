package ch02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.Function;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Color
 */
@WebServlet("/Color")
public class Color extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Color() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    String color =request.getParameter("color");  //�÷��� �Ķ���ͷ� ��û�ް� 
		    PrintWriter out = response.getWriter(); //����ϱ����� �����ֱ� *���İ� ���� 
		    out.printf("<html><body bgcolor='%s' >", color);  //�ٵ� ���� ���� �������ֱ�
		    out.println("</body><html>");                        //�ٵ� �ݰ� ��
		    out.close();                                         //Ŭ���� ���ֱ� 
			
		}
		
		
		
		
	
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
