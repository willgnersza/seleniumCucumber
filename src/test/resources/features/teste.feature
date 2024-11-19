#language: pt

    Funcionalidade: Validar navegacao em um eccomerce
        @run
        Cenario: validar login
            Dado que abro o navegador
            Quando acesso a pagina do ecommerce
            Entao a pagina é aberta corretamente

        @run
        Cenario: validar compra
            Dado realizo login
            Quando adiciono o produto no carrinho
            E acesso o carrinho
            E realizo o checkout
            E confirmo os dados em Checkout Overview
            Entao a compra e finalizada corretamente

        @run
        Cenario: validar remocao do produto do carrinho
            Dado realizo login
            Quando adiciono o produto no carrinho
            E removo o produto do carrinho
            Entao o produto nao esta mais disponivel no carrinho

        @run
        Cenario: validar nao preenchimento do campos last name
            Dado realizo login
            Quando adiciono o produto no carrinho
            E acesso o carrinho
            E nao informo first name
            Entao e apresentada a mensagem "Error: First Name is required"

        @run
        Cenario: validar nao preenchimento do campos first name
            Dado realizo login
            Quando adiciono o produto no carrinho
            E acesso o carrinho
            E nao informo last name
            Entao e apresentada a mensagem "Error: Last Name is required"

        @run
        Cenario: validar nao preenchimento do campos Postal Code
            Dado realizo login
            Quando adiciono o produto no carrinho
            E acesso o carrinho
            E nao informo zip/Postal Code
            Entao e apresentada a mensagem "Error: Postal Code is required"
