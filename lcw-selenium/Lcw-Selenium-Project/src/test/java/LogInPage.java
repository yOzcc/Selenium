import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage{

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void logIn(String id, String pass) throws InterruptedException {


        By accountName = By.id("LoginEmail");
        Thread.sleep(700);
        click(accountName);
        Thread.sleep(700);
        sendText(accountName,"bmyasinozcelik@outlook.com");

        By password = By.id("Password");
        Thread.sleep(700);
        click(password);
        Thread.sleep(700);
        sendText(password,"Ab6192986");

        By logIn = By.id("loginLink");
        Thread.sleep(700);
        click(logIn);
        Thread.sleep(700);

    }
}
