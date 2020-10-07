package at.schrogl.designpattern.creation.prototype;

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

public class AbstractPrototype {

	protected String value1;
	protected int value2;

	protected void someMethod() {

	}

	protected String getValue1() {
		return value1;
	}

	protected void setValue1(String value1) {
		this.value1 = value1;
	}

	protected int getValue2() {
		return value2;
	}

	protected void setValue2(int value2) {
		this.value2 = value2;
	}

	/**
	 * The prototype's clone method can be implemented using a language's special constructs (like here)
	 * or by hand. Result is the same: the object gets copied/cloned.
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
