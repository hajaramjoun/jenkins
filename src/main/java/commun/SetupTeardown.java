package main.java.commun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SetupTeardown {
    protected WebDriver driver;
    String browser = "edge";

    @BeforeMethod
    public void setUp() {
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();


                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();

                break;
        }
        driver.get("https://www.carrefour.fr/");
        driver.manage().window().maximize();
//        System.out.println(System.getProperty("user.dir"));
//        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\chromedriver.exe");// mettre webdriver dans le systeme win 32
        driver.navigate();
        String browser = "chrome";

    }

    @AfterMethod
    public void teardown() {
        driver.quit();


    }


}
