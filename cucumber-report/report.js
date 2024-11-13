$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/teste.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Validar navegacao em um eccomerce",
  "description": "",
  "id": "validar-navegacao-em-um-eccomerce",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 254100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "validar login",
  "description": "",
  "id": "validar-navegacao-em-um-eccomerce;validar-login",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 4,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "que abro o navegador",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "acesso a pagina do ecommerce",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "a pagina é aberta corretamente",
  "keyword": "Entao "
});
formatter.match({
  "location": "EcommerceLoginSteps.que_abro_o_navegador()"
});
formatter.result({
  "duration": 7218470500,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceLoginSteps.acesso_a_pagina_do_ecommerce()"
});
formatter.result({
  "duration": 532914300,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceLoginSteps.a_pagina_é_aberta_corretamente()"
});
formatter.result({
  "duration": 102152600,
  "status": "passed"
});
formatter.after({
  "duration": 1057925300,
  "status": "passed"
});
formatter.before({
  "duration": 48600,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "validar compra",
  "description": "",
  "id": "validar-navegacao-em-um-eccomerce;validar-compra",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 10,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "realizo login",
  "keyword": "Dado "
});
formatter.step({
  "line": 13,
  "name": "adiciono o produto no carrinho",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "acesso o carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "realizo o checkout",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "confirmo os dados em Checkout Overview",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "a compra e finalizada corretamente",
  "keyword": "Entao "
});
formatter.match({
  "location": "EcommerceBuySteps.realizoLogin()"
});
formatter.result({
  "duration": 3442419200,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.adicionoOProdutoNoCarrinho()"
});
formatter.result({
  "duration": 183116500,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.acessoOCarrinho()"
});
formatter.result({
  "duration": 176323100,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.realizoOCheckout()"
});
formatter.result({
  "duration": 340617800,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.confirmoOsDadosEmCheckoutOverview()"
});
formatter.result({
  "duration": 268315100,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.aCompraEFinalizadaCorretamente()"
});
formatter.result({
  "duration": 154671600,
  "status": "passed"
});
formatter.after({
  "duration": 785045100,
  "status": "passed"
});
});