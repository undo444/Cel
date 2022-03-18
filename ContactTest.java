package Test;

import BaseTest.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ContactTest extends Base {
    @Test

    public void Contact (){


        List<WebElement> ContactClick = Driver.findElements(By.xpath("//div[@class='menu']//a[@rel='nofollow']"));
        ContactClick.get(3).click();

        List<WebElement> Intrebare = Driver.findElements(By.xpath("//select[@id='mainSelect']/option"));
        Intrebare.get(7).click();

        WebElement Nume = Driver.findElement(By.xpath("//input[@name='generala_nume']"));
        Nume.sendKeys("Manolache Alexandru");

        WebElement Email = Driver.findElement(By.xpath("//input[@name='generala_email']"));
        Email.sendKeys("undo444@yahoo.com");

        WebElement NrTel = Driver.findElement(By.xpath("//input[@name='generala_telefon']"));
        NrTel.sendKeys("0754940939");

        List<WebElement> ContinueClick = Driver.findElements(By.xpath("//div[contains(text(),'Continua')]"));
        ContinueClick.get(3).click();

        WebElement Mesaj = Driver.findElement(By.id("generala_mesaj"));
        Mesaj.sendKeys("Am o problema in legatura cu ");

//        List<WebElement> Trimite = Driver.findElements(By.xpath("//div[contains(text(),'Trimite')]"));
//        Trimite.get(2).click();
    }
}
