package continous_page;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class Screenshot {

public void takescreenshot() throws IOException {
	
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver  = new ChromeDriver();	

driver.get("https://ncdfiuat.neml.xyz/SpotLite/");
driver.manage().window().maximize();

//TakesScreenshot scrShot =((TakesScreenshot)driver);
//File SrcFile=scrShot.getScreenshotAs("jpg".File);
		
ru.yandex.qatools.ashot.Screenshot Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

ImageIO.write(Screenshot.getImage(), "jpg", new File("c:\\Screenshot.jpg"));
	
	}



}