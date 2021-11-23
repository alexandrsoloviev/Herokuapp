import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortableDataTablesTest extends BaseTest {

    @Test
    public void checkDataTables() {
        driver.get("https://the-internet.herokuapp.com/tables");
        String checkLastName = driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[1]")).getText();
        String checkName = driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[2]")).getText();
        String checkEmail = driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[3]")).getText();
        String checkDue = driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[4]")).getText();


        assertEquals(checkLastName, "Smith");
        assertEquals(checkName, "John");
        assertEquals(checkEmail, "jsmith@gmail.com");
        assertEquals(checkDue, "$50.00");


    }
}
