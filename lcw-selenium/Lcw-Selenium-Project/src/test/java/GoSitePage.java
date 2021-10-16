import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoSitePage extends BasePage{
    public GoSitePage(WebDriver driver) {
        super(driver);
    }

    By logInLocator = new By.ByCssSelector("span[class='dropdown-label']");
    By closePop = new By.ByCssSelector("p[class='cookie__dismiss']");

    public void goSite() throws InterruptedException {

        Thread.sleep(700);
        click(closePop);
        Thread.sleep(800);
        click(logInLocator);
        Thread.sleep(800);
    }
}
