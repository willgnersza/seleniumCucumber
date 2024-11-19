package pages.page;

import org.openqa.selenium.support.PageFactory;
import pages.Maps.EcommerceCheckoutOverviewPageElementMap;

public class EcommerceCheckoutOverviewPage extends EcommerceCheckoutOverviewPageElementMap {
    public EcommerceCheckoutOverviewPage(){
        PageFactory.initElements(driver, this);
    }

    public String validationProductCheckoutOverview () {
        labelCheckoutOverview.isDisplayed();
        paymentInformation.isDisplayed();
        shippingInformation.isDisplayed();
        priceTotal.isDisplayed();
        priceTax.isDisplayed();
        total.isDisplayed();
        btnFinish.isDisplayed();

        String validationTextTotalProduct;
        validationTextTotalProduct = total.getText();
        return validationTextTotalProduct;
    }

    public void clickFinish () {

        btnFinish.click();
    }
}
