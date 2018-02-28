package design_patterns.gof.creation.abstractfactory;

import java.util.ArrayList;
import java.util.List;

import design_patterns.gof.creation.abstractfactory.productfamily1.ConcreteFactory1;
import design_patterns.gof.creation.abstractfactory.productfamily2.ConcreteFactory2;

/**
 * Verwendung einer Abstrakten Fabrik
 * 
 * @author Fritz Schrogl
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * Erzeugt einen Produktkatalog der Produktfamilie-1
		 */
		AbstractFactory factory = ConcreteFactory1.getInstance();
		createProductCatalog(factory);

		/*
		 * Erzeugt einen Produktkatalog der Produktfamilie-2
		 */
		factory = ConcreteFactory2.getInstance();
		createProductCatalog(factory);
	}

	/**
	 * Der Client erzeugt einen Produktkatalog mit der ihm übergebenen Factory.
	 * Der Client arbeitet nur über die Schnittstellen der Fabrik (und der
	 * Produkte), daher kann die konkrete Produktfamilie nach belieben
	 * ausgewechselt werden.
	 * 
	 * @param factory
	 *            Fabrik welche die Produkte für den Katalog erzeugt
	 * @return
	 *         Den Produktkatalog
	 */
	private static List<Object> createProductCatalog(AbstractFactory factory) {
		List<Object> catalog = new ArrayList<>(3);

		catalog.add(factory.createProduct1());
		catalog.add(factory.createProduct2());
		catalog.add(factory.createProduct3("someValue"));

		return catalog;
	}

}
