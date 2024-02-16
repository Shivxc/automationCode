package day7;

import org.testng.annotations.Test;

import day4.employeelist;
import day4.loginpage;
import day6.base;

import org.testng.annotations.DataProvider;

public class parametrization extends base{
  @Test(dataProvider = "dp")
  public void loginTest(String un, String pwd) {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  loginpage lp  = new loginpage(driver);
	  lp.dologin(un, pwd);
	  employeelist em = new employeelist(driver);
	  em.Logout();
  }

  @DataProvider
  public Object[][] dp() {                         //[rows][column]
	  
	  Object data[][]=new Object[5][2];
	  data[0][0]="admin";
	  data[0][1]="admin123";
	  data[1][0]="hr";
	  data[1][1]="hr123";
	  data[2][0]="abc";
	  data[2][1]="abc123";
	  data[3][0]="demo";
	  data[3][1]="demo123";
	  data[4][0]="shiv";
	  data[4][1]="shiv123";
	  
    return data;
  }
}
