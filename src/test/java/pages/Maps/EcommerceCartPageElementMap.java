package pages.Maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonPages;

public class EcommerceCartPageElementMap extends CommonPages {
    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/span")
    protected WebElement labelYourCart;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")
    protected WebElement labelProduct;

    @FindBy(id = "checkout")
    protected WebElement bntCheckout;

    @FindBy(id = "remove-sauce-labs-backpack")
    protected WebElement btnRemoveCart;
}
