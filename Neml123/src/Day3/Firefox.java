/*
 * package Day3;
 * 
 * import java.util.Scanner;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import io.opentelemetry.exporter.logging.SystemOutLogExporter;
 * 
 * public class Firefox { public static void main(String[] args) { WebDriver
 * driver=null; Scanner sc = new Scanner(System.in);
 * System.out.println("Chrome Browser\n1.Chrome\n2.Firefox"); int ch =
 * sc.nextInt(); if (ch == 1) { System.setProperty("webdriver.chrome.driver",
 * "D:\\chromedriver_win32\\chromedriver.exe"); driver = new ChromeDriver();
 * 
 * }else
 * 
 * 
 * System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe"); // driver
 * = new WebDriver(); // starting browser driver.get("http://google.com"); //
 * for opening URL System.out.println(driver.getTitle()); // for GETTING CURRENT
 * PAGE TITLE
 * 
 * driver.quit(); // for closing browser }
 * 
 * } }
 */