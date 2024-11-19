$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/teste.feature");
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
  "duration": 141300,
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
  "duration": 5804221500,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceLoginSteps.acesso_a_pagina_do_ecommerce()"
});
formatter.result({
  "duration": 584385400,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceLoginSteps.a_pagina_é_aberta_corretamente()"
});
formatter.result({
  "duration": 154531600,
  "status": "passed"
});
formatter.after({
  "duration": 1163353600,
  "status": "passed"
});
formatter.before({
  "duration": 29400,
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
  "duration": 2838077600,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.adicionoOProdutoNoCarrinho()"
});
formatter.result({
  "duration": 252665700,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.acessoOCarrinho()"
});
formatter.result({
  "duration": 214378000,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.realizoOCheckout()"
});
formatter.result({
  "duration": 351406900,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.confirmoOsDadosEmCheckoutOverview()"
});
formatter.result({
  "duration": 338822700,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.aCompraEFinalizadaCorretamente()"
});
formatter.result({
  "duration": 151758100,
  "status": "passed"
});
formatter.after({
  "duration": 1009277400,
  "status": "passed"
});
formatter.before({
  "duration": 32400,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "validar remocao do produto do carrinho",
  "description": "",
  "id": "validar-navegacao-em-um-eccomerce;validar-remocao-do-produto-do-carrinho",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 19,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "realizo login",
  "keyword": "Dado "
});
formatter.step({
  "line": 22,
  "name": "adiciono o produto no carrinho",
  "keyword": "Quando "
});
formatter.step({
  "line": 23,
  "name": "removo o produto do carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "o produto nao esta mais disponivel no carrinho",
  "keyword": "Entao "
});
formatter.match({
  "location": "EcommerceBuySteps.realizoLogin()"
});
formatter.result({
  "duration": 2981020000,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.adicionoOProdutoNoCarrinho()"
});
formatter.result({
  "duration": 209340100,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.removoOProdutoDoCarrinho()"
});
formatter.result({
  "duration": 76439200,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.oProdutoNaoEstaMaisDisponivelNoCarrinho()"
});
formatter.result({
  "duration": 36664600,
  "status": "passed"
});
formatter.after({
  "duration": 1056351500,
  "status": "passed"
});
formatter.before({
  "duration": 35100,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "validar nao preenchimento do campos last name",
  "description": "",
  "id": "validar-navegacao-em-um-eccomerce;validar-nao-preenchimento-do-campos-last-name",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 26,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "realizo login",
  "keyword": "Dado "
});
formatter.step({
  "line": 29,
  "name": "adiciono o produto no carrinho",
  "keyword": "Quando "
});
formatter.step({
  "line": 30,
  "name": "acesso o carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "nao informo first name",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "e apresentada a mensagem \"Error: First Name is required\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "EcommerceBuySteps.realizoLogin()"
});
formatter.result({
  "duration": 2989399400,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.adicionoOProdutoNoCarrinho()"
});
formatter.result({
  "duration": 270160000,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.acessoOCarrinho()"
});
formatter.result({
  "duration": 201799500,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.naoInformoFirstName()"
});
formatter.result({
  "duration": 262900500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Error: First Name is required",
      "offset": 26
    }
  ],
  "location": "EcommerceBuySteps.eApresentadaAMensagem(String)"
});
formatter.result({
  "duration": 48793900,
  "status": "passed"
});
formatter.after({
  "duration": 1897661800,
  "status": "passed"
});
formatter.before({
  "duration": 157200,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "validar nao preenchimento do campos first name",
  "description": "",
  "id": "validar-navegacao-em-um-eccomerce;validar-nao-preenchimento-do-campos-first-name",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 34,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "realizo login",
  "keyword": "Dado "
});
formatter.step({
  "line": 37,
  "name": "adiciono o produto no carrinho",
  "keyword": "Quando "
});
formatter.step({
  "line": 38,
  "name": "acesso o carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 39,
  "name": "nao informo last name",
  "keyword": "E "
});
formatter.step({
  "line": 40,
  "name": "e apresentada a mensagem \"Error: Last Name is required\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "EcommerceBuySteps.realizoLogin()"
});
formatter.result({
  "duration": 2886845300,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.adicionoOProdutoNoCarrinho()"
});
formatter.result({
  "duration": 260712500,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.acessoOCarrinho()"
});
formatter.result({
  "duration": 181034300,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.naoInformoLastName()"
});
formatter.result({
  "duration": 234285500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Error: Last Name is required",
      "offset": 26
    }
  ],
  "location": "EcommerceBuySteps.eApresentadaAMensagem(String)"
});
formatter.result({
  "duration": 27600200,
  "status": "passed"
});
formatter.after({
  "duration": 1150848600,
  "status": "passed"
});
formatter.before({
  "duration": 22600,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "validar nao preenchimento do campos Postal Code",
  "description": "",
  "id": "validar-navegacao-em-um-eccomerce;validar-nao-preenchimento-do-campos-postal-code",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 42,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "realizo login",
  "keyword": "Dado "
});
formatter.step({
  "line": 45,
  "name": "adiciono o produto no carrinho",
  "keyword": "Quando "
});
formatter.step({
  "line": 46,
  "name": "acesso o carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 47,
  "name": "nao informo zip/Postal Code",
  "keyword": "E "
});
formatter.step({
  "line": 48,
  "name": "e apresentada a mensagem \"Error: Postal Code is required\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "EcommerceBuySteps.realizoLogin()"
});
formatter.result({
  "duration": 2229360400,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.adicionoOProdutoNoCarrinho()"
});
formatter.result({
  "duration": 205484101,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.acessoOCarrinho()"
});
formatter.result({
  "duration": 192229499,
  "status": "passed"
});
formatter.match({
  "location": "EcommerceBuySteps.naoInformoZipPostalCode()"
});
formatter.result({
  "duration": 241345501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Error: Postal Code is required",
      "offset": 26
    }
  ],
  "location": "EcommerceBuySteps.eApresentadaAMensagem(String)"
});
formatter.result({
  "duration": 29048900,
  "status": "passed"
});
formatter.after({
  "duration": 1033317899,
  "status": "passed"
});
});