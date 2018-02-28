/**
 * Erzeugermuster (Creational Design Patterns)
 * <p>
 * Erzeugermuster verstecken die Erzeugung von Objekten, so kann ein Programm
 * ein Objekt erzeugen ohne über Details (Initialisierung etc.) bescheid wissen
 * zu müssen. Gamma et al. definieren zwei Arten von Erzeugermustern:
 * <ol>
 * <li><b>klassenbasierte Erzeugermuster:</b> verwenden Vererbung um die Klasse
 * des zu erzeugenden Objekts zu variieren
 * <li><b>objektbasierte Erzeugermuster:</b> delegiert die Erzeugung an ein
 * anderes Objekt
 * </ol>
 * <p>
 * Erzeugermuster sind vor allem dann von Bedeutung, wenn Systeme beginnen, mehr
 * von Objektkomposition als von Vererbung abzuhängen.
 * 
 * @author Fritz Schrogl
 */
package design_patterns.gof.creation;