class Produto {
    var preço:Byte? = null
    var quantidade:Byte? = null
    var validade:String? = null
    var estoque:Short? = null

    constructor(
        preço: Byte,
        quantidade: Byte,
        validade: String,
        estoque: Short
    ){
        this.preço = preço
        this.quantidade = quantidade
        this.validade = validade
        this.estoque = estoque
    }
}