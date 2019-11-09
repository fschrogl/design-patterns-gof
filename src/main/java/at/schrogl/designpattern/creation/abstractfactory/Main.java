package at.schrogl.designpattern.creation.abstractfactory;

import at.schrogl.designpattern.creation.abstractfactory.abstractproduct.AbstractFactory;
import at.schrogl.designpattern.creation.abstractfactory.productfamily1.ConcreteFactory1;
import at.schrogl.designpattern.creation.abstractfactory.productfamily2.ConcreteFactory2;

import java.util.ArrayList;
import java.util.List;

/**
 * Usage example of an abstract factory
 * 
 * @author Fritz Schrogl
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * Creation of product family 1
		 */
		AbstractFactory factory = ConcreteFactory1.getInstance();
		createProductCatalog(factory);

		/*
		 * Creation of product family 2
		 */
		factory = ConcreteFactory2.getInstance();
		createProductCatalog(factory);
	}

	/**
	 * The client only interacts with the factory and its products through interfaces.
	 * Hence different product families can be created without the need to change the code using
	 * this factory/prodcuts.
	 */
	private static List<Object> createProductCatalog(AbstractFactory factory) {
		List<Object> catalog = new ArrayList<>(3);

		catalog.add(factory.createProduct1());
		catalog.add(factory.createProduct2());
		catalog.add(factory.createProduct3("someValue"));

		return catalog;
	}

}
