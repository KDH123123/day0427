package nowon.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import nowon.domain.dto.BoardDTO;

@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("/board로 요청시 실행");
		SqlSessionFactory sqlSessionFactory =
		(SqlSessionFactory) getServletContext().getAttribute("sqlSessionFactory");//object타입으로 저장했기 때문에 캐스팅 해야됨
		
		SqlSession sqlSession = sqlSessionFactory.openSession();//Session만들어주는 공장
		
		List<BoardDTO> list = sqlSession.selectList("boardMapper.all");//xml의 id에 맞추기
		System.out.println(list.size());//list에 board dto가 저장되어있음
		sqlSession.close();
		
		request.setAttribute("list", list);//list로 저장해서 포장. "list"로 불러오면 됨
		//list 페이지이동
		String path = "list.jsp";
		request.getRequestDispatcher(path).forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
