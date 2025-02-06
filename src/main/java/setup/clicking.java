package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class clicking extends Main{

static public WebDriver driver;
static {
  chromedriver().setup();
  var options= new ChromeOptions();
  options.addArguments("--no-sandbox")
  driver =new  ChromeDriver(options);
}
  public static void main(String[] args) {

    driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    driver.findElement(
      By.xpath("//button[text='Submit']")
      ).click();

    driver.findElement(
      By.xpath("a[normalize-space(text())='Return to index']")
      ).click();

    
  }
  
}
