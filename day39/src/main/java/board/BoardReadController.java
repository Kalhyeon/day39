package board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/read")
public class BoardReadController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long bno = Long.parseLong(request.getParameter("bno"));
//		bno 를 가지고 DB 에서 글을 읽어왔다고 하고...
		request.setAttribute("bno", bno + "번 글");
		RequestDispatcher rd = request.getRequestDispatcher("/board/read.jsp");
		rd.forward(request, response);
	}
	
}
