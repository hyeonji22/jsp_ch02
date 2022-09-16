package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Personal
 */
@WebServlet("/Personal")
public class Personal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Personal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  request.setCharacterEncoding("utf-8");         //�ѱ� ������ �ҋ��� ���ڵ� �����ֱ� ** ���� 
		  response.setContentType("text/html;charset=utf-8");

		  String name = request.getParameter("name");
		  String id = request.getParameter("id");
		  String password = request.getParameter("password");
		  String gender = request.getParameter("gender");  //������ �ϳ��� üũ�Ǽ� �׳� ��� 
		  String[] notice = request.getParameterValues("notice"); //��Ƽ���� ��Ƽ�� �迭�� ��� 
		  String job = request.getParameter("job");

		  PrintWriter out=response.getWriter(); //����Ʈ�ϱ����� �� �����ֱ� *����

		
		  out.println("<html><body><h1>��������</h1>");
		  out.printf("<h4>�̸�:"+name+ "</h4>");
		  out.printf("<h4>���̵�:"+id+ "</h4>");
		  out.printf("<h4>��ȣ:"+password+ "</h4>");
		  out.printf("<h4>����:"+gender+ "</h4>");
		  out.printf("<h4>���Ÿ���:");      
		  if(notice != null) {    
			  for(int i = 0 ; i<notice.length; i++){
				  out.println(notice[i] + ""); 
				  
			  }
		  }else out.println("����");
		  out.println("<p>����:" + job);
		  out.close();
		  
		  
		 
		
	}

}
