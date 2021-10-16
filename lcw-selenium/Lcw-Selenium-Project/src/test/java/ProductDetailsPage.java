import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage{

    By addToCartLocator = new By.ByCssSelector("a[class='add-to-cart button-link add-to-cart-button']");
    By productSizeLocator = new By.ByCssSelector("a[key='2']");
    By goToCartLocator = new By.ByCssSelector("i[class='header-bag-icon bndl-shopping-bag bndl-shopping-bag-dims']");

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailsPage() {
        return isDisplayed(addToCartLocator);
    }

    public void addToCart() throws InterruptedException {
        click(productSizeLocator);
        Thread.sleep(800);
        click(addToCartLocator);
        Thread.sleep(800);
        click(goToCartLocator);
        Thread.sleep(800);
    }
}
