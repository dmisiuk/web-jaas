package by.minsler.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * User: dzmitry.misiuk
 * Date: 11/22/12
 * Time: 10:43 AM
 */
public class Log4jInit extends javax.servlet.http.HttpServlet {

    public void init()
    {
        String prefix =  getServletContext().getRealPath("/");
        String file = getInitParameter("log4j-init-file");

        // if the log4j-init-file context parameter is not set, then no point in trying
        if(file != null){
            PropertyConfigurator.configure(prefix + file);
            System.out.println("Log4J Logging started: " + prefix+file);
            Logger logger = Logger.getLogger(Log4jInit.class);
            logger.info("started logging");
        }
        else{
            System.out.println("Log4J Is not configured for your Application: " + prefix + file);
        }
    }
}
