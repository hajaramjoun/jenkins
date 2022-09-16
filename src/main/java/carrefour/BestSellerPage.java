package main.java.carrefour;

import main.java.carrefour.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BestSellerPage {
    WebDriver driver;
    private final int TIMEOUT_COOKIE = 10;
    ///*           *****************  - Cliquer sur "Voir" dans le premier resultat de Sports & Loisir (Draisienne pliable) ****************               */  //////////////////////////
   By cssSelectorFirstElement = By.xpath(("(//*[@title=\"Montre connectée avec thermometre BLAUPUNKT\"])[1]"));;
    public ProductPage openFirstElement() {
//        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT_COOKIE));
//
//     WebElement bouttonFirstElement = wait.until(ExpectedConditions.elementToBeClickable(cssSelectorFirstElement));
//
//        bouttonFirstElement.click();
        return new ProductPage();
    }
}
