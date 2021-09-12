package Test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BaseClass.BaseClass;
import Common.Common;

public class Test extends BaseClass {
	public Common c = new Common();
	

	public void buyTicket() {
		try {
			// ida y vuelta
			driver.findElement(By.className("sbox5-3-radio -md bundle-checked")).click();
			
			c.from.sendKeys(getOrigin());
			driver.findElement(By.xpath("(//li[@class='item -active'])[1]"));

			c.to.sendKeys(getDestination());
			driver.findElement(By.xpath("(//li[@class='item'])[1]"));

			// sin fecha
			driver.findElement(By.className("sbox5-3-label-span")).click();

			// buscar
			driver.findElement(By.xpath("//div[@class='sbox5-button-container--1X4O8']//button")).click();

			// tercera opcion
			driver.findElement(By.xpath("(//div[@class='cluster-container border not-overflow'])[3]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
