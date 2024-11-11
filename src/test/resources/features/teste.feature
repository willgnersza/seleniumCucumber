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