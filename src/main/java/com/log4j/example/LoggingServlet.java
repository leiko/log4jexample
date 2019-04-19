package com.log4j.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet("/Hello")
public class LoggingServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		Logger logger = Logger.getLogger("LoggingServlet");
		
 
		PrintWriter out = resp.getWriter();
		
		logger.error("error");
		logger.debug("message");
		logger.info("info");
		logger.fatal("fatal");
		
		out.println("See the 'error', 'debug', 'info' and 'fatal' logs in the server.log");
		
		out.close();
		
	}

}
