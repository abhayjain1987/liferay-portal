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

package com.liferay.site.apio.internal.architect.model;

import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.theme.ThemeDisplay;

/**
 * Group wrapper that includes a {@code ThemeDisplay} object to allow getting
 * the different absolute URLs.
 *
 * @author Eduardo Perez
 */
public class GroupWrapper extends com.liferay.portal.kernel.model.GroupWrapper {

	public GroupWrapper(Group group, ThemeDisplay themeDisplay) {
		super(group);

		_themeDisplay = themeDisplay;
	}

	/**
	 * Returns the private URL of this Group.
	 *
	 * @return the private URL of this Group.
	 */
	public String getPrivateURL() {
		return _getDisplayURL(true);
	}

	/**
	 * Returns the public URL of this Group.
	 *
	 * @return the public URL of this Group.
	 */
	public String getPublicURL() {
		return _getDisplayURL(false);
	}

	private String _getDisplayURL(boolean isPrivate) {
		return getDisplayURL(_themeDisplay, isPrivate);
	}

	private final ThemeDisplay _themeDisplay;

}