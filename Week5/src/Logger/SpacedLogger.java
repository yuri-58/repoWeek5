package Logger;

public class SpacedLogger implements Logger{

	@Override
	public void log(String aLog) {
		char alpha;
		String beta = "";
		for(int i = 0; i < aLog.length(); i++) {
			alpha = aLog.charAt(i);
			beta += alpha + " ";
		}
		System.out.println(beta);
	}

	@Override
	public void error(String aError) {
		char alpha;
		String beta = "";
		for(int i = 0; i < aError.length(); i++) {
			alpha = aError.charAt(i);
			beta += alpha + " ";
		}
		System.out.println("ERROR:" + beta);
	}
}
