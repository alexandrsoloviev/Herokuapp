import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class HoversTest extends BaseTest {


    @Test
    public void checkHover() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement profile1 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/img[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(profile1).perform();
        String name1 = driver.findElement(By.xpath("//h5[contains(text(),'name: user1')]")).getText();
        assertEquals(name1, "name: user1");


        actions.moveToElement(profile1).perform();
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();

        assertFalse(driver.findElement(By.xpath("//body//h1")).isDisplayed());

    }
}
