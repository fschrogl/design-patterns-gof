package at.schrogl.designpattern.creation.factorymethod.product;

import java.math.BigDecimal;

public class Product {

	private String name;
	private BigDecimal price;

	private Product() {
		// Intentional
	}

	private Product(String name, String price) {
		this.name = name;
		this.price = new BigDecimal(price);
	}

	public static Product newInstance() {
		return new Product("noname", "0");
	}

	public static Product newInstance(String name, double price) {
		return new Product(name, String.valueOf(price));
	}

}
