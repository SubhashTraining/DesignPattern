package AbstractFactoryPattern.Assignment;

public class NormalShapeFactory implements ShapeFactory {
	
	public Shape createShape(String type) {
		Shape shape = null;
		if(type.equalsIgnoreCase("Rectangle")) {
		  shape = new RoundedRectangle();
		}
		else if (type.equalsIgnoreCase("Square")) {
			shape = new RoundedSquare();
		}
		return shape;
	}

}
