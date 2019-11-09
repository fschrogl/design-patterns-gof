package at.schrogl.designpattern.creation.abstractfactory.productfamily2;

import at.schrogl.designpattern.creation.abstractfactory.abstractproduct.AbstractProduct3;

public class Product3 implements AbstractProduct3 {

	private String hashedParam;

	@Override
	public String getParam() {
		return hashedParam;
	}

	@Override
	public void setParam(String value) {
		hashedParam = Integer.toString(value.hashCode());
	}

}
