/*
 * package Day3;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * public class krishivedh {
 * 
 * public static void main(String[] args) throws InterruptedException {
 * System.setProperty("webdriver.chrome.driver",
 * "D:\\chromedriver_win32\\chromedriver.exe"); WebDriver driver = new
 * ChromeDriver(); //starting Browser
 * driver.get("https://directuat.neml.xyz/SpotLite/"); //for opening url
 * Thread.sleep(4000);
 * driver.findElement(By.name("userId-entry")).sendKeys("Kisan1");
 * 
 * driver.findElement(By.name("password-entry")).sendKeys("Neml@1234");
 * 
 * driver.findElement(By.cssSelector("button[ type = 'submit']")).click();
 * 
 * Thread.sleep(6000);
 * 
 * driver.findElement(By.cssSelector("span.oxd-userdropdown-tab")).click();
 * Thread.sleep(3000);
 * 
 * driver.findElement(By.linkText("Logout")).click(); }
 * 
 * }
 */