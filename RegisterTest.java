package Test;

import BaseTest.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class RegisterTest extends Base {
@Test
    public void Regsiter() {

        WebElement Cont = Driver.findElement(By.xpath("//span[contains(text(),'Contul')]"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(Cont).build().perform();

        new WebDriverWait(Driver,5).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='myAccountMenu']/a")));
        List<WebElement> ContClick = Driver.findElements(By.xpath("//div[@class='myAccountMenu']/a"));
        ContClick.get(1).click();

        WebElement Nume = Driver.findElement(By.id("firstname"));
        Nume.sendKeys("Manolache");

        WebElement Prenume = Driver.findElement(By.id("lastname"));
        Prenume.sendKeys("Alexandru");

        new WebDriverWait(Driver,5).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='email_address']")));
        WebElement Email = Driver.findElement(By.xpath("//input[@name='email_address']"));
        Email.sendKeys("undo444@yahoo.com");

        WebElement Gender = Driver.findElement(By.id("customers_gender"));
        Select select = new Select(Gender);
        select.selectByVisibleText("Domnul");

        WebElement NrTel = Driver.findElement(By.id("telephone"));
        NrTel.sendKeys("0754940939");

        WebElement Adresa = Driver.findElement(By.xpath("//textarea[@name='street_address']"));
        Adresa.sendKeys("Stefan cel Mare");

        List<WebElement> Judet = Driver.findElements(By.xpath("//select[@name='entry_suburb']/option"));
        Random random = new Random();
        int index = random.nextInt(Judet.size());
        Judet.get(index).click();

        WebElement Box = Driver.findElement(By.xpath("//input[@name='termeni']"));
        Box.click();

//        WebElement CreazaCont = Driver.findElement(By.xpath("//button[contains(text(),'Creeaza cont')]"));
//        CreazaCont.click();







}
}