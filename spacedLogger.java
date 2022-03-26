
public class spacedLogger implements Logger {

	public static void main(String[] args) {

	}

	@Override
	public void log(String log) {
		StringBuilder spaceLog = new StringBuilder(log);
		for (int i = 0; i <= log.length()+2; i++) {
			if (i%2!=0)
			spaceLog.insert(i , " ");
		}
		System.out.println(spaceLog.toString());
	}

	@Override
	public void error(String error) {
		System.out.printf("Error: ");
		StringBuilder spaceLog = new StringBuilder(error);
		for (int i = 0; i <= error.length()+2; i++) {
			if (i%2 !=0)
			spaceLog.insert(i , " ");
		}
		System.out.println(spaceLog.toString());
	}

}
