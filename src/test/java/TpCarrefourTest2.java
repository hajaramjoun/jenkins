package test.java;

import main.java.carrefour.HomePage;
import main.java.commun.SetupTeardown;
import org.testng.annotations.Test;

public class TpCarrefourTest2 extends SetupTeardown {


    //    ChromeOptions options= new ChromeOptions();


//    RemoteWebDriver driver = new RemoteWebDriver(new URL(" http://192.168.121.12:4444"), options);
//    RemoteWebDriver driver = new RemoteWebDriver(new URL(" http://admin:admin@192.168.121.12:4444"), options);//CONFIGURATION DANS LE FICHIER config.toml
//    RemoteWebDriver driver = new RemoteWebDriver(new URL(" http://192.168.121.16:4444"), options);//remote hub and node



    @Test
    public void test2() {
        //Arrange


        //Act
        HomePage homePage = new HomePage(driver, nnnnn);
        homePage.acceptCookie().openMaisonsLoisirs().openRayons().openFirstElement();



        // Asserts


    }



}
