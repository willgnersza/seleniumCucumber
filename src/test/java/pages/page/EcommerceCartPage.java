package pages.page;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import pages.Maps.EcommerceCartPageElementMap;

public class EcommerceCartPage extends EcommerceCartPageElementMap {
    public EcommerceCartPage(){
        PageFactory.initElements(driver, this);
    }

    public String validationProductCart (){
        labelYourCart.isDisplayed();
        labelProduct.isDisplayed();
        return labelProduct.getText();
    }

    public void acessCheckout (){
        bntCheckout.click();
    }

    public void removeProductCart (){
        btnRemoveCart.click();
    }

    public boolean validationRemoveProductCart (){
        try{
            labelProduct.isDisplayed();
            return true;
        }
        catch(NoSuchElementException e){
            return false;
        }
    }
}
