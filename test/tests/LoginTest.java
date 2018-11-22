package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import pages.HomePage;
import pages.Login;

public class LoginTest {

    //objetos
    static WebDriver driver;
    Login objLogin;
    HomePage objHomePage;

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //configura los tiempos implicitos(tiempo de espera para cargar)
    }

    @Before
    public void setUp() {
        driver.get("http://demo.guru99.com/V4/");
    }
    
    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test_Home_Page_Appear_Correct() {
<<<<<<< HEAD
        //Create Login object
=======

>>>>>>> 93f07dbbeece363441029492bd2893639e8d2e2c
        objLogin = new Login(driver);
        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        objLogin.login("mngr160882", "baragAp");
<<<<<<< HEAD
        // go the next page
   
=======
        objHomePage = new HomePage(driver);
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr160882"));

>>>>>>> 93f07dbbeece363441029492bd2893639e8d2e2c
    }

}
