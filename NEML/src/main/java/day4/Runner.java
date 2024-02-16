package day4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

	/*
	 * public static void main(String[] args) {
	 * System.setProperty("webdriver.chrome.driver",
	 * "src/main/resources/drivers/chromedriver.exe"); WebDriver driver = new
	 * ChromeDriver();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * driver.get("https://ncdfiuat.neml.xyz/SpotLite/");
	 * 
	 * loginpage Ip= new loginpage(driver); Ip.dologin("U204615","Neml@123");
	 * 
	 * // ncdfi em = new ncdfi(driver); // em.Logout();
	 * 
	 * }
	 * 
	 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hrmantra.com/default.aspx?cn=NeML&escId=0&fid=0&RefFeedbackID=0");

		hrmantra Ip = new hrmantra(driver);
		Ip.dologin1("10574", "gogreen@2090");

        hrmantra em = new hrmantra(driver);
        em.Logout();

	}
}