package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import pages.page.EcommerceLoginPage;
import util.CommonResources;

public class EcommerceLoginSteps {

    @Dado("^que abro o navegador$")
        public void que_abro_o_navegador() {
        String ecommerceUrl = "https://www.saucedemo.com/";
        CommonResources.abrirNavegador(ecommerceUrl);
        }
    @Quando("^acesso a pagina do ecommerce$")
        public void acesso_a_pagina_do_ecommerce () {
            EcommerceLoginPage ecommercePage = new EcommerceLoginPage();
            ecommercePage.login();
        };
    @Entao("^a pagina é aberta corretamente$")
        public void a_pagina_é_aberta_corretamente () {
            EcommerceLoginPage ecommercePage = new EcommerceLoginPage();
            ecommercePage.validationLogin();
        };
}
