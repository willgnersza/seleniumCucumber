package pages.Maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonPages;

public class EcommerceCheckoutOverviewPageElementMap extends CommonPages {
    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/span")
    protected WebElement labelCheckoutOverview;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/div[2]")
    protected WebElement paymentInformation;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/div[4]")
    protected WebElement shippingInformation;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/div[6]")
    protected WebElement priceTotal;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/div[7]")
    protected WebElement priceTax;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/div[8]")
    protected WebElement total;

    @FindBy(id = "finish")
    protected WebElement btnFinish;

}
