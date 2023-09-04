package AbstractFactoryPattern.Assignment;

public class RoundedShapeFactory implements ShapeFactory {
	
	public  Shape createShape(String type) {
		Shape shape = null;
		if(type.equalsIgnoreCase("Rectangle")) {
		  shape = new Rectangle();
		}
		else if (type.equalsIgnoreCase("Square")) {
			shape = new Square();
		}
		return shape;
	}

}
