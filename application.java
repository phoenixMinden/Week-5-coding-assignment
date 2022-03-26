
public class application {

	public static void main(String[] args) {
		Logger logger = new asteriskLogger();
		Logger spaceLogger = new spacedLogger();
		
		logger.log("Lizards");
		logger.error("Dogs");
		spaceLogger.log("Birds");
		spaceLogger.error("Cats");
	}

}
