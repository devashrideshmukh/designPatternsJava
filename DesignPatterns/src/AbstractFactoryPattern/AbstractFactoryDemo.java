package AbstractFactoryPattern;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color red = colorFactory.getColor("Red");
		red.fill();
		Color green = colorFactory.getColor("green");
		green.fill();
		Color blue = colorFactory.getColor("blue");
		blue.fill();
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		Shape square = shapeFactory.getShape("square");
		square.draw();
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
	}
}
