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
		  request.setCharacterEncoding("utf-8");         //한글 나오게 할떄는 엔코딩 꼭해주기 ** 공식 
		  response.setContentType("text/html;charset=utf-8");

		  String name = request.getParameter("name");
		  String id = request.getParameter("id");
		  String password = request.getParameter("password");
		  String gender = request.getParameter("gender");  //라디오는 하나씩 체크되서 그냥 잡기 
		  String[] notice = request.getParameterValues("notice"); //노티스는 멀티라서 배열로 잡기 
		  String job = request.getParameter("job");

		  PrintWriter out=response.getWriter(); //프린트하기전에 꼭 적어주기 *공식

		
		  out.println("<html><body><h1>개인정보</h1>");
		  out.printf("<h4>이름:"+name+ "</h4>");
		  out.printf("<h4>아이디:"+id+ "</h4>");
		  out.printf("<h4>암호:"+password+ "</h4>");
		  out.printf("<h4>성별:"+gender+ "</h4>");
		  out.printf("<h4>수신메일:");      
		  if(notice != null) {    
			  for(int i = 0 ; i<notice.length; i++){
				  out.println(notice[i] + ""); 
				  
			  }
		  }else out.println("없음");
		  out.println("<p>직업:" + job);
		  out.close();
		  
		  
		 
		
	}

}
