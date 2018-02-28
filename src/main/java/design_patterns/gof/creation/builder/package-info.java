/**
 * Erzeugermuster: <i>Builder</i>
 * <p>
 * <img src="doc-files/builder.png" alt="Builder pattern diagram">
 * <p>
 * <b>Zweck:</b>
 * <p>
 * Der Builder ist ein objektbasiertes Erzeugungsmuster. Er trennt die
 * Konstruktion eines komplexen Objekts von dessen Repräsentation. Dadurch
 * können mit dem selben Konstruktionsprozess unterschiedliche Repräsentationen
 * des Objekts erzeugt werden.
 * <p>
 * <b>Anwendbarkeit / Konsequenzen:</b>
 * <ol>
 * <li>Unabhängigkeit: der Algorithmus zum Erzeugen eines komplexen Objekts soll
 * unabhängig von den Teilen des Objekts und deren Zusammensetzung sein
 * <li>Steuerung: im Unterschied zur z.B. Abstrakten Fabrik erzeugt der Builder
 * das Produkt Schritt-für-Schritt und gibt es erst am Schluss durch den Aufruf
 * einer entsprechenden Methode an den Clienten. Dadurch kann der
 * Erzeugungsprozess besser gesteuert werden als bei der z.B. Abstrakten Fabrik.
 * </ol>
 * 
 * @author Fritz Schrogl
 */
package design_patterns.gof.creation.builder;