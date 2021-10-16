import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By viewButtonLocator = new By.ByCssSelector("ul[class='breadcrumb']");
    By productNameLocator = new By.ByCssSelector("a[class='a_model_item']");
    By otherPageLocator = new By.ByCssSelector("a[class='lazy-load-button']");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(viewButtonLocator);
    }

    public void otherProductList() throws InterruptedException {
       click(otherPageLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();

    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
