package pages.page;

import org.openqa.selenium.support.PageFactory;
import pages.Maps.EcommerceBuyPageElementMap;

public class EcommerceBuyPage  extends EcommerceBuyPageElementMap {
    public EcommerceBuyPage(){
        PageFactory.initElements(driver, this);
    }

    public void addProductCart (){
        btnToCartBackpack.click();
        btnCart.click();
    }
}
