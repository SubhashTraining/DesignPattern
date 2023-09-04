package Factory.Assignment;

public class PersonFactory {
	
	public static Person createPerson(String text) {
		Person person =null;
		
		if(text.equalsIgnoreCase("Male")) {
			person = new Male();
		}
		else if(text.equalsIgnoreCase("Female")) {
			person =  new Female();
		}
		
		return person;
	}

}
	