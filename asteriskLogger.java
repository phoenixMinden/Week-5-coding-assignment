
public class asteriskLogger implements Logger{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(String log) {
		System.out.println("***"+ log + "***");
	}

	@Override
	public void error(String error) {
		System.out.print("*************");
		for (int i = 0; i<error.length(); i++) {
			System.out.printf("*");	
		}
		System.out.println("");
		System.out.println("***Error: " + error + "***");
		System.out.printf("*************");
		for (int i = 0; i<error.length(); i++) {
			System.out.printf("*");	
		}
		System.out.println("");
		
	}

}
