package design_patterns.gof.creation.abstractfactory.productfamily2;

import design_patterns.gof.creation.abstractfactory.AbstractProduct1;

/**
 * Konkretes Produkt-1 der 2.Produktfamilie
 * <p>
 * Implementiert die abstrake Schnittstelle für Produkt-1. Ein Client arbeitet
 * mit diesem Produkt nur über dessen abstrake Schnittstelle.
 * 
 * @author Fritz Schrogl
 */
public class Product1 implements AbstractProduct1 {

	@Override
	public void methodSpecificToProduct1() {
		// Do something
	}
}
