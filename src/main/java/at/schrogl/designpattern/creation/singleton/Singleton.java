package at.schrogl.designpattern.creation.singleton;

/*-
 * #%L
 * Design Patterns
 * %%
 * Copyright (C) 2018 - 2020 Fritz Schrogl
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

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
