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
 * Servlet implementation class FormServlet2
 */
@WebServlet("/PlusServlet")
public class PlusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PlusServlet() {
		super();

	}

	public void init(ServletConfig config) throws ServletException {

	}

	public void destroy() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		int i_num1 = Integer.parseInt(num1);
		int i_num2 = Integer.parseInt(num2);
		
		// 브라우저에 출력하기 위해 응답 데이터의 인코딩 형식을 지정
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print(num1+"+"+num2+"=" + (i_num1+i_num2));

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
