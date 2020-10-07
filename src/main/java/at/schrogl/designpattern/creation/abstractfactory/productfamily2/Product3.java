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

import at.schrogl.designpattern.creation.abstractfactory.abstractproduct.AbstractProduct3;

public class Product3 implements AbstractProduct3 {

	private String hashedParam;

	@Override
	public String getParam() {
		return hashedParam;
	}

	@Override
	public void setParam(String value) {
		hashedParam = Integer.toString(value.hashCode());
	}

}
