package at.schrogl.designpattern.creation.abstractfactory;

/*-
 * #%L
 * Design Patterns
 * %%
 * Copyright (C) 2018 - 2020 Fritz Schrogl
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

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
