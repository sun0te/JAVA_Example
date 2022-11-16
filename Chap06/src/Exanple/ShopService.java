package Exanple;
//확인문제 18번
public class ShopService {
	
	private static ShopService shopService = new ShopService();
	
	private ShopService() { }
	
	static ShopService getInstance() {
		return shopService;
	}
}
