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
 * <a href="JournalSyndicatedFeedPersistence.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public interface JournalSyndicatedFeedPersistence {
	public com.liferay.portlet.journal.model.JournalSyndicatedFeed create(
		long id);

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed remove(
		long id)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.journal.NoSuchSyndicatedFeedException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed remove(
		com.liferay.portlet.journal.model.JournalSyndicatedFeed journalSyndicatedFeed)
		throws com.liferay.portal.SystemException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed update(
		com.liferay.portlet.journal.model.JournalSyndicatedFeed journalSyndicatedFeed)
		throws com.liferay.portal.SystemException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed update(
		com.liferay.portlet.journal.model.JournalSyndicatedFeed journalSyndicatedFeed,
		boolean merge) throws com.liferay.portal.SystemException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed updateImpl(
		com.liferay.portlet.journal.model.JournalSyndicatedFeed journalSyndicatedFeed,
		boolean merge) throws com.liferay.portal.SystemException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed findByPrimaryKey(
		long id)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.journal.NoSuchSyndicatedFeedException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed fetchByPrimaryKey(
		long id) throws com.liferay.portal.SystemException;

	public java.util.List findByUuid(java.lang.String uuid)
		throws com.liferay.portal.SystemException;

	public java.util.List findByUuid(java.lang.String uuid, int begin, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List findByUuid(java.lang.String uuid, int begin, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.journal.NoSuchSyndicatedFeedException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.journal.NoSuchSyndicatedFeedException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed[] findByUuid_PrevAndNext(
		long id, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.journal.NoSuchSyndicatedFeedException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.journal.NoSuchSyndicatedFeedException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.SystemException;

	public java.util.List findByGroupId(long groupId)
		throws com.liferay.portal.SystemException;

	public java.util.List findByGroupId(long groupId, int begin, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List findByGroupId(long groupId, int begin, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed findByGroupId_First(
		long groupId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.journal.NoSuchSyndicatedFeedException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed findByGroupId_Last(
		long groupId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.journal.NoSuchSyndicatedFeedException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed[] findByGroupId_PrevAndNext(
		long id, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.journal.NoSuchSyndicatedFeedException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed findByG_F(
		long groupId, java.lang.String feedId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.journal.NoSuchSyndicatedFeedException;

	public com.liferay.portlet.journal.model.JournalSyndicatedFeed fetchByG_F(
		long groupId, java.lang.String feedId)
		throws com.liferay.portal.SystemException;

	public java.util.List findWithDynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer)
		throws com.liferay.portal.SystemException;

	public java.util.List findWithDynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer,
		int begin, int end) throws com.liferay.portal.SystemException;

	public java.util.List findAll() throws com.liferay.portal.SystemException;

	public java.util.List findAll(int begin, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List findAll(int begin, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.SystemException;

	public void removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.journal.NoSuchSyndicatedFeedException;

	public void removeByGroupId(long groupId)
		throws com.liferay.portal.SystemException;

	public void removeByG_F(long groupId, java.lang.String feedId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.journal.NoSuchSyndicatedFeedException;

	public void removeAll() throws com.liferay.portal.SystemException;

	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.SystemException;

	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.SystemException;

	public int countByGroupId(long groupId)
		throws com.liferay.portal.SystemException;

	public int countByG_F(long groupId, java.lang.String feedId)
		throws com.liferay.portal.SystemException;

	public int countAll() throws com.liferay.portal.SystemException;
}