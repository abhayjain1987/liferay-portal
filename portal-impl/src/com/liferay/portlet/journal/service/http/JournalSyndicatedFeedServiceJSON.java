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

package com.liferay.portlet.journal.service.http;

import com.liferay.portlet.journal.service.JournalSyndicatedFeedServiceUtil;

import org.json.JSONObject;

/**
 * <a href="JournalSyndicatedFeedServiceJSON.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class provides a JSON utility for the
 * <code>com.liferay.portlet.journal.service.JournalSyndicatedFeedServiceUtil</code>
 * service utility. The static methods of this class calls the same methods of
 * the service utility. However, the signatures are different because it is
 * difficult for JSON to support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to a <code>org.json.JSONArray</code>. If the method in the
 * service utility returns a <code>com.liferay.portlet.journal.model.JournalSyndicatedFeed</code>,
 * that is translated to a <code>org.json.JSONObject</code>. Methods that JSON
 * cannot safely use are skipped. The logic for the translation is encapsulated
 * in <code>com.liferay.portlet.journal.service.http.JournalSyndicatedFeedJSONSerializer</code>.
 * </p>
 *
 * <p>
 * This allows you to call the the backend services directly from JavaScript.
 * See <code>portal-web/docroot/html/portlet/tags_admin/unpacked.js</code> for a
 * reference of how that portlet uses the generated JavaScript in
 * <code>portal-web/docroot/html/js/service.js</code> to call the backend
 * services directly from JavaScript.
 * </p>
 *
 * <p>
 * The JSON utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.liferay.portlet.journal.service.JournalSyndicatedFeedServiceUtil
 * @see com.liferay.portlet.journal.service.http.JournalSyndicatedFeedJSONSerializer
 *
 */
public class JournalSyndicatedFeedServiceJSON {
	public static JSONObject addSyndicatedFeed(long plid,
		java.lang.String feedId, boolean autoFeedId, java.lang.String name,
		java.lang.String description, java.lang.String type,
		java.lang.String structureId, java.lang.String templateId,
		java.lang.String rendererTemplateId, int delta,
		java.lang.String orderByCol, java.lang.String orderByType,
		java.lang.String targetLayoutFriendlyUrl,
		java.lang.String targetPortletId, java.lang.String contentField,
		java.lang.String feedType, double feedVersion,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException,
			com.liferay.portal.PortalException {
		com.liferay.portlet.journal.model.JournalSyndicatedFeed returnValue = JournalSyndicatedFeedServiceUtil.addSyndicatedFeed(plid,
				feedId, autoFeedId, name, description, type, structureId,
				templateId, rendererTemplateId, delta, orderByCol, orderByType,
				targetLayoutFriendlyUrl, targetPortletId, contentField,
				feedType, feedVersion, addCommunityPermissions,
				addGuestPermissions);

		return JournalSyndicatedFeedJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONObject addSyndicatedFeed(long plid,
		java.lang.String feedId, boolean autoFeedId, java.lang.String name,
		java.lang.String description, java.lang.String type,
		java.lang.String structureId, java.lang.String templateId,
		java.lang.String rendererTemplateId, int delta,
		java.lang.String orderByCol, java.lang.String orderByType,
		java.lang.String targetLayoutFriendlyUrl,
		java.lang.String targetPortletId, java.lang.String contentField,
		java.lang.String feedType, double feedVersion,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException,
			com.liferay.portal.PortalException {
		com.liferay.portlet.journal.model.JournalSyndicatedFeed returnValue = JournalSyndicatedFeedServiceUtil.addSyndicatedFeed(plid,
				feedId, autoFeedId, name, description, type, structureId,
				templateId, rendererTemplateId, delta, orderByCol, orderByType,
				targetLayoutFriendlyUrl, targetPortletId, contentField,
				feedType, feedVersion, communityPermissions, guestPermissions);

		return JournalSyndicatedFeedJSONSerializer.toJSONObject(returnValue);
	}

	public static void deleteSyndicatedFeed(long groupId, long synFeedId)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException,
			com.liferay.portal.PortalException {
		JournalSyndicatedFeedServiceUtil.deleteSyndicatedFeed(groupId, synFeedId);
	}

	public static void deleteSyndicatedFeed(long groupId,
		java.lang.String feedId)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException,
			com.liferay.portal.PortalException {
		JournalSyndicatedFeedServiceUtil.deleteSyndicatedFeed(groupId, feedId);
	}

	public static JSONObject getSyndicatedFeed(long groupId, long synFeedId)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException,
			com.liferay.portal.PortalException {
		com.liferay.portlet.journal.model.JournalSyndicatedFeed returnValue = JournalSyndicatedFeedServiceUtil.getSyndicatedFeed(groupId,
				synFeedId);

		return JournalSyndicatedFeedJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONObject getSyndicatedFeed(long groupId,
		java.lang.String feedId)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException,
			com.liferay.portal.PortalException {
		com.liferay.portlet.journal.model.JournalSyndicatedFeed returnValue = JournalSyndicatedFeedServiceUtil.getSyndicatedFeed(groupId,
				feedId);

		return JournalSyndicatedFeedJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONObject updateSyndicatedFeed(long groupId,
		java.lang.String feedId, java.lang.String name,
		java.lang.String description, java.lang.String type,
		java.lang.String structureId, java.lang.String templateId,
		java.lang.String rendererTemplateId, int delta,
		java.lang.String orderByCol, java.lang.String orderByType,
		java.lang.String targetLayoutFriendlyUrl,
		java.lang.String targetPortletId, java.lang.String contentField,
		java.lang.String feedType, double feedVersion)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException,
			com.liferay.portal.PortalException {
		com.liferay.portlet.journal.model.JournalSyndicatedFeed returnValue = JournalSyndicatedFeedServiceUtil.updateSyndicatedFeed(groupId,
				feedId, name, description, type, structureId, templateId,
				rendererTemplateId, delta, orderByCol, orderByType,
				targetLayoutFriendlyUrl, targetPortletId, contentField,
				feedType, feedVersion);

		return JournalSyndicatedFeedJSONSerializer.toJSONObject(returnValue);
	}
}