package at.schrogl.designpattern.creation.abstractfactory;

/**
 * Die Abstrakte Fabrik stellt eine einheitliche Schnittstelle zu allen
 * konkreten Fabriken dar.
 * <p>
 * In ihrer Grundversion (hier umgesetzt) deklariert die Abstrakte Fabrik eine
 * Fabrikmethode für jedes Produkt welches erzeugt werden kann. Die konkreten
 * Fabriken überschreiben die Fabrikmethoden dann mit ihren spezifischen
 * Implementierungen.
 * <p>
 * <b>Modifikationen:</b>
 * <ul>
 * <li>anstelle einer Factorymethode je Produkt kann man auch eine
 * parametrisierte Factorymethode verwenden. Dadurch muss man die
 * Schnittstellendefinition nicht ändern, wenn ein neues Produkt hinzukommt,
 * allerdings hat man auch nur mehr einen Typen als Rückgabewert. D.h. um
 * sinnvoll mit den erzeugten Produkten arbeiten zu können muss der Client einen
 * Downcast durchführen.
 * <li>anstelle des Factorymethod-Patterns kann man eine Abstrakte Fabrik auch
 * mit dem Prototype-Pattern implementieren
 * <li>statt die konkreten Fabriken direkt zu erzeugen könnte man dies auch über
 * die Abstrake Fabrik lösen. Hierfür könnte man eine entsprechende
 * Factorymethode mit oder ohne Parameter verwenden.
 * </ul>
 * 
 * @author Fritz Schrogl
 */
public interface AbstractFactory {

	public AbstractProduct1 createProduct1();

	public AbstractProduct2 createProduct2();

	public AbstractProduct3 createProduct3(String param);

}
