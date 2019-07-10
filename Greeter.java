
public class Greeter {
	
	final String GREETING = "Hello ";
	private String name;
	
	public Greeter(String name) {
		this.name = name;
	}

	public String greeting() {
		return GREETING + name;
	}

	
}
