package at.schrogl.designpattern.creation.factorymethod;

import at.schrogl.designpattern.creation.factorymethod.product.Product;

public class Main {

	public static void main(String[] args) {
		Product product = Product.newInstance();
		Product anotherProduct = Product.newInstance("anotherProduct", 2.5d);
	}
}
