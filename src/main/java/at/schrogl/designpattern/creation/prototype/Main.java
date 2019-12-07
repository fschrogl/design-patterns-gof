package at.schrogl.designpattern.creation.prototype;

public class Main {

	public static void main(String[] args) throws Exception {
		ConcretePrototype concretePrototype = new ConcretePrototype();
		concretePrototype.setTrue(true);

		ConcretePrototype clonedPrototype = (ConcretePrototype) concretePrototype.clone();
		clonedPrototype.setTrue(false);

		// ...
	}
}
