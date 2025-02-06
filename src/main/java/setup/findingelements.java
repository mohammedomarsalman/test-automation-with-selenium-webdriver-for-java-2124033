import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import java.util.List;

import setup.Main;

class findingelements extends Main {

  public static void main(String[] args) {
    driver.get("https://selenium.dev/selenium/web/formPage.html");
    WebElement emailtext = driver.findElement(By.id("email"));
    List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type='radio']"));

    System.out.println(radiobuttons.size());
    WebElement bottombutton = driver.findElement(
        RelativeLocator.with(By.name("submit")).below(By.id("submit")));
    WebElement buttonimage = driver.findElement(By.id("imageButton"));

    WebElement firstClickbttn = driver.findElement(By.cssSelector("input[value='Click!']"));

    WebElement firstname = driver.findElement(By.name("id-name1"));
    firstname.getText();
    firstname.clear();
    firstname.sendKeys("Writing into text box");
    firstname.getText();
    // driver.quit();
  }
}
