package setup;

import org.openqa.selenium.*;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown extends Main {

  public static void main(String[] args) {

    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    Select dropdown = new Select(driver.findElement(By.name("my-select")));
    dropdown.selectByValue("2");
    dropdown.selectByVisibleText("Three");
    dropdown.selectByIndex(1);
    dropdown.selectByIndex(0);
    WebElement selectedoption = dropdown.getFirstSelectedOption();

    List<WebElement> selectedoptions = dropdown.getAllSelectedOptions();
    // dropdown.deselectByValue("1"); if dowpdown has multi select option
  }

}
