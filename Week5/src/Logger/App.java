package Logger;

public class App {

	public static void main(String[] args) {
		AsteriskLogger alpha = new AsteriskLogger();
		SpacedLogger beta = new SpacedLogger();
		
		alpha.log("Hello");
		System.out.println("");
		alpha.error("Warning");
		System.out.println("");
		beta.log("Hello");
		System.out.println("");
		beta.error("Warning");

	}

}
