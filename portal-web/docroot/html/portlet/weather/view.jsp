<%
/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
%>

<%@ include file="/html/portlet/weather/init.jsp" %>

<form name="<portlet:namespace />fm" target="_blank" onSubmit="submitForm(document.<portlet:namespace />fm, 'http://www.weather.com/search/search', false); return false;">

<table class="lfr-table">

<%
for (int i = 0; i < zips.length; i++) {
	Weather weather = WeatherUtil.getWeather(zips[i]);

	if (weather != null) {
%>

		<tr>
			<td>
				<a href="http://www.weather.com/search/search?where=<%= weather.getZip() %>" style="font-size: xx-small; font-weight: bold;" target="_blank"><%= weather.getZip() %></a>
			</td>
			<td align="right">
				<span style="font-size: xx-small;">

				<c:if test="<%= fahrenheit %>">
					<%= weather.getCurrentTemp() %> &deg;F
				</c:if>

				<c:if test="<%= !fahrenheit %>">
					<%= Math.round(ConverterUtil.convertTemperature(ConverterUtil.TEMPERATURE_FAHRENHEIHT, ConverterUtil.TEMPERATURE_CELSIUS, weather.getCurrentTemp())) %> &deg;C
				</c:if>

				</span>
			</td>
			<td align="right">
				<img src="<%= weather.getIconURL() %>" />
			</td>
		</tr>

<%
	}
}
%>

</table>

<br />

<liferay-ui:message key="city-or-zip-code" />

<input name="where" size="23" type="text" />

<input type="submit" value="<liferay-ui:message key="search" />" />

</form>

<c:if test="<%= windowState.equals(WindowState.MAXIMIZED) %>">
	<script type="text/javascript">
		Liferay.Util.focusFormField(document.<portlet:namespace />fm.where);
	</script>
</c:if>