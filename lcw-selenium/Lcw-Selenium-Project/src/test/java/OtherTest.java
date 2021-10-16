import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class OtherTest extends BaseTest{

    GoSitePage goSitePage;
    LogInPage logInPage;
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailsPage productDetailsPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void go_to_site() throws InterruptedException{
        goSitePage = new GoSitePage(driver);
        goSitePage.goSite();
        Thread.sleep(1000);

    }

    @Test
    @Order(2)
    public void log_in() throws InterruptedException {
        logInPage = new LogInPage(driver);
        logInPage.logIn("bmyasinozcelik@outlook.com","Ab6192986");
        Thread.sleep(2000);

    }
    @Test
    @Order(3)
    public void search_a_product() throws InterruptedException {
        homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.isOnHomePage(),"It's not home page.!");
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Pantolon");
        Thread.sleep(800);
        productsPage.otherProductList();
        Thread.sleep(700);

        Assertions.assertTrue(productsPage.isOnProductPage(),"It's not product page.!");

    }

    @Test
    @Order(4)
    public void select_a_product() throws InterruptedException {
        productDetailsPage = new ProductDetailsPage(driver);
        Thread.sleep(2000);
        Random rand = new Random();
        int value =rand.nextInt(47);
        Thread.sleep(2000);
        productsPage.selectProduct(value);
        Assertions.assertTrue(productDetailsPage.isOnProductDetailsPage(), "It's not a product details page.!");
    }

    @Test
    @Order(5)
    public void add_product_to_cart() throws InterruptedException {
        Thread.sleep(2000);
        productDetailsPage.addToCart();
        Thread.sleep(2000);
        Assertions.assertTrue(homePage.productCount(), "Couldn't add product.!");
    }

    @Test
    @Order(6)
    public void go_to_cart() throws InterruptedException {
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.isEmpty(), " Cart is Empty.!");

    }

    @Test
    @Order(7)
    public void delete_product_to_cart() throws InterruptedException {
        Thread.sleep(2000);
        cartPage.deleteToCart();

    }
}
