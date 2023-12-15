package week4.Ex1.InterfaceProblem;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Oracle에서 DB 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Oracle에서 DB 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle에서 DB 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Oracle에서 DB 삭제");
	}
	
}
