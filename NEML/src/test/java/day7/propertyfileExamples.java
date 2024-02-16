package day7;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import day6.base;

public class propertyfileExamples extends base {
	@Test
	public void readProperty() throws Exception {

		Properties prop = new Properties();
		prop.load(new FileInputStream("src/test/resources/config.properties"));

		String URL = prop.getProperty("URL");
		System.out.println(URL);
		driver.get(URL);

	}
}
