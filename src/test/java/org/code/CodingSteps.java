package org.code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class CodingSteps {
WebDriver driver;
@Given("the user should be present in the flipkart home page")
public void the_user_should_be_present_in_the_flipkart_home_page() {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\CucumberFlipkart\\src\\Driver\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("https://www.flipkart.com/");
}

@When("the user must enter iphone in the search box")
public void the_user_must_enter_iphone_in_the_search_box() {
	WebElement btnpop = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	btnpop.click();
 WebElement txtsearchbar = driver.findElement(By.xpath("//input[@name='q']"));
 txtsearchbar.sendKeys("iphone11");
}

@When("click the search button")
public void click_the_search_button() throws InterruptedException {
   WebElement btnsearch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
   btnsearch.click();
   Thread.sleep(2000);
}

@When("print the list of products apeared with prices")
public void print_the_list_of_products_apeared_with_prices() {
    List<WebElement> setofproducts = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
    for (int i = 0; i < 24; i++) {
		WebElement element = setofproducts.get(i);
		String text = element.getText();
	System.out.println(text);
	
	}
  
		List<WebElement> cost = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for (int j = 0; j < cost.size(); j++) {
		WebElement amount=	cost.get(j);
String text1 = amount.getText();
//for (int i = 0; i <text1.length() ; i++) {
//	int v = Integer.parseInt(text1);
//	int a[]=new int[v];
//	int temp=0;
//	for (int k = 0; k < a.length; k++) {
//		for (int k2 = k+1; k2 < a.length; k2++) {
//			if (a[k]>a[k2]) {
//				temp=a[k];
//				a[k]=a[k2];
//				a[k2]=temp;
//			}
//		}
//	}
//}
	System.out.print(text1);	}
}

@Then("to validate the prices in ascending order")
public void to_validate_the_prices_in_ascending_order() {
   driver.quit();
}


}
