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

package com.liferay.portalweb.portlet.journal;

import com.liferay.portalweb.portal.BaseTestCase;

/**
 * <a href="AddFeedTest.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class AddFeedTest extends BaseTestCase {
	public void testAddFeed() throws Exception {
		selenium.click("link=Feeds");
		selenium.waitForPageToLoad("30000");
		selenium.click("//input[@value='Add Feed']");
		selenium.waitForPageToLoad("30000");
		selenium.type("_15_newFeedId", "selenium-test-feed");
		selenium.type("_15_name", "Test Feed");
		selenium.type("_15_description", "This is a Test Feed");
		selenium.type("_15_targetPortletId", "Test-Portal-ID");
		selenium.type("_15_targetLayoutFriendlyUrl", "Test-URL");
		selenium.select("_15_type", "label=Test");
		selenium.click("//input[@value='Save']");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("SELENIUM-TEST-FEED"));
		selenium.click("link=Return to Full Page");
		selenium.waitForPageToLoad("30000");
	}
}