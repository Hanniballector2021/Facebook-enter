import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Facebook {

    @Test
    public void TestFecebook() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    driver.get("https://uk-ua.facebook.com/");


    By Email = By.xpath("//input[@data-testid=\"royal_email\"]");
    driver.findElement(Email).sendKeys("sevenupua@gmail.com");

    By Password = By.xpath("//input[@data-testid=\"royal_pass\"]");
    driver.findElement(Password).sendKeys("Hanniballector2017");

    By Enter = By.xpath("//button[@data-testid=\"royal_login_button\"]");
    driver.findElement(Enter).click();

        Thread.sleep(1000);
        driver.manage().deleteAllCookies();
        Thread.sleep(1000);
        driver.navigate().refresh();


        By PasswordReset = By.xpath("//a[contains(text(),'Забыли пароль?')]");
        driver.findElement(PasswordReset).click();

        By Phone = By.xpath("//input[@placeholder=\"Номер мобильного телефона\"]");
        driver.findElement(Phone).sendKeys("+380509796447");

        By Search = By.xpath("//button[@name=\"did_submit\"]");
        driver.findElement(Search).click();
        

    }

}
