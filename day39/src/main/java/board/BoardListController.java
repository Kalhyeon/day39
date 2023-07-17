package board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/list")
public class BoardListController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		상대 주소 : 현재 위치 기준
//		절대 주소 : 현재 서버 기준
//			forward 방식은 프로젝트의 이름을 적지 않는다.
//			redirect 방식은 반드시 프로젝트의 이름을 포함해야 한다.
		
		RequestDispatcher rd = request.getRequestDispatcher("/board/list.jsp");
//		model 객체를 이용해 글을 읽어와 request 에 저장하는 코드 필요
		rd.forward(request, response);
	}
	
}
