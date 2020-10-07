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
 * Verwendung eines Singletons.
 * 
 * @author Fritz Schrogl
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * There is only one instance of a singleton in an application.
		 * Hence inst1==inst2 holds.
		 */
		Singleton inst1 = Singleton.getInstance();
		Singleton inst2 = Singleton.getInstance();
		assert(inst1 == inst2);

		/*
		 * Once created a singleton instance can't be destroyed.
		 * Despite setting inst1=null and inst2=null the instance
		 * is still referenced by the singleton itself, hence
		 * is not garbage collected.
		 */
		inst1 = null;
		inst2 = null;
	}

}
