package april.week4.Ex5.FrameWorkProblem;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBordList();
		for(Board board  : list) {
			System.out.println(board.getContent() + " - " + board.getTitle());
		}
	}
}
