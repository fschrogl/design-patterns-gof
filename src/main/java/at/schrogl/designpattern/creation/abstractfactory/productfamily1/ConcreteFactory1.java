package at.schrogl.designpattern.creation.abstractfactory.productfamily1;

import at.schrogl.designpattern.creation.abstractfactory.abstractproduct.AbstractFactory;
import at.schrogl.designpattern.creation.abstractfactory.abstractproduct.AbstractProduct1;
import at.schrogl.designpattern.creation.abstractfactory.abstractproduct.AbstractProduct2;
import at.schrogl.designpattern.creation.abstractfactory.abstractproduct.AbstractProduct3;

/**
 * Factory for creating objects of product family 1.
 *
 * The factory methods for each product are allowed to return the product interface or the
 * product type itself.
 *
 * It is not required for a factory to be implemented as singleton, but often done so.
 */
public class ConcreteFactory1 implements AbstractFactory {

	private static ConcreteFactory1 instance = null;

	private ConcreteFactory1() {
		// this concrete factory implements the singleton pattern
	}

	@Override
	public AbstractProduct1 createProduct1() {
		return new Product1();
	}

	@Override
	public AbstractProduct2 createProduct2() {
		return new Product2();
	}

	@Override
	public AbstractProduct3 createProduct3(String param) {
		Product3 product = new Product3();
		product.setParam(param);
		return product;
	}

	/**
	 * A factory method for obtaining an instance of this factory
	 */
	public static AbstractFactory getInstance() {
		if (instance == null)
			instance = new ConcreteFactory1();
		return instance;
	}

}
