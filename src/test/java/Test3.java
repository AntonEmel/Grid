import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test3 {

    private int m = 10;

    @Test
    public void test4() throws MalformedURLException {
        System.out.println("Test3 class test4");
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://172.16.64.131:4444/wd/hub"), caps);
        driver.navigate().to("https://mail.ru");
        driver.close();
    }

    @Test
    public void test5() throws MalformedURLException {
        System.out.println("Test3 class test5");
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://172.16.64.131:4444/wd/hub"), caps);
        driver.navigate().to("https://mail.ru");
        driver.close();
    }

    @Test
    public void test6() throws MalformedURLException {
        System.out.println("Test3 class test6");
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://172.16.64.131:4444/wd/hub"), caps);
        driver.navigate().to("https://mail.ru");
        driver.close();
    }

}
