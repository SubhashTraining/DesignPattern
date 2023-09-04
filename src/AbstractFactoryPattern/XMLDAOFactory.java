package AbstractFactoryPattern;

public class XMLDAOFactory extends DAOAbstractFactory{
	
	public  DAO createDAOFactory(String xmlFactoryName) {
		
		DAO dao= null;
		
		if (xmlFactoryName.equalsIgnoreCase("Emp")) {
			dao = new XMLEmployeeDAO();
		}
		else if (xmlFactoryName.equalsIgnoreCase("Dep")) {
			dao = new XMLDeptDAO();
			
		}
		
		return dao;
	
	
}

	
}