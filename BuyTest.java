package Test;

import BaseTest.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BuyTest extends Base {
@Test

    public void RegisterTest (){

    List<WebElement> Produse = Driver.findElements(By.xpath("//div[@class='categoriesMenuWrapper']/div"));
    Produse.get(0).click();

    List<WebElement> RandomList = Driver.findElements(By.xpath("//div[@class='categoriesList']/a"));
    RandomList.get(0).click();

    new WebDriverWait(Driver,10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='productlisting']/div")));
    List<WebElement> RandomLaptop = Driver.findElements(By.xpath("//div[@class='productlisting']/div"));
    Random random = new Random();
    int indexLaptop = random.nextInt(RandomLaptop.size());
    RandomLaptop.get(indexLaptop).click();

    new WebDriverWait(Driver,10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("firstname")));
    WebElement Nume = Driver.findElement(By.id("firstname"));
    Nume.sendKeys("Manolache");

    WebElement Prenume = Driver.findElement(By.id("lastname"));
    Prenume.sendKeys("Alexandru");

    WebElement NrTelefon = Driver.findElement(By.id("telephone"));
    NrTelefon.sendKeys("0754940939");

    WebElement Email = Driver.findElement(By.xpath("//input[@name='email_address']"));
    Email.sendKeys("undo444@yahoo.com");

    WebElement Gender = Driver.findElement(By.id("customers_gender"));
    Select select = new Select(Gender);
    select.selectByVisibleText("Domnul");

    WebElement Adresa = Driver.findElement(By.id("street_address"));
    Adresa.sendKeys("Stefan cel Mare");

    List<WebElement> Judet = Driver.findElements(By.xpath("//select[@name='entry_suburb']/option"));
    Random random1 = new Random(Judet.size());
    int randomindex = random1.nextInt(Judet.size());
    Judet.get(randomindex).click();

    new WebDriverWait(Driver,10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("adr_sel_1")));
    WebElement AdresaBox = Driver.findElement(By.id("adr_sel_1"));
    AdresaBox.click();

    WebElement ComentariiBox = Driver.findElement(By.xpath("//div[@class='form-group']/textarea"));
    ComentariiBox.sendKeys("Detalii Comanda");

    WebElement ConditiiBox = Driver.findElement(By.id("read_retur"));
    ConditiiBox.click();

    WebElement AdultBox = Driver.findElement(By.xpath("//input[@name='e_major']"));
    AdultBox.click();







    }

}
