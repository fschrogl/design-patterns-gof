/**
 * Erzeugermuster: <i>Abstract Factory</i>
 * <p>
 * <img src="doc-files/abstract_factory.png"
 * alt="Abstract factory pattern diagram"> <b>Zweck:</b>
 * <p>
 * <b>Zweck:</b>
 * <p>
 * Die abstrake Fabrik ist ein objektbasiertes Erzeugermuster. Sie stellt eine
 * Schnittstelle zum Erzeugen von Familien verwandter oder voneinander
 * abhängiger Objekte dar, ohne das der Client deren konkrete Klassen kennen
 * muss. Eine klassische Anwendung für die abstrake Fabrik sind z.B. die
 * Erzeugung von UI-Widgets für unterschiedliche Look-and-Feels. Die abstrakte
 * Fabrik erzeugt Widgets, die dem aktuell ausgewählten Look-and-Feel
 * entsprechen. Der Client bleibt davon komplett unberührt (keine Änderung
 * notwendig).
 * <p>
 * <b>Anwendbarkeit / Konsequenzen:</b>
 * <ol>
 * <li>Unabhängigkeit: wenn das System unabhängig davon sein soll, wie seine
 * Produkte erzeugt werden
 * <li>mehrere Produktfamilien: wenn das System mit mehreren Produktgruppen
 * konfiguriert werden kann/soll
 * <li>Klassenbibliothek: wenn man eine Klassenbibliothek schreibt, von der man
 * nur die Schnittstellen bekannt machen möchte
 * <li>Schnittstellen: der Client arbeitet mit den, von der Fabrik erzeugten,
 * Objekten nur über deren Schnittstellen
 * <li>Zentrale Erzeugung: die Objekte werden nur in der Fabrik erzeugt. Die
 * Erzeugung ist somit zentralisiert
 * <li>Erweiterung um neue Produktfamilien: die Erweiterung einer abstrakten
 * Fabrik um eine neue Produktfamilie erfordert u.U. die Veränderung ihrer
 * Schnittstelle(n), was zu Problemen/Inkompatibilitäten führen kann. Dies
 * sollte man beim Entwurf berücksichtigen.
 * </ol>
 * 
 * @author Fritz Schrogl
 */
package design_patterns.gof.creation.abstractfactory;