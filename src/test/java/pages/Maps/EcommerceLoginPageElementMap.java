package pages.Maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonPages;

public class EcommerceLoginPageElementMap extends CommonPages {
    @FindBy(id = "user-name")
    protected WebElement fieldUser ;

    @FindBy(id = "password")
    protected WebElement fieldPassword;

    @FindBy(id = "login-button")
    protected WebElement btnLogin;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/span")
    protected WebElement labelProducts;

}
