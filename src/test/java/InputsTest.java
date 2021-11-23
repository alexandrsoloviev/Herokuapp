import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    public void checkInputs(){
        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("1");
        input.sendKeys(Keys.ARROW_DOWN);
        assertEquals(input.getAttribute("value"),"0");

        input.clear();
        input.sendKeys("1e2");
        input.sendKeys(Keys.ARROW_UP);
        assertEquals(input.getAttribute("value"),"101");

        input.clear();
        input.sendKeys("5.7");
        input.sendKeys(Keys.ARROW_UP);
        assertEquals(input.getAttribute("value"),"6");



    }
}
