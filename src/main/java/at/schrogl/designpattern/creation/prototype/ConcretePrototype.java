package at.schrogl.designpattern.creation.prototype;

public class ConcretePrototype extends AbstractPrototype {

	private boolean isTrue;

	public void someMethod() {

	}

	public boolean isTrue() {
		return isTrue;
	}

	public void setTrue(boolean aTrue) {
		isTrue = aTrue;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
