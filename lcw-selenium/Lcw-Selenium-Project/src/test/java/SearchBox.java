import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searchBoxLocator = By.id("search_input");
    By searchButtonLocator = new By.ByCssSelector("button[class='searchButton']");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) throws InterruptedException {
        click(searchBoxLocator);
        sendText(searchBoxLocator, text);
        click(searchButtonLocator);
    }
}
