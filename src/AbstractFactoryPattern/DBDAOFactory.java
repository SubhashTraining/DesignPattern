package AbstractFactoryPattern;

public class DBDAOFactory extends DAOAbstractFactory{
	
	public   DAO createDAOFactory(String xmlFactoryName) {
		
		DAO dao= null;
		
		if (xmlFactoryName.equalsIgnoreCase("Emp")) {
			dao = new DBEmpDAO();
		}
		else if (xmlFactoryName.equalsIgnoreCase("Dep")) {
			dao = new DBDeptDAO();
			
		}
		
		return dao;
	}
	
}