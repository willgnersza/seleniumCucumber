package pages.Maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonPages;

public class EcommerceBuyPageElementMap extends CommonPages {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    protected WebElement btnToCartBackpack;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a")
    protected WebElement btnCart;
}
