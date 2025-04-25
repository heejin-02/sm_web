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
 * Servlet implementation class TableServlet
 */
@WebServlet("/TableServlet")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TableServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) throws ServletException {

	}

	public void destroy() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request.getParameter("form의 name값")
		// 요청 관련 객체가 가지고 있는 파라미터 값을 String으로 리턴
		String num = request.getParameter("num");
		int i_num = Integer.parseInt(num);

		// 브라우저에 출력하기 위해 응답 데이터의 인코딩 형식을 지정
		response.setContentType("text/html; charset=UTF-8");

		// 받은 데이터 웹페이지에 출력
		PrintWriter out = response.getWriter();
		out.print("<table border=\"1px solid black\"><tr>");
		for (int i = 1; i <= i_num; i++) {
			out.print("<td>");
			out.print(i);
			out.print("</td>");
			
		}
		out.print("</tr></table>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
