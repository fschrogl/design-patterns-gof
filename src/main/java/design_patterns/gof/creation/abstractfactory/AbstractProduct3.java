package design_patterns.gof.creation.abstractfactory;

/**
 * Schnittstellendefinition des 3.Produkts
 * <p>
 * Alle konkreten Umsetzungen von Produkt-3 implementieren diese Schnittstelle.
 * Die entsprechende Factorymethode der Abstrakten Fabrik liefert die
 * Produktschnittstelle als Rückgabewert und der Client arbeitet mit dem Produkt
 * nur über dessen Schnittstellendefinition.
 * 
 * @author Fritz Schrogl
 */
public interface AbstractProduct3 {

	public String getParam();

	public void setParam(String value);

}
