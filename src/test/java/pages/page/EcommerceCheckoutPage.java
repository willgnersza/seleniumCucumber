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

    public void preencheFieldFirstName (){
        fieldFirstName.sendKeys("456");
    }

    public void preencheFieldLastName (){
        fieldLastName.sendKeys("456");
    }

    public void preencheFieldPostalCode (){
        fieldPostalCode.sendKeys("789");
    }
    public void clickBtnContinue (){
        btnContinue.click();
    }

    public String validationMessage (){
        return erroMessage.getText();
    }

}
