package at.schrogl.designpattern.creation.builder;

/*-
 * #%L
 * Design Patterns
 * %%
 * Copyright (C) 2018 - 2020 Fritz Schrogl
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

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
