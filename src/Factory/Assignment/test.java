package Factory.Assignment;

public class test {

	public static void main(String args[]) {
		
		Person p = PersonFactory.createPerson("Male");
		p.wish();
	}
	
}
