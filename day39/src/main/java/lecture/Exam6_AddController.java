package lecture;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Model : 데이터를 처리하는 클래스 (오라클과 연동)
// View : 입력/출력을 하는 화면, 현재는 JSP
// Controller : 적절한 모델과 뷰를 연결하며 작업을 제어하는 클래스 (서블릿)

// 서블릿은 적절한 뷰를 보여주는 컨트롤러이며, 하나의 작업을 의미한다.
@WebServlet("/model2/add")
public class Exam6_AddController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		입력하는 화면이 필요하다면 보여준다.
//		화면을 이동하는 방법
//		forward : request 가 계속 전달된다 (같은 작업이 계속된다).
//				  주소가 바뀌지 않는다.
//		redirect : 새로운 request 를 만든다 즉, 새로운 작업
//				   주소가 바뀐다.
		RequestDispatcher rd = request.getRequestDispatcher("start.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		출력하는 화면 또는 다른 작업으로 이동
		long value1 = Long.parseLong(request.getParameter("value1"));
		long value2 = Long.parseLong(request.getParameter("value2"));
		long result = value1 + value2;
		
//		1단계 => 2단계 => 3단계 ... 이어지는 작업이 있다면
//		하나의 작업 : request 가 계속 이어지는 작업도 있다.
//		새로운 작업 : 이제 새로운 request 로 시작한다.
		RequestDispatcher rd = request.getRequestDispatcher("end.jsp");
		request.setAttribute("result", result);
		rd.forward(request, response);
		
	}

}
