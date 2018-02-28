package design_patterns.gof.creation.builder;

public class Director {

	private final AbstractTextBuilder builder;

	public Director(AbstractTextBuilder builder) {
		this.builder = builder;
	}

	public void contruct() {
		builder.addText("This is the first line.");
		builder.addLinebreak();
		builder.addBoldText("This is a line in bold text.");
		builder.addLinebreak();
		builder.addItalicText("This is a line in italic text.");
	}

}
