interface WebPage {
	void display();
}

class BasicWebPage implements WebPage {
	private String content;

	public BasicWebPage(String content) {
		this.content = content;
	}

	@Override
	public void display() {
		System.out.println(content);
	}
}

abstract class Decorator implements WebPage {
	private WebPage page;

	public Decorator(WebPage page) {
		this.page = page;
	}

	public void display() {
		page.display();
	}
}

class Authorize extends Decorator {
	public Authorize(WebPage page) {
		super(page);
	}

	public void display() {
		super.display();
		checkAuthorization();
	}

	private void checkAuthorization() {
		System.out.println("Checking authorization...");
	}
}

class SplitPage extends Decorator {
	public SplitPage(WebPage page) {
		super(page);
	}

	@Override
	public void display() {
		super.display();
		SplitedContent();
	}

	private void SplitedContent() {
		System.out.println("Spliting Content...");
	}
}

public class WebApplication {
	public static void main(String[] args) {
		WebPage page = new BasicWebPage("hello world");
		WebPage authorizePage = new Authorize(page);
		WebPage splitPage = new SplitPage(authorizePage);
		splitPage.display();
	}
}