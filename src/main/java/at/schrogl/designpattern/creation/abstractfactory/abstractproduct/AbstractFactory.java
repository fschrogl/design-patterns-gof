package at.schrogl.designpattern.creation.abstractfactory.abstractproduct;

public interface AbstractFactory {

	public AbstractProduct1 createProduct1();

	public AbstractProduct2 createProduct2();

	public AbstractProduct3 createProduct3(String param);

}
