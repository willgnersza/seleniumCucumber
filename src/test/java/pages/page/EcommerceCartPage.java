package pages.page;

import org.openqa.selenium.support.PageFactory;
import pages.Maps.EcommerceCartPageElementMap;

public class EcommerceCartPage extends EcommerceCartPageElementMap {
    public EcommerceCartPage(){
        PageFactory.initElements(driver, this);
    }

    public String validationProductCart (){
        labelYourCart.isDisplayed();
        labelProduct.isDisplayed();
        String validationTextProduct;
        validationTextProduct = labelProduct.getText();
        return validationTextProduct;
    }

    public void acessCheckout (){
        bntCheckout.click();
    }
}
