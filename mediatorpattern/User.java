package mediatorpattern;

/**
 * @author Abdullah Khan
 * @category User class for setting the users in chatroom which takes and set the name of the users.
 *
 */
public class User {
	   /**
	 * Name Variable is declared
	 */
	private String name;

	   /**
	 * @return This will get and return the name of user
	 */
	public String getName() {
	      return name;
	   }

	   /**
	 * @param name This will set the name...
	 */
	public void setName(String name) {
	      this.name = name;
	   }

	   /**
	 * @param name This is a constructor of user class
	 */
	public User(String name){
	      this.name  = name;
	   }

	   /**
	 * @param message This method will send message and send the reference of that class to chatroom
	 */
	public void sendMessage(String message){
	      Chatroom.showMessage(this,message);
	   }
	}
