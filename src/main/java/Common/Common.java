package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BaseClass.BaseClass;

public class Common extends BaseClass {
	
	public Common() {
		// TODO Auto-generated constructor stub
	}

	private WebDriverWait wait = new WebDriverWait(driver, 20);

	public WebElement from = driver
			.findElement(By.xpath("(//input[@placeholder='Ingresa desde dónde viajas'])[last()]"));
	public WebElement to = driver
			.findElement(By.xpath("(//input[@placeholder='Ingresa hacia dónde viajas'])[last()]"));

	public void enterWebSite() {
		String actualTitle = driver.getTitle();

		driver.get(getURL());

		try {
			wait.until(ExpectedConditions.elementToBeClickable(from));
		} catch (Exception e) {
			e.printStackTrace();
		}

		Assert.assertEquals(actualTitle, getExpectedTitle());
	}

}
