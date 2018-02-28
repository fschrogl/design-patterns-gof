package design_patterns.gof.creation.abstractfactory;

/**
 * Schnittstellendefinition des 2.Produkts
 * <p>
 * Alle konkreten Umsetzungen von Produkt-2 implementieren diese Schnittstelle.
 * Die entsprechende Factorymethode der Abstrakten Fabrik liefert die
 * Produktschnittstelle als Rückgabewert und der Client arbeitet mit dem Produkt
 * nur über dessen Schnittstellendefinition.
 * 
 * @author Fritz Schrogl
 */
public interface AbstractProduct2 {

	public void methodSpecificToProduct2();

}
