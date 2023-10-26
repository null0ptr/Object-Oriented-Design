import java.util.HashMap;
import java.util.Map;

interface retailStore {
	Integer getPrice(String product);
}

class Store implements retailStore {
	private Map<String, Integer> price;

	public Store() {
		price = new HashMap<String, Integer>();
		price.put("A", 50);
		price.put("B", 60);
		price.put("C", 70);
		price.put("D", 80);
	}

	@Override
	public Integer getPrice(String key) {
		return price.get(key);
	}
}

class RetailStoreProxy implements retailStore {
	private Store mainStore;

	public RetailStoreProxy() {
		mainStore = new Store();
	}

	@Override
	public Integer getPrice(String product) {
		return mainStore.getPrice(product);
	}
}

public class RetailStore {
	public static void main(String[] args) {
		Store store = new Store();
		String a = "A";
		String b = "B";
		String c = "C";
		String d = "D";
		int priceA = store.getPrice(a);
		int priceB = store.getPrice(b);
		int priceC = store.getPrice(c);
		int priceD = store.getPrice(d);
		System.out.println("Price of A $ " + priceA);
		System.out.println("Price of B $ " + priceB);
		System.out.println("Price of C $ " + priceC);
		System.out.println("Price of D $ " + priceD);
	}
}