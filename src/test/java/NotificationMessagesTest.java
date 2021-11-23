import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NotificationMessagesTest extends BaseTest {

    @Test
    public void checkNotificationText() {
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='flash']"))));
        String notificationText = driver.findElement(By.xpath("//div[@id='flash']")).getText();
        assertEquals(notificationText,"Action successful\n" +
                "×");


    }
}
