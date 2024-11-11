package pages.page;

import org.openqa.selenium.support.PageFactory;
import pages.Maps.EcommerceCheckoutCompletePageElementMap;

public class EcommerceCheckoutCompletePage extends EcommerceCheckoutCompletePageElementMap {
    public EcommerceCheckoutCompletePage(){
        PageFactory.initElements(driver, this);
    }

    public String validationOrder () {
        labelCheckoutComplete.isDisplayed();
        labelConfirmationOrder.isDisplayed();

        String validationTextConfirmationOrder;
        validationTextConfirmationOrder = labelConfirmationOrder.getText();
        return validationTextConfirmationOrder;
    }

    public void clickBackHome () {
        btnBackHome.click();
    }
}
