package design_patterns.gof.creation.singleton;

/**
 * <p>
 * Implementierung eines Singletons.
 * </p>
 * Eine Klasse, welche ein Singleton sein soll, muss folgende Eigenschaften
 * aufweisen:
 * <ol>
 * <li>einen privaten Konstruktor
 * <li>eine private Klassenvariable, welche die Instanz referenziert
 * <li>eine öffentliche Factorymethode
 * </ol>
 * 
 * @author Fritz Schrogl
 */
public class Singleton {

	/**
	 * Interne Referenz auf die Instanz des Singletons
	 */
	private static Singleton instance = null;

	/**
	 * Privater Konstruktor des Singletons. Kann nur vom Singleton selbst
	 * aufgerufen werden (Ausnahme: Reflection).
	 */
	private Singleton() {
	}

	/**
	 * Factorymethode des Singletons
	 * 
	 * @return Die einzige Instanz des Singletons
	 */
	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}

}
