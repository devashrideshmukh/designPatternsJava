package AbstractFactoryPattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {

		if (factory == null) {
			return null;
		} else if (factory.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (factory.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}

		return null;
	}
}
