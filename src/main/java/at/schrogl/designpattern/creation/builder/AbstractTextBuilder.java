package at.schrogl.designpattern.creation.builder;

/**
 * Abstrakter Builder, verwendet vom {@link Director}
 * <p>
 * Ein abstrakter Builder bietet dem {@link Director} eine einheitliche
 * Schnittstelle zu unterschiedlichen konkreten Builder-Implementierungen. Die
 * Methoden des abstrakten Builders sind absichtlich konkret ausgeführt, damit
 * abgeleitete konkrete Builder nicht gezwungen sind für sie nicht relevante
 * Builder-Methoden implementieren zu müssen. Eine Methode, für die Rückgabe des
 * gebauten Objekts, wird direkt in den konkreten Builder implementiert, damit
 * ein konkretes Produktobjekt zurück gegeben werden kann und nicht auf ein
 * abstraktes Oberproduktobjekt zurück gegriffen werden muss.
 * <p>
 * <b>Modifikationen:</b>
 * <ul>
 * <li>wenn eine Vereinheitlichung der Buildermethoden nicht möglich ist bzw. es
 * nur einen konkreten Builder gibt, dann kann der abstrakte Builder komplett
 * entfallen
 * <li>anstelle eines <code>void</code>-Rückgabewertes können die
 * Buildermethoden auch das Builderobjekt zurück liefern, dadurch kann
 * Method-Chaining im Builder verwendet werden
 * </ul>
 * 
 * @author Fritz Schrogl
 */
public abstract class AbstractTextBuilder {

	public void addText(String text) {
		// Empty
	}

	public void addItalicText(String text) {
		// Empty
	}

	public void addBoldText(String text) {
		// Empty
	}

	public void addLinebreak() {
		// Empty
	}

	/**
	 * Build-Methode, normalerweise Teil des konkreten Builders. Da Java beim
	 * Overriden einer Methode nicht auf den Rückgabewert prüft kann die
	 * abstrakte Methode hier definiert werden.
	 * 
	 * @return
	 *         Liefert das gebaute Objekt
	 */
	public abstract Object build();

}
