package Logger;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String aLog) {
		System.out.println("***" + aLog + "***");
	}

	@Override
	public void error(String aError) {
		System.out.println("*************");
		System.out.println("***" + aError + "***");
		System.out.println("*************");
	}

}
