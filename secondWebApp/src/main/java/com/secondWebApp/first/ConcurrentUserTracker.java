package com.secondWebApp.first;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ConcurrentUserTracker implements HttpSessionListener {
	  static int users = 0;

	  public void sessionCreated1(HttpSessionEvent e) {
	    ++users;
	    System.out.println("new session is created");
	  }
	  public void sessionDestroyed1(HttpSessionEvent e) {
	    ++users;
	    System.out.println("session is created destroyed");
	  }
	  public static int getConcurrentUsers() {
	    return users;
	  }
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	}
