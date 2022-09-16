package test.java;

import main.java.carrefour.HomePage;
import main.java.commun.SetupTeardown;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TpCarrefourTest extends SetupTeardown {


    //    ChromeOptions options= new ChromeOptions();
//    public TpCarrefourTest() throws MalformedURLException {
//    }

//    RemoteWebDriver driver = new RemoteWebDriver(new URL(" http://192.168.121.12:4444"), options);
//    RemoteWebDriver driver = new RemoteWebDriver(new URL(" http://admin:admin@192.168.121.12:4444"), options);//CONFIGURATION DANS LE FICHIER config.toml
//    RemoteWebDriver driver = new RemoteWebDriver(new URL(" http://192.168.121.16:4444"), options);//remote hub and node


    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @AfterMethod
    @Override
    public void teardown() {
        super.teardown();
    }

    @Test
    public void test() {
        //Arrange


        //Act
        HomePage homePage = new HomePage(driver, nnnnn);
        homePage.acceptCookie().openMaisonsLoisirs().openRayons().openFirstElement();


        // Asserts



    }



}
