package pages.Maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonPages;

public class EcommerceCheckoutCompletePageElementMap extends CommonPages {
    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/span")
    protected WebElement labelCheckoutComplete;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/h2")
    protected WebElement labelConfirmationOrder;

    @FindBy(id = "back-to-products")
    protected WebElement btnBackHome;
}
