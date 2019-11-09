package at.schrogl.designpattern.creation.builder;

import at.schrogl.designpattern.creation.builder.htmlBuilder.HtmlText;
import at.schrogl.designpattern.creation.builder.htmlBuilder.HtmlTextBuilder;
import at.schrogl.designpattern.creation.builder.markdownBuilder.MarkdownText;
import at.schrogl.designpattern.creation.builder.markdownBuilder.MarkdownTextBuilder;

public class Main {

	public static void main(String[] args) {
		HtmlTextBuilder htmlTextBuilder = new HtmlTextBuilder();
		constructText(htmlTextBuilder);
		HtmlText htmlText = htmlTextBuilder.build();

		MarkdownTextBuilder markdownTextBuilder = new MarkdownTextBuilder();
		constructText(markdownTextBuilder);
		MarkdownText markdownText = markdownTextBuilder.build();
	}

	private static void constructText(AbstractTextBuilder abstractTextBuilder) {
		Director director = new Director(abstractTextBuilder);
		director.contruct();
	}

}
