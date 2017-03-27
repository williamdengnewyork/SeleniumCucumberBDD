WebDriver interacts directly with the browser without depending on a server. 

It is used in the following context:

    Multi-browser testing including improved functionality for browsers, not well-supported by Selenium RC (Selenium 1.0).

    Handling multiple frames, multiple browser windows, popups, and alerts.

    Complex page navigation.

    Advanced user navigation such as drag-and-drop.

    AJAX-based UI elements.

    
Command 	Description
driver.get("URL") 	To navigate to an application.
element.sendKeys("inputtext") 	Enter some text into an input box.
element.clear() 	Clear the contents from the input box.
select.deselectAll() 	Deselect all OPTIONs from the first SELECT on the page.
select.selectByVisibleText("some text") 	Select the OPTION with the input specified by the user.
driver.switchTo().window("windowName") 	Move the focus from one window to another.
driver.switchTo().frame("frameName") 	Swing from frame to frame.
driver.switchTo().alert() 	Helps in handling alerts.
driver.navigate().to("URL") 	Navigate to the URL.
driver.navigate().forward() 	To navigate forward.
driver.navigate().back() 	To navigate back.
driver.close() 	Closes the current browser associated with the driver.
driver.quit() 	Quits the driver and closes all the associated window of that driver.
driver.refresh() 	Refreshes the current page.


Method 	Syntax 	Description
By ID 	driver.findElement(By.id(<element ID>)) 	Locates an element using the ID attribute
By name 	driver.findElement(By.name(<element name>)) 	Locates an element using the Name attribute
By class name 	driver.findElement(By.className(<element class>)) 	Locates an element using the Class attribute
By tag name 	driver.findElement(By.tagName(<htmltagname>)) 	Locates an element using the HTML tag
By link text 	driver.findElement(By.linkText(<linktext>)) 	Locates a link using link text
By partial link text 	driver.findElement(By.partialLinkText(<linktext>)) 	Locates a link using the link's partial text
By CSS 	driver.findElement(By.cssSelector(<css selector>)) 	Locates an element using the CSS selector
By XPath 	driver.findElement(By.xpath(<xpath>)) 	Locates an element using XPath query


WebDriver interacts directly with the browser without depending on a server. 

It is used in the following context:

    Multi-browser testing including improved functionality for browsers, not well-supported by Selenium RC (Selenium 1.0).

    Handling multiple frames, multiple browser windows, popups, and alerts.

    Complex page navigation.

    Advanced user navigation such as drag-and-drop.

    AJAX-based UI elements.

    
Command 	Description
driver.get("URL") 	To navigate to an application.
element.sendKeys("inputtext") 	Enter some text into an input box.
element.clear() 	Clear the contents from the input box.
select.deselectAll() 	Deselect all OPTIONs from the first SELECT on the page.
select.selectByVisibleText("some text") 	Select the OPTION with the input specified by the user.
driver.switchTo().window("windowName") 	Move the focus from one window to another.
driver.switchTo().frame("frameName") 	Swing from frame to frame.
driver.switchTo().alert() 	Helps in handling alerts.
driver.navigate().to("URL") 	Navigate to the URL.
driver.navigate().forward() 	To navigate forward.
driver.navigate().back() 	To navigate back.
driver.close() 	Closes the current browser associated with the driver.
driver.quit() 	Quits the driver and closes all the associated window of that driver.
driver.refresh() 	Refreshes the current page.


Method 	Syntax 	Description
By ID 	driver.findElement(By.id(<element ID>)) 	Locates an element using the ID attribute
By name 	driver.findElement(By.name(<element name>)) 	Locates an element using the Name attribute
By class name 	driver.findElement(By.className(<element class>)) 	Locates an element using the Class attribute
By tag name 	driver.findElement(By.tagName(<htmltagname>)) 	Locates an element using the HTML tag
By link text 	driver.findElement(By.linkText(<linktext>)) 	Locates a link using link text
By partial link text 	driver.findElement(By.partialLinkText(<linktext>)) 	Locates a link using the link's partial text
By CSS 	driver.findElement(By.cssSelector(<css selector>)) 	Locates an element using the CSS selector
By XPath 	driver.findElement(By.xpath(<xpath>)) 	Locates an element using XPath query


https://www.tutorialspoint.com/cucumber/cucumber_overview.htm
https://www.tutorialspoint.com/selenium/selenium_grids.htm
https://mvnrepository.com/artifact/org.seleniumhq.selenium
http://www.seleniumhq.org/download/





