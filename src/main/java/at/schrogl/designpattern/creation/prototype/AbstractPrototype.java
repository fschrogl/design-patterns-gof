package at.schrogl.designpattern.creation.prototype;

public class AbstractPrototype {

	protected String value1;
	protected int value2;

	protected void someMethod() {

	}

	protected String getValue1() {
		return value1;
	}

	protected void setValue1(String value1) {
		this.value1 = value1;
	}

	protected int getValue2() {
		return value2;
	}

	protected void setValue2(int value2) {
		this.value2 = value2;
	}

	/**
	 * The prototype's clone method can be implemented using a language's special constructs (like here)
	 * or by hand. Result is the same: the object gets copied/cloned.
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
