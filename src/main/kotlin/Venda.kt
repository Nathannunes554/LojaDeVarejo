class Venda {
    var preço:Byte? = null
    var tributos:Byte? = null
    var quantidade: Byte? = null

    constructor(
        preço: Byte,
        tributos: Byte,
        quantidade: Byte
    ){
        this.preço = preço
        this.tributos = tributos
        this.quantidade = quantidade
    }
}