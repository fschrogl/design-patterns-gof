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

