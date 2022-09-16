package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Num
 */
@WebServlet("/Num")
public class Num extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Num() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
     request.setCharacterEncoding("utf-8");      
	 response.setContentType("text/html;charset=utf-8");
	 
	 //¼ýÀÚ¶ó¼­ ÆÄ½Ì ÇØÁÖ±â ²À **
	 int num1 = Integer.parseInt(request.getParameter("num1"));
	 int num2 = Integer.parseInt(request.getParameter("num2"));
     float num3 = (float)num1/num2;
     
 
	 PrintWriter out=response.getWriter();
	 out.println("<html><body>");
	 
	 out.println("<h1>¿¬»ê°á°ú </h1>");
	 out.printf("µ¡¼À:%d + %d = %d<br>" , num1, num2 ,(num1+num2));
	 out.printf("»¬¼À:%d - %d = %d<br>" , num1, num2 ,(num1-num2));
	 out.printf("°ö¼À:%d * %d = %d<br>" , num1, num2 ,(num1*num2));
	 out.printf("³ª´°¼À:%d / %d = %f<br>" , num1, num2 ,num3);
	 out.println("</body></html>");
     out.close();


	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
