package week3.Ex3.ClassProblem;

public class ShopService {
	private static ShopService shopService = null;
	
	public ShopService() {
		// TODO Auto-generated constructor stub
	}
	
	public static ShopService getInstance() {
		if(shopService== null) {
			shopService = new ShopService();
		}
		return shopService;
	}
	
}
