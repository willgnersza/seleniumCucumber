package pages.page;

import org.openqa.selenium.support.PageFactory;
import pages.Maps.EcommerceCheckoutPageElementMap;

public class EcommerceCheckoutPage extends EcommerceCheckoutPageElementMap {
    public EcommerceCheckoutPage(){
        PageFactory.initElements(driver, this);
    }

    public void validationPageCheckoutInformation (){
        labelCheckoutInformation.isDisplayed();
    }

    public void addCheckoutInformation (){
        fieldFirstName.sendKeys("123");
        fieldLastName.sendKeys("456");
        fieldPostalCode.sendKeys("789");
        btnContinue.click();
    }
}
