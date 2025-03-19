/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author itexps
 */
public class WorkFlowTest {
   private static WebDriver driver;
   private String baseUrl;
   
    public WorkFlowTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
     System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");     
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
         driver.close();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
     
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
      
    }
    
    @Test
    public void testLogin() throws Exception {
         driver.manage().window().maximize();
         driver.get("http://demo.guru99.com/test/newtours/index.php");
         driver.findElement(By.name("userName")).sendKeys("mercury");
         driver.findElement(By.name("password")).sendKeys("mercury");
         driver.findElement(By.name("submit")).click();
         
    } 
    
     @Test
    public void testLoginout() throws Exception {
     
         driver.findElement(By.xpath(".//*[contains(text(),'SIGN-OFF')]")).click();
         
    } 
}
