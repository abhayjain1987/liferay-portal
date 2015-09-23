<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/html/taglib/ui/asset_metadata/init.jsp" %>

<%
String[] metadataFields = (String[])request.getAttribute("liferay-ui:asset-metadata:metadataFields");
%>

<c:if test="<%= !ArrayUtil.isEmpty(metadataFields)%>">
	<dl class="taglib-asset-metadata">
		<aui:layout>
			<c:choose>
				<c:when test="<%= metadataFields.length == 1 %>">

					<%
					request.setAttribute("liferay-ui:asset-metadata:metadataField", metadataFields[0]);
					%>

					<liferay-util:include page="/html/taglib/ui/asset_metadata/metadata_entry.jsp" />
				</c:when>
				<c:otherwise>

					<c:if test='<%= ArrayUtil.contains(metadataFields, String.valueOf("author")) %>'>

						<%
						request.setAttribute("liferay-ui:asset-metadata:metadataField", "author");

						metadataFields = ArrayUtil.remove(metadataFields, String.valueOf("author"));
						%>

						<liferay-util:include page="/html/taglib/ui/asset_metadata/metadata_entry.jsp" />
					</c:if>

					<%
					for (String metadataField : metadataFields) {
						request.setAttribute("liferay-ui:asset-metadata:metadataField", metadataField);
					%>

						<liferay-util:include page="/html/taglib/ui/asset_metadata/metadata_entry.jsp" />

					<%
					}
					%>

				</c:otherwise>
			</c:choose>
		</aui:layout>
	</dl>
</c:if>