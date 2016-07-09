package AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String type) {
		if(type ==null){
			return null;
		}else if(type.equalsIgnoreCase("circle")){
			return new Circle();
		}else if(type.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else if(type.equalsIgnoreCase("square")){
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
