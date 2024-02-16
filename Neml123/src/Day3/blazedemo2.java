/*
 * package Day3; import java.time.Duration; import java.util.List; import
 * org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.Select; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class blazedemo2 {
 * 
 * public static void main(String[] args) throws InterruptedException {
 * System.setProperty("webdriver.chrome.driver",
 * "D:\\chromedriver_win32\\chromedriver.exe");
 * 
 * WebDriver driver = new ChromeDriver(); //starting Browser
 * 
 * WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(15)); // wait
 * decleration
 * 
 * 
 * driver.get("http://blazedemo.com"); WebElement from =
 * driver.findElement(By.name("fromPort")); Select sc = new Select(from);
 * sc.selectByVisibleText("San Diego"); Thread.sleep(2000);
 * //sc.selectByValue("Boston"); //Thread.sleep(2000); //sc.selectByIndex(6);
 * 
 * WebElement toPort = driver.findElement(By.name("toPort")); Select sc1 = new
 * Select(toPort); sc1.selectByValue("New York");
 * 
 * driver.findElement(By.cssSelector("input[value = 'Find Flights']")).click();
 * 
 * //Grouping all Element Which are having common property List<WebElement>
 * li=driver.findElements(By.cssSelector("input[value='Choose This Flight']"));
 * //passing the common property
 * 
 * System.out.println("Total available flight are "+li.size());
 * 
 * li.get(1).click();
 * 
 * WebElement home = driver.findElement(By.linkText("home")); Actions ac=new
 * Actions(driver); //Actions use for controlling mouse/keyboard
 * ac.moveToElement(home).click().perform();
 * 
 * 
 * 
 * }
 * 
 * }
 */