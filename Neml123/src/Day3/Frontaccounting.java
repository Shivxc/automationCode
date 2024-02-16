/*
 * package Day3;
 * 
 * import java.io.File; import java.io.IOException; import java.util.Date;
 * import org.openqa.selenium.By; import org.openqa.selenium.OutputType; import
 * org.openqa.selenium.TakesScreenshot; import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions; import
 * org.openqa.selenium.io.FileHandler;
 * 
 * public class Frontaccounting {
 * 
 * public static void main(String[] args) throws InterruptedException,
 * IOException { System.setProperty("webdriver.chrome.driver",
 * "D:\\chromedriver_win32\\chromedriver.exe"); WebDriver driver = new
 * ChromeDriver(); //starting Browser parent p = new child
 * driver.get("https://frontaccounting.com/"); //for opening url
 * 
 * WebElement un = driver.findElement(By.name("user_name_entry_field"));
 * un.clear(); un.sendKeys("demouser");
 * 
 * WebElement pwd = driver.findElement(By.name("password")); pwd.clear();
 * pwd.sendKeys("password");
 * 
 * driver.findElement(By.name("SubmitUser")).click();
 * 
 * //driver.findElement(By.linkText("Logout")).click(); Thread.sleep(5000); //
 * driver.quit();
 * 
 * 
 * // System.out.println("driver.getTitle()"); // for getting current page Title
 * 
 * 
 * WebElement Download = driver.findElement(By.linkText("Download")); Actions
 * ac=new Actions(driver); //Actions use for controlling mouse/keyboard
 * ac.moveToElement(Download).perform();
 * 
 * ac.click(driver.findElement(By.linkText("Installation Guide"))).perform();
 * 
 * //webdriver driver = new chromedriver() > hides child/chromedriver specific
 * TakesScreenshot tc=(TakesScreenshot)driver; //Converting driver into
 * takescreenshot type // this line will take screenshot and store into java's
 * buffer memory
 * 
 * File src=tc.getScreenshotAs(OutputType.FILE);
 * 
 * //copy from buffer memory to actual memory
 * 
 * Date date= new Date(); String newDate =
 * date.toString().replaceAll(" ","_").replaceAll(":", "-");
 * FileHandler.copy(src, new File("D:\\screenshot\\file"+newDate+".png"));
 * 
 * Thread.sleep(2000); driver.quit();
 * 
 * }
 * 
 * 
 * }
 */