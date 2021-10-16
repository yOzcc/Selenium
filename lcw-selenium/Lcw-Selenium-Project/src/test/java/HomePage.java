import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    SearchBox searchBox;

    By cartContainerLocator = new By.ByCssSelector("a[class='oq-up plus']");
    By checkAllLocator = new By.ByCssSelector("a[href='/tr-TR/TR/FastDelivery']");


    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isOnHomePage() {
        return isDisplayed(checkAllLocator);
    }

    public boolean productCount() {
        return isDisplayed(cartContainerLocator);
    }

    public void goToCart() throws InterruptedException {
        click(cartContainerLocator);
    }




}
