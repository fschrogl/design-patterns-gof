package at.schrogl.designpattern.creation.abstractfactory.productfamily2;

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
import at.schrogl.designpattern.creation.abstractfactory.abstractproduct.AbstractProduct1;
import at.schrogl.designpattern.creation.abstractfactory.abstractproduct.AbstractProduct2;
import at.schrogl.designpattern.creation.abstractfactory.abstractproduct.AbstractProduct3;

/**
 * Factory for creating objects of product family 2.
 *
 * The factory methods for each product are allowed to return the product interface or the
 * product type itself.
 *
 * It is not required for a factory to be implemented as singleton, but often done so.
 */
public class ConcreteFactory2 implements AbstractFactory {

	private static ConcreteFactory2 instance = null;

	private ConcreteFactory2() {
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
			instance = new ConcreteFactory2();
		return instance;
	}

}
