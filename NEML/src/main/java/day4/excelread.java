package day4;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelread {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("D:\\Book1.xlsx")); // reading workbook
		XSSFSheet sh = wb.getSheet("Sheet1"); // reading sheet
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	    int rowSize = sh.getLastRowNum();
	//	int col = sh.getRow(0).getLastCellNum();
	    
	    
		for (int i = 0; i <= rowSize; i++) {

			String un = sh.getRow(i).getCell(0).toString();
			String pwd = sh.getRow(i).getCell(1).toString();
			System.out.print(un+" ");
			System.out.println(pwd);
			driver.findElement(By.name("username")).sendKeys(un);
	        driver.findElement(By.name("password")).sendKeys(pwd);
            driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
           if(driver.getCurrentUrl().contains("pim/viewEmployeeList")) {	
		   driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).click();
		   driver.findElement(By.linkText("Logout")).click();
		   System.out.println("Login Done");
           }else
        	   System.out.println("Login Failed");
           }
		}
		}









// for(int j=0; j< col; j++) {
// String data = sh.getRow(i).getCell(j).toString();
// System.out.print(data+" ");
// if(j==1)
// System.out.println();