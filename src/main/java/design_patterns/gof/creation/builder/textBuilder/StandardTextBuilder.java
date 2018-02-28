package design_patterns.gof.creation.builder.textBuilder;

import design_patterns.gof.creation.builder.AbstractTextBuilder;

public class StandardTextBuilder extends AbstractTextBuilder {

	private final StringBuilder sb;

	public StandardTextBuilder() {
		this.sb = new StringBuilder();
	}

	@Override
	public void addText(String text) {
		sb.append(text);
	}

	@Override
	public void addLinebreak() {
		sb.append("\n");
	}

	@Override
	public Object build() {
		return new StandardText(sb.toString());
	}

}
