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
		    String color =request.getParameter("color");  //컬러를 파라매터로 요청받고 
		    PrintWriter out = response.getWriter(); //출력하기전에 꼭써주기 *공식과 같음 
		    out.printf("<html><body bgcolor='%s' >", color);  //바디문 열고 배경색 설정해주기
		    out.println("</body><html>");                        //바디문 닫고 끝
		    out.close();                                         //클로즈 해주기 
			
		}
		
		
		
		
	
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
