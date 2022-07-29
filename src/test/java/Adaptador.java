import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Adaptador {
    private WebDriver driver = null;
    private static Adaptador adaptador = null;
    public Adaptador() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    public void abrir(String url) {
        driver.get(url);
    }
    public void cerrar() {
        driver.quit();
    }
    public WebElement findId(String id) {
        return driver.findElement(By.id(id));
    }
    public WebElement findXpath(String element) {
        return driver.findElement(By.xpath(element));
    }
    public  WebElement findSelector(String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));
    }
    public  WebElement findTagName(String tag) {
        return driver.findElement(By.tagName(tag));
    }
}
