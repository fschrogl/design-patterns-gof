package at.schrogl.designpattern.creation.singleton;

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
