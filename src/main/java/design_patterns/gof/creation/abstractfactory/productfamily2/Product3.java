package design_patterns.gof.creation.abstractfactory.productfamily2;

import design_patterns.gof.creation.abstractfactory.AbstractProduct3;

/**
 * Konkretes Produkt-3 der 2.Produktfamilie
 * <p>
 * Implementiert die abstrake Schnittstelle für Produkt-3. Ein Client arbeitet
 * mit diesem Produkt nur über dessen abstrake Schnittstelle.
 * 
 * @author Fritz Schrogl
 */
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
