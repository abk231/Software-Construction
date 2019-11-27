package mediatorpattern;

import java.util.Date;

/**
 * @author Abdullah Khan
 * @author Sohail Nawaz
 * @author M Abad Khan
 * @category Mediator Pattern
 * @since 26-Nov-19
 * @version 1.0
 * This Program is about mediator pattern in java. In which the mediator class is chatroom.
 *
 */

public class Chatroom {
   /**
 * @param user This is the User class which is used for reference and communication
 * @param message this is message from main class...
 */
public static void showMessage(User user, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }
}
