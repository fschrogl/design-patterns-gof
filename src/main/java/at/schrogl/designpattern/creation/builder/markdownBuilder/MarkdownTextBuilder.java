package at.schrogl.designpattern.creation.builder.markdownBuilder;

import at.schrogl.designpattern.creation.builder.AbstractTextBuilder;

public class MarkdownTextBuilder extends AbstractTextBuilder {

	@Override
	public MarkdownTextBuilder addItalicText(String text) {
		sb.append("_").append(text).append("_");
		return this;
	}

	@Override
	public MarkdownTextBuilder addBoldText(String text) {
		sb.append("**").append(text).append("**");
		return this;
	}

	@Override
	public MarkdownTextBuilder addLinebreak() {
		sb.append("\\n\\n");
		return this;
	}

	@Override
	public MarkdownText build() {
		return new MarkdownText(sb.toString());
	}
}
