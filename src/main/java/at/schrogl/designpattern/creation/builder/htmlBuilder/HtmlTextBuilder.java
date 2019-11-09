package at.schrogl.designpattern.creation.builder.htmlBuilder;

import at.schrogl.designpattern.creation.builder.AbstractTextBuilder;

public class HtmlTextBuilder extends AbstractTextBuilder {

	@Override
	public HtmlTextBuilder addText(String text) {
		sb.append("<p>").append(text).append("</p>");
		return this;
	}

	@Override
	public AbstractTextBuilder addItalicText(String text) {
		sb.append("<p><em>").append(text).append("</em></p>");
		return this;
	}

	@Override
	public AbstractTextBuilder addBoldText(String text) {
		sb.append("<p><b>").append(text).append("</b></p>");
		return this;
	}

	@Override
	public HtmlTextBuilder addLinebreak() {
		sb.append("<br>");
		return this;
	}

	@Override
	public HtmlText build() {
		return new HtmlText(sb.toString());
	}

}
