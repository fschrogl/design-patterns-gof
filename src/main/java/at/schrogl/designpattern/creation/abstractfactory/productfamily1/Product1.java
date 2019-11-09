package at.schrogl.designpattern.creation.abstractfactory.productfamily1;

import at.schrogl.designpattern.creation.abstractfactory.abstractproduct.AbstractProduct1;

/**
 * Konkretes Produkt-1 der 1.Produktfamilie
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
