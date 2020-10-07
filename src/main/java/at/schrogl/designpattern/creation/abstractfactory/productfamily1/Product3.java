package at.schrogl.designpattern.creation.abstractfactory.productfamily1;

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

/**
 * Konkretes Produkt-3 der 1.Produktfamilie
 * <p>
 * Implementiert die abstrake Schnittstelle für Produkt-3. Ein Client arbeitet
 * mit diesem Produkt nur über dessen abstrake Schnittstelle.
 * 
 * @author Fritz Schrogl
 */
public class Product3 implements AbstractProduct3 {

	private String param;

	@Override
	public String getParam() {
		return param;
	}

	@Override
	public void setParam(String value) {
		this.param = value;
	}

}
