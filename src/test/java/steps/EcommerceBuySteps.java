package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.page.*;
import util.CommonResources;

public class EcommerceBuySteps {


//Dado
    @Dado("^realizo login$")
    public void realizoLogin() {
        String ecommerceUrl = "https://www.saucedemo.com/";
        CommonResources.abrirNavegador(ecommerceUrl);
        EcommerceLoginPage ecommercePage = new EcommerceLoginPage();
        ecommercePage.login();
    }
//Quando
    @Quando("^adiciono o produto no carrinho$")
    public void adicionoOProdutoNoCarrinho() {
        EcommerceBuyPage ecommerceBuyPage = new EcommerceBuyPage();
        ecommerceBuyPage.addProductCart();
    }
//Entao
    @Entao("^a compra e finalizada corretamente$")
    public void aCompraEFinalizadaCorretamente() {
        EcommerceCheckoutCompletePage ecommerceCheckoutCompletePage = new EcommerceCheckoutCompletePage();
        Assert.assertEquals("Thank you for your order!", ecommerceCheckoutCompletePage.validationOrder());
        ecommerceCheckoutCompletePage.clickBackHome();
    }

    @Entao("^o produto nao esta mais disponivel no carrinho$")
    public void oProdutoNaoEstaMaisDisponivelNoCarrinho() {
        EcommerceCartPage ecommerceCartPage = new EcommerceCartPage();
        Assert.assertFalse(ecommerceCartPage.validationRemoveProductCart());
    }

    @Entao("^e apresentada a mensagem \"([^\"]*)\"$")
    public void eApresentadaAMensagem(String expectedMessage) throws Throwable {
        EcommerceCheckoutPage ecommerceCheckoutPage = new EcommerceCheckoutPage();
        Assert.assertEquals(expectedMessage, ecommerceCheckoutPage.validationMessage());// Write code here that turns the phrase above into concrete actions
    }
//E
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
        ecommerceCheckoutPage.preencheFieldFirstName();
        ecommerceCheckoutPage.preencheFieldLastName();
        ecommerceCheckoutPage.preencheFieldPostalCode();
        ecommerceCheckoutPage.clickBtnContinue();
    }

    @E("^confirmo os dados em Checkout Overview$")
    public void confirmoOsDadosEmCheckoutOverview() {
        EcommerceCheckoutOverviewPage ecommerceCheckoutPage = new EcommerceCheckoutOverviewPage();
        Assert.assertEquals("Total: $32.39", ecommerceCheckoutPage.validationProductCheckoutOverview());
        ecommerceCheckoutPage.clickFinish();
    }
    @E("^removo o produto do carrinho$")
    public void removoOProdutoDoCarrinho() {
        EcommerceCartPage ecommerceCartPage = new EcommerceCartPage();
        ecommerceCartPage.removeProductCart();

    }

    @E("^nao informo first name$")
    public void naoInformoFirstName() {
        EcommerceCheckoutPage ecommerceCheckoutPage = new EcommerceCheckoutPage();
        ecommerceCheckoutPage.preencheFieldLastName();
        ecommerceCheckoutPage.preencheFieldPostalCode();
        ecommerceCheckoutPage.clickBtnContinue();
    }

    @E("^nao informo last name$")
    public void naoInformoLastName() {
        EcommerceCheckoutPage ecommerceCheckoutPage = new EcommerceCheckoutPage();
        ecommerceCheckoutPage.preencheFieldFirstName();
        ecommerceCheckoutPage.preencheFieldPostalCode();
        ecommerceCheckoutPage.clickBtnContinue();
    }

    @E("^nao informo zip/Postal Code$")
    public void naoInformoZipPostalCode() {
        EcommerceCheckoutPage ecommerceCheckoutPage = new EcommerceCheckoutPage();
        ecommerceCheckoutPage.preencheFieldFirstName();
        ecommerceCheckoutPage.preencheFieldLastName();
        ecommerceCheckoutPage.clickBtnContinue();
    }
}
