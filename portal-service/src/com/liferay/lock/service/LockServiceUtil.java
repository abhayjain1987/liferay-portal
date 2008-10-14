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

package com.liferay.lock.service;

import com.liferay.lock.model.Lock;
import com.liferay.portal.PortalException;

/**
 * <a href="LockServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class LockServiceUtil {

	public static void clear() {
		LockService lockService = LockServiceFactory.getService();

		lockService.clear();
	}

	public static Lock getLock(String className, Comparable<?> pk)
		throws PortalException {

		LockService lockService = LockServiceFactory.getService();

		return lockService.getLock(className, pk);
	}

	public static boolean hasLock(
		String className, Comparable<?> pk, long userId) {

		LockService lockService = LockServiceFactory.getService();

		return lockService.hasLock(className, pk, userId);
	}

	public static boolean isLocked(String className, Comparable<?> pk) {
		LockService lockService = LockServiceFactory.getService();

		return lockService.isLocked(className, pk);
	}

	public static Lock lock(
			String className, Comparable<?> pk, long userId, String owner,
			long expirationTime)
		throws PortalException {

		LockService lockService = LockServiceFactory.getService();

		return lockService.lock(className, pk, userId, owner, expirationTime);
	}

	public static Lock lock(
			String className, Comparable<?> pk, long userId, String owner,
			boolean inheritable, long expirationTime)
		throws PortalException {

		LockService lockService = LockServiceFactory.getService();

		return lockService.lock(
			className, pk, userId, owner, inheritable, expirationTime);
	}

	public static Lock refresh(String uuid, long expirationTime)
		throws PortalException {

		LockService lockService = LockServiceFactory.getService();

		return lockService.refresh(uuid, expirationTime);
	}

	public static void unlock(String className, Comparable<?> pk) {
		LockService lockService = LockServiceFactory.getService();

		lockService.unlock(className, pk);
	}

}