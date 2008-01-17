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

package com.liferay.portlet.journal.service.persistence;

/**
 * <a href="JournalSyndicatedFeedFinderUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class JournalSyndicatedFeedFinderUtil {
	public static int countByKeywords(long companyId, long groupId,
		java.lang.String keywords) throws com.liferay.portal.SystemException {
		return getFinder().countByKeywords(companyId, groupId, keywords);
	}

	public static int countByC_G_F_N_D(long companyId, long groupId,
		java.lang.String feedId, java.lang.String name,
		java.lang.String description, boolean andOperator)
		throws com.liferay.portal.SystemException {
		return getFinder().countByC_G_F_N_D(companyId, groupId, feedId, name,
			description, andOperator);
	}

	public static int countByC_G_F_N_D(long companyId, long groupId,
		java.lang.String[] feedIds, java.lang.String[] names,
		java.lang.String[] descriptions, boolean andOperator)
		throws com.liferay.portal.SystemException {
		return getFinder().countByC_G_F_N_D(companyId, groupId, feedIds, names,
			descriptions, andOperator);
	}

	public static java.util.List findByKeywords(long companyId, long groupId,
		java.lang.String keywords, int begin, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getFinder().findByKeywords(companyId, groupId, keywords, begin,
			end, obc);
	}

	public static java.util.List findByC_G_F_N_D(long companyId, long groupId,
		java.lang.String feedId, java.lang.String name,
		java.lang.String description, boolean andOperator, int begin, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getFinder().findByC_G_F_N_D(companyId, groupId, feedId, name,
			description, andOperator, begin, end, obc);
	}

	public static java.util.List findByC_G_F_N_D(long companyId, long groupId,
		java.lang.String[] feedIds, java.lang.String[] names,
		java.lang.String[] descriptions, boolean andOperator, int begin,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getFinder().findByC_G_F_N_D(companyId, groupId, feedIds, names,
			descriptions, andOperator, begin, end, obc);
	}

	public static JournalSyndicatedFeedFinder getFinder() {
		return _getUtil()._finder;
	}

	public void setFinder(JournalSyndicatedFeedFinder finder) {
		_finder = finder;
	}

	private static JournalSyndicatedFeedFinderUtil _getUtil() {
		if (_util == null) {
			_util = (JournalSyndicatedFeedFinderUtil)com.liferay.portal.kernel.bean.BeanLocatorUtil.locate(_UTIL);
		}

		return _util;
	}

	private static final String _UTIL = JournalSyndicatedFeedFinderUtil.class.getName();
	private static JournalSyndicatedFeedFinderUtil _util;
	private JournalSyndicatedFeedFinder _finder;
}