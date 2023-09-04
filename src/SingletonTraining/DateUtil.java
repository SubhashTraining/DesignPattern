package SingletonTraining;

import java.io.Serializable;

public class DateUtil implements Serializable{

	private static final long serialVersionUID = 1L;
	private static DateUtil instance;
	
	private DateUtil() {
			
	}
	
	public static  DateUtil getInstance() {// Lazy Initializtion
		
		if(instance == null) {
			synchronized(DateUtil.class) {
				
				instance = new DateUtil(); 
			}
			
		}
		return instance;
		
	}	
	
	protected Object readResolve() {
		return instance;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
		
	}
	
}

