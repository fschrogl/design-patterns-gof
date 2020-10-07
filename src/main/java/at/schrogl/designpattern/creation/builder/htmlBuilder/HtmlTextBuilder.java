package at.schrogl.designpattern.creation.builder.htmlBuilder;

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
