package by.minsler.by.minsler.contoller;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * User: dzmitry.misiuk
 * Date: 11/22/12
 * Time: 12:00 PM
 */
public class LoginServlet extends HttpServlet {

   // private Logger logger = Logger.getLogger("web-jaas-logger");
    private Logger logger = Logger.getLogger(LoginServlet.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.error("Connected to LoginServlet");
    }
}