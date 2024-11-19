package pages.Maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonPages;

public class EcommerceCheckoutPageElementMap extends CommonPages {
    @FindBy(id = "first-name")
    protected WebElement fieldFirstName;

    @FindBy(id = "last-name")
    protected WebElement fieldLastName;

    @FindBy(id = "postal-code")
    protected WebElement fieldPostalCode;

    @FindBy(id = "continue")
    protected WebElement btnContinue;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/span")
    protected WebElement labelCheckoutInformation;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/form/div[1]/div[4]/h3")
    protected WebElement erroMessage;
}
