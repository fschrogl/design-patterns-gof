package design_patterns.gof.creation.abstractfactory.productfamily1;

import design_patterns.gof.creation.abstractfactory.AbstractFactory;
import design_patterns.gof.creation.abstractfactory.AbstractProduct1;
import design_patterns.gof.creation.abstractfactory.AbstractProduct2;
import design_patterns.gof.creation.abstractfactory.AbstractProduct3;

/**
 * Konkrete Fabrik für die 1.Produktfamilie
 * <p>
 * Eine konkrete Fabrik implementiert die Abstrake Fabrik und überschreibt deren
 * Fabrikmethoden mit konkreten Implementierungen. Die konkrete Fabrik kann
 * konkrete Produkttypen zurück liefern oder deren abstrakte Schnittstellen.
 * <p>
 * Da im Allgemeinen nur eine Instanz einer konkreten Fabrik je Applikation
 * benötigt wird implementiert man eine konkrete Fabrik oft als Singleton.
 * 
 * @author Fritz Schrogl
 */
public class ConcreteFactory1 implements AbstractFactory {

	private static ConcreteFactory1 instance = null;

	private ConcreteFactory1() {
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
	 * Die konkrete Fabrik ist als Singleton implementiert.
	 * <code>getInstance</code> ist die zugehörige Factorymethode.
	 * 
	 * @return
	 *         Die einzige Instanz dieser konkreten Fabrik
	 */
	public static AbstractFactory getInstance() {
		if (instance == null)
			instance = new ConcreteFactory1();
		return instance;
	}

}
