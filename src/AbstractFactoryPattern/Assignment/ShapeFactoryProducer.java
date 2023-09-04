package AbstractFactoryPattern.Assignment;

public class ShapeFactoryProducer  {


	public static ShapeFactory createFactory(String type) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory= null;
		if(type.equalsIgnoreCase("RoundedShape")) {
			shapeFactory = new RoundedShapeFactory();
		}
		else if(type.equalsIgnoreCase("NormalShape")) {
			shapeFactory = new NormalShapeFactory();
		}
		return shapeFactory;
	}

}
