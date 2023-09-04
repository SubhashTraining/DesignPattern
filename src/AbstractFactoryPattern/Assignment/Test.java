package AbstractFactoryPattern.Assignment;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory factory = ShapeFactoryProducer.createFactory("RoundedShape");
		factory.createShape("Rectangle").draw();
		

	}

}
