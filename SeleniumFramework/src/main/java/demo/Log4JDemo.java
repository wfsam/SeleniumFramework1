package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4JDemo {

	private static Logger logger  = LogManager.getLogger(Log4JDemo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello...");
		
		logger.trace("This is the trace");
		logger.info("This is information message");
		logger.error("This is an error message!");
		logger.warn("Warning Message");
		logger.fatal("Fatal Message");

		System.out.println("\n Completed\n");
	}

}
