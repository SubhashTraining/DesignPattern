package com.trianing.designPatterns.singleton.Assignment;

import java.io.Serializable;

public class Logger implements Serializable,Cloneable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger instance;
	
	private Logger(){
		
		
	}
	
	public static Logger getInstance() {
		
		if(instance == null) {
			synchronized(Logger.class) {
				instance = new Logger();
				
			}
		}
		return instance;
		
	}
	
	
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	protected Object readResolve() {
		return instance;
	}
	
	public  void log(String message) {
		System.out.println(message); 
	}
}
