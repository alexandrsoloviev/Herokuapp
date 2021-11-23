import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest{

    @Test
    public void checkTTypos(){
        driver.get("https://the-internet.herokuapp.com/typos");
        WebElement text = driver.findElement(By.xpath("//p[contains(text(),\"Sometimes you'll see a typo, other times you won,t\")]"));
        assertEquals(text.getText(),"Sometimes you'll see a typo, other times you won't.");
    }
}
