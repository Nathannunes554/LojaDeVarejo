fun main(){
    val vendedor = Vendedor("nathan nunes", 19,"rua banana quadrada","635.725.825-91", "51993040670")
    vendedor.nome
    vendedor.idade
    vendedor.endereço
    vendedor.cpf
    vendedor.telefoneComercial
    println("nome: ${vendedor.nome}\n idade: ${vendedor.idade}\n endereço:${vendedor.endereço}\n cpf:${vendedor.cpf}\n telefoneComercial:${vendedor.telefoneComercial}")

    val cliente = Cliente("fernando de noronha", "784.476.534.02", "51987638268")
    cliente.nome
    cliente.cpf
    cliente.telefone
    println("nome: ${cliente.nome}\n cpf: ${cliente.cpf}\n telefone ${cliente.telefone}")

    val fornecedor = Fornecedor("menino ney", "rua bananas de pijama 666", "51998763492", 250)
    fornecedor.nome
    fornecedor.endereço
    fornecedor.telefonecomercial
    fornecedor.preço
    println(
        "nome: ${fornecedor.nome}\n endereço: ${fornecedor.endereço}\n telefone: ${fornecedor.telefonecomercial}\n preço: ${fornecedor.preço}")

    val produto = Produto(100, 1, "02042030", 650,)
    produto.preço
    produto.quantidade
    produto.validade
    produto.estoque
    println("preço: ${produto.preço}\n quantidade: ${produto.quantidade}\n validade: ${produto.validade}\n estoque: ${produto.estoque}")

    val transportadora = Transportadora("trans phil spencer", 50, 500, "rua de rico")
    transportadora.nome
    transportadora.frete
    transportadora.quantidade
    transportadora.endereço
    println("nome: ${transportadora.nome}\n frete: ${transportadora.frete}\n quantidade: ${transportadora.quantidade}\n endereço: ${transportadora.endereço}")

    val venda = Venda(100, 94, 1)
    venda.preço
    venda.tributos
    venda.quantidade
    println("preço: ${venda.preço}, tributos: ${venda.tributos}, quantidade: ${venda.quantidade}")
}