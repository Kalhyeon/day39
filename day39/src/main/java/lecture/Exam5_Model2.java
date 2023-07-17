package lecture;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 1개 = 작업 하나
// => 작업을 하려면 서블릿 + 입력 화면, 출력 화면
// model1 은 입력 JSP 를 사용자가 실행한다.
// model2 는 서블릿 주소로 들어오면 입력 화면을 보여준다.
//			사용자가 볼 때 작업의 시작부터 종료까지 하나의 주소이다.
@WebServlet("/sogae")
public class Exam5_Model2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		입력 화면을 보여준다.
		RequestDispatcher rd = request.getRequestDispatcher("model2s.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		처리한 다음 결과를 출력한다.
		String name = request.getParameter("name");
		RequestDispatcher rd = request.getRequestDispatcher("model2e.jsp");
		request.setAttribute("name", name);
		rd.forward(request, response);
	}

}
