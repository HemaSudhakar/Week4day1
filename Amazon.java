package week4day1assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	 private static final WindowType WindowHandles = null;

	public static void main(String[] args) throws InterruptedException {
		/*1. Load the URL https://www.amazon.in/
			2. Search as oneplus 9 pro 
			3. Get the price of the first product
			4. Print the number of customer ratings for the first displayed product
			5. Click the first text link of the first image
			6. Take a screen shot of the product displayed
			7. Click 'Add to Cart' button
			8. Get the cart subtotal and verify if it is correct.
			9. Close the browser

	}*/
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disabled-notifications");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30) );
		 driver.get("https://www.amazon.in/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30) );
		 //driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		 //driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9962216805");
		 //driver.findElement(By.xpath("//input[@id='continue']")).click();
		 //driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Testing@1");
		 //driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30) );
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple iphone",Keys.ENTER);
		 //Get the price of the first product
		 //WebElement firstphoneprice = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		 WebElement firstphoneprice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		 float price=Float.parseFloat(firstphoneprice.getText().replace("," ,""));
		 System.out.println(price);
		 //Print the number of customer ratings for the first displayed product
		 WebElement starRating = driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative'])[1]"));
		 starRating.click();
		 String starRate = driver.findElement(By.xpath("//span[contains(@class,'text-beside-button a-text-bold')]")).getText();
		 System.out.println("Star rating : " + starRate);
		 System.out.println(starRating.getText());
		 //Click the first text link of the first image
		 driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
		 Set<String> WindowHandles=driver.getWindowHandles();
		 //Click 'Add to Cart' button
		 List<String> newWindow=new ArrayList<String>(WindowHandles);
		 driver.switchTo().window(newWindow.get(1));  //driver.switchTo().window(window1.get(1));
		 //System.out.println(newWindow.get(1));
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		 System.out.println("Before Add to Cart");
		 Thread.sleep(50);
		 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		 //WebElement addcart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		 
		 //driver.executeScript("arguments[0].click();", addcart);
		 //driver.executeScript("arguments[0].click();", ;
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
		 System.out.println("After Add to Cart");
		 //8. Get the cart subtotal and verify if it is correct.
		 //driver.findElement(By.xpath("(//span[@id='attach-accessory-cart-subtotal']")).click();
		 Thread.sleep(50);
		 //driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		 System.out.println("After Navigate to Cart");
		 driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
		 WebElement subTotal = driver.findElement(By.xpath("//span/span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']"));
		 float subtotalprice=Float.parseFloat(subTotal.getText().replace("," ,""));
		 System.out.println(subtotalprice);
		 //if(subTotal.getText().contains("62,999.00")) {
		 Thread.sleep(30);
		Assert.assertEquals(subtotalprice, price,"fail");
		System.out.println("passed");
		 }
		 //System.out.println("I can conform the subtotal is showing correct phoneprice");
		//}else {
			//System.out.println("I can conform the subtotal is not correct phoneprice");
		//}
		 
		 
		 //9. Close the browser


	


}
