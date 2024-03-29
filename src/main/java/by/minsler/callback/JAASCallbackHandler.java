package by.minsler.callback;

import org.apache.log4j.Logger;

import javax.security.auth.callback.*;
import java.io.IOException;

/**
 * @author semika
 *
 */
 public class JAASCallbackHandler implements CallbackHandler {

 private static final Logger LOGGER = Logger.getLogger(JAASCallbackHandler.class);
 
 private String username = null;
 private String password = null;
 
 /**
  * @param username
  * @param password
  */
 public JAASCallbackHandler(String username, String password) {
     this.username = username;
     this.password = password;
 }


 @Override
 public void handle(Callback[] callbacks) throws IOException,
   UnsupportedCallbackException {
  
     LOGGER.info("Callback Handler invoked ");
  
     for (int i = 0; i < callbacks.length; i++) {
        if (callbacks[i] instanceof NameCallback) {
           NameCallback nameCallback = (NameCallback) callbacks[i];
           nameCallback.setName(username);
        } else if (callbacks[i] instanceof PasswordCallback) {
           PasswordCallback passwordCallback = (PasswordCallback) callbacks[i];
           passwordCallback.setPassword(password.toCharArray());
        } else {
           throw new UnsupportedCallbackException(callbacks[i], "The submitted Callback is unsupported");
        }
     }
 }
}
