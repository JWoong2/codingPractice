package april.week4.Ex5.FrameWorkProblem;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> list;
	int index=0;
	
	public List<Board> getBordList() {
		// TODO Auto-generated method stub
		return this.list;
	}

	public BoardDao() {
		this.list = new ArrayList<Board>();
		for(int i= 0; i<3; i++) {
			list.add(new Board("제목"+ ++index, "내용"+ index));	
		}
	}
}
