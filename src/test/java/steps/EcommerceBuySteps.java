package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.page.*;
import util.CommonResources;

public class EcommerceBuySteps {
    @Dado("^realizo login$")
    public void realizoLogin() {
        String ecommerceUrl = "https://www.saucedemo.com/";
        CommonResources.abrirNavegador(ecommerceUrl);
        EcommerceLoginPage ecommercePage = new EcommerceLoginPage();
        ecommercePage.login();
    }

    @Quando("^adiciono o produto no carrinho$")
    public void adicionoOProdutoNoCarrinho() {
        EcommerceBuyPage ecommerceBuyPage = new EcommerceBuyPage();
        ecommerceBuyPage.addProductCart();
    }

    @E("^acesso o carrinho$")
    public void acessoOCarrinho() {
        EcommerceCartPage ecommerceCartPage = new EcommerceCartPage();
        Assert.assertEquals("Sauce Labs Backpack", ecommerceCartPage.validationProductCart());
        ecommerceCartPage.acessCheckout();
    }

    @E("^realizo o checkout$")
    public void realizoOCheckout() {
        EcommerceCheckoutPage ecommerceCheckoutPage = new EcommerceCheckoutPage();
        ecommerceCheckoutPage.validationPageCheckoutInformation();
        ecommerceCheckoutPage.addCheckoutInformation();
    }

    @E("^confirmo os dados em Checkout Overview$")
    public void confirmoOsDadosEmCheckoutOverview() {
        EcommerceCheckoutOverviewPage ecommerceCheckoutPage = new EcommerceCheckoutOverviewPage();
        Assert.assertEquals("Total: $32.39", ecommerceCheckoutPage.validationProductCheckoutOverview());
        ecommerceCheckoutPage.clickFinish();
    }

    @Entao("^a compra e finalizada corretamente$")
    public void aCompraEFinalizadaCorretamente() {
        EcommerceCheckoutCompletePage ecommerceCheckoutCompletePage = new EcommerceCheckoutCompletePage();
        Assert.assertEquals("Thank you for your order!", ecommerceCheckoutCompletePage.validationOrder());
        ecommerceCheckoutCompletePage.clickBackHome();
    }
}
