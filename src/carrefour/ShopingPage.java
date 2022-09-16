package carrefour;

import main.java.carrefour.BestSellerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopingPage {
    WebDriver driver;
    private final int TIMEOUT_COOKIE = 10;
    By cssSelectorRayon = By.cssSelector("[aria-label='Ouvrir la liste des rayons']");
    By cssSelectorMeuilleurVente = By.cssSelector("  #data-menu-level-1_R26 > li:nth-child(3) > a");
    ;

    public ShopingPage(WebDriver driver) {
        this.driver = driver;
    }
    //    - Ouvrir menu Rayons -> Sports Loisirs, etc -> Meilleures ventes

    public BestSellerPage openRayons() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement bouttonMaisonLoisires = wait.until(ExpectedConditions.elementToBeClickable(cssSelectorRayon));
        bouttonMaisonLoisires.click();

        WebElement navWebElements =  driver.findElement(By.cssSelector("[aria-labelledby='data-rayons'] li[tabindex='0']:nth-of-type(5)"));
        Actions actions = new Actions(driver);
        actions.moveToElement(navWebElements);
        actions.perform();
        WebElement bouttonMeuilleurVente  = wait.until(ExpectedConditions.elementToBeClickable(cssSelectorMeuilleurVente));
        bouttonMeuilleurVente.click();
//        buttonSport.click();

        return new BestSellerPage();
    }



}