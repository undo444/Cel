package BaseTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public WebDriver Driver;

    @Before

    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\ChromeDriver\\chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get("https://www.cel.ro/");
        Driver.manage().window().maximize();

        String expectedresult = "CEL.ro - Cel mai Cel Marketplace";
        String actualResult = Driver.getTitle();
        Assert.assertEquals(expectedresult,actualResult);

        WebElement Add = Driver.findElement(By.xpath("//a[@class='main accept btn-special']"));
        Add.click();
    }

    @After
        public void QuitTest() {
            Driver.quit();
        }
    }

