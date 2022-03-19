package Test;

import BaseTest.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class LogIN extends Base {
@Test
    public void Login(){


        WebElement ContClick = Driver.findElement(By.xpath("//span[contains(text(),'Contul')]"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(ContClick).build().perform();

        List<WebElement> ContList = Driver.findElements(By.xpath("//div[@class='myAccountMenu']/a"));
        ContList.get(0).click();

        WebElement Email = Driver.findElement(By.xpath("//input[@name='email_addressx']"));
        Email.sendKeys("undo444@yahoo.com");

        WebElement Parola = Driver.findElement(By.xpath("//input[@name='passwordx']"));
        Parola.sendKeys("test1234");

        WebElement SubmitClick = Driver.findElement(By.xpath("//button[contains(text(),'Conecteaza-te')]"));
        SubmitClick.click();
    }
}
