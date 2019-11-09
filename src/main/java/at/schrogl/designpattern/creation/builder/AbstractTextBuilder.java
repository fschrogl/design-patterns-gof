package at.schrogl.designpattern.creation.builder;

public abstract class AbstractTextBuilder {

	protected final StringBuilder sb = new StringBuilder();

	public AbstractTextBuilder addText(String text) {
		sb.append(text);
		return this;
	}

	public AbstractTextBuilder addItalicText(String text) {
		return this;
	}

	public AbstractTextBuilder addBoldText(String text) {
		return this;
	}

	public AbstractTextBuilder addLinebreak() {
		return this;
	}

	public abstract Object build();

}
