import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by EugenBorisik on 4/20/2016.
 */
public class Test1 {

    @Test
    public void testNAHUI() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://172.16.64.131:4444/wd/hub"), caps);
        driver.navigate().to("https://mail.ru");
    }
}