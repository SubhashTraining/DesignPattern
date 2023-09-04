package AbstractFactoryPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAOAbstractFactory daoFactory = AbstractFactoryProducer.createAbstractFactory("XML");
		
		daoFactory.createDAOFactory("Emp").save();
	}

}
