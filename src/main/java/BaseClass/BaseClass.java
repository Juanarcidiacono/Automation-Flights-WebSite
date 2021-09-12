package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	
	private final static String URL = "http://www.despegar.com.ar";
	
	private static String expectedTitle = "Viajes Baratos y Experiencias únicas en Despegar | Tu Agencia de Viaje";
	private static String origin = "Buenos Aires";
	private static String destination = "Berlin";
	
	
	public static String getOrigin() {
		return origin;
	}

	public static String getDestination() {
		return destination;
	}

	public String getURL() {
		return URL;
	}
	
	public String getExpectedTitle() {
		return expectedTitle;
	}
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
