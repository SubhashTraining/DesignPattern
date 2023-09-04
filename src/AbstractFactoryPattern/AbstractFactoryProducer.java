package AbstractFactoryPattern;

public abstract class AbstractFactoryProducer extends DAOAbstractFactory{
	
	public static DAOAbstractFactory createAbstractFactory(String type) {
		DAOAbstractFactory daoAbstactFactory =null;
		if (type.equalsIgnoreCase("DB")) {
			daoAbstactFactory = new DBDAOFactory();
		}
		else if (type.equalsIgnoreCase("XML")) {
			daoAbstactFactory = new XMLDAOFactory();
		}
		
		return daoAbstactFactory;
	}

}
