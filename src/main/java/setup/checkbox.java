package setup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class checkbox extends Main {

  public static void main(String[] args) {

    driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    WebElement checkbox = driver.findElement(By.id("my-check-1"));
    boolean isSelected = checkbox.isSelected();
    if (!isSelected) {
      checkbox.click();
    }

    WebElement check2 = driver.findElement(By.id("my-check-2"));
    boolean isselect2 = check2.isSelected();
    if (!isselect2) {
      check2.click();
    }

  }

}
