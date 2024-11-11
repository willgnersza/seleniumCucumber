package pages.page;

import org.openqa.selenium.support.PageFactory;
import pages.Maps.EcommerceLoginPageElementMap;

public class EcommerceLoginPage extends EcommerceLoginPageElementMap {
    public EcommerceLoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void login (){
        fieldUser.sendKeys("standard_user");
        fieldPassword.sendKeys("secret_sauce");
        btnLogin.click();
    }

    public void validationLogin (){
        labelProducts.isDisplayed();
    }
}
