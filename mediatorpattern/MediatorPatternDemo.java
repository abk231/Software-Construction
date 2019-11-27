package mediatorpattern;

/**
 * @author Abdullah Khan
 * This is the main class in which we created objects and send messages..
 */
public class MediatorPatternDemo  {
	   /**
	 * @param args
	 */
	
	public static void main(String[] args) {
	      User robert = new User("Robert");
	      User john = new User("John");

	      robert.sendMessage("Hi! John!");
	      john.sendMessage("Hello! Robert!");
	   }
	}