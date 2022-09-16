package main.java.carrefour;

import carrefour.ShopingPage;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private final int TIMEOUT_COOKIE = 20;

    private By cssSelectorAccept = By.cssSelector("button#onetrust-accept-btn-handler");
    private By cssSelectorMaisonLoisires = By.cssSelector("[for='header-tab-non-food']");
    private static final Logger log = LogManager.getLogger(HomePage.class);
//    @finBy(xpath = "gggg") private WebElement nnnnn;////  factory selenume

    public HomePage(WebDriver driver/*, WebElement nnnnn*/) {
        this.driver = driver;
//        this.nnnnn = nnnnn;
    }


    /////////////////////********************/////////- Fermer les cookies*///////////////////////////////////////////

    /**
     * Function qui accepete les cokies
     *
     * @return
     */
    public HomePage acceptCookie() {
        log.info("j'accepte les cookies");
//        log.info("j'accepte les cookies");
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement bouttonAccept = wait.until(ExpectedConditions.elementToBeClickable(cssSelectorAccept));
        bouttonAccept.click();
//        PageFactory.initElements(driver,this);
        return this;

    }

//////////////*************************- Ouvrir section Maisons & Loisirs ************************************/////////////////////////////////////////


    public ShopingPage openMaisonsLoisirs() {
        WebElement bouttonMaisonLoisires = driver.findElement(cssSelectorMaisonLoisires);
        bouttonMaisonLoisires.click();
        return new ShopingPage(driver);

    }
}