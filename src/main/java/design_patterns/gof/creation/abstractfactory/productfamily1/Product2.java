package design_patterns.gof.creation.abstractfactory.productfamily1;

import design_patterns.gof.creation.abstractfactory.AbstractProduct2;

/**
 * Konkretes Produkt-2 der 1.Produktfamilie
 * <p>
 * Implementiert die abstrake Schnittstelle für Produkt-2. Ein Client arbeitet
 * mit diesem Produkt nur über dessen abstrake Schnittstelle.
 * 
 * @author Fritz Schrogl
 */
public class Product2 implements AbstractProduct2 {

	@Override
	public void methodSpecificToProduct2() {
		// Do something
	}

}
