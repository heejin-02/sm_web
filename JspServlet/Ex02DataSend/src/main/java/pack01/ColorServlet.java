package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ColorServlet
 */
@WebServlet("/ColorServlet")
public class ColorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ColorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// request.getParameter("form의 name값")
		// 요청 관련 객체가 가지고 있는 파라미터 값을 String으로 리턴
		String color = request.getParameter("color");

		// 브라우저에 출력하기 위해 응답 데이터의 인코딩 형식을 지정
		response.setContentType("text/html; charset=UTF-8");

		// 받은 데이터 웹페이지에 출력
		PrintWriter out = response.getWriter();
		out.print("<style>");
		out.print("body {");
		out.print("background-color:"+color+";");
		out.print("}");
		out.print("</style>");
		out.print("<h1>선택한색상:"+color+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
