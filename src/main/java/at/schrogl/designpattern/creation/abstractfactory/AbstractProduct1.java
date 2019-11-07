package at.schrogl.designpattern.creation.abstractfactory;

/**
 * Schnittstellendefinition des 1.Produkts
 * <p>
 * Alle konkreten Umsetzungen von Produkt-1 implementieren diese Schnittstelle.
 * Die entsprechende Factorymethode der Abstrakten Fabrik liefert die
 * Produktschnittstelle als Rückgabewert und der Client arbeitet mit dem Produkt
 * nur über dessen Schnittstellendefinition.
 * 
 * @author Fritz Schrogl
 */
public interface AbstractProduct1 {

	public void methodSpecificToProduct1();

}
