package at.schrogl.designpattern.creation.abstractfactory.productfamily1;

import at.schrogl.designpattern.creation.abstractfactory.AbstractProduct3;

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
