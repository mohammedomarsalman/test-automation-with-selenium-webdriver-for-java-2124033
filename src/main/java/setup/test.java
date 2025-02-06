package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class test {

  static public WebDriver driver;
  static {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("-no--sandbox");
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {

    driver.get("https://www.selenium.dev/selenium/web/formPage.html");

    WebElement button = driver.findElement(By.id("imageButton"));
    button.click();

  }

}
