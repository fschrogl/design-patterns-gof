/**
 * <p>
 * Erzeugermuster: <i>Singleton</i>
 * </p>
 * <img src="doc-files/singleton.png" alt="Singleton pattern diagram">
 * <p>
 * <b>Zweck:</b>
 * </p>
 * <p>
 * Der Singleton ist ein objektbasiertes Erzeugermuster. Sein Zweck ist es zu
 * garantieren, dass genau eine Instanz einer Klasse innerhalb einer Applikation
 * exisitert. Um dies sicher zu stellen erzeugt sich der Singleton selbst und
 * eine Instanz kann nur durch eine Factorymethode erhalten werden (globaler
 * Zugriffspunkt auf die Instanz).
 * </p>
 * <p>
 * <b>Anwendbarkeit / Konsequenzen:</b>
 * <ol>
 * <li>Zugriffskontrolle: durch die Factorymethode kann der Singleton
 * kontrollieren wer auf ihn zugreifen kann.</li>
 * <li>Variable Exemplaranzahl: sollte man mehr als eine Instanz benötigen kann
 * man das in der Factorymethode ändern, ohne den Client ändern zu müssen.</li>
 * <li>Flexibler als Klassenmethoden: Klassenmethoden können z.B. nicht von
 * Unterklassen überschrieben werden. Singleton ist hier flexibler.</li>
 * </ol>
 * <p>
 * <i>Notiz: Durch Verwendung von Reflection kann der Singleton umgangen werden,
 * d.h. prinzipiell ist es möglich mehrere Instanzen eines Singletons zu
 * erzeugen.</i>
 * </p>
 * 
 * @author Fritz Schrogl
 */
package at.schrogl.designpattern.creation.singleton;

