interface Type {
	void moduleType();
}

class Check implements Type {
	public void moduleType() {
		System.out.println("Checking");
	}
}

class Save implements Type {
	public void moduleType() {
		System.out.println("Saving");
	}
}

class Invest implements Type {
	public void moduleType() {
		System.out.println("Investing");
	}
}

class Service {
	private Type saving;
	private Type checking;
	private Type investing;

	public Service() {
		saving = new Save();
		checking = new Check();
		investing = new Invest();
	}

	public void saveMoney() {
		saving.moduleType();
	}

	public void checkMoney() {
		checking.moduleType();
	}

	public void investMoney() {
		investing.moduleType();
	}
}

public class BankingService {
	public static void main(String[] args) {
		Service service = new Service();
		service.investMoney();
		service.checkMoney();
		service.saveMoney();
	}
}