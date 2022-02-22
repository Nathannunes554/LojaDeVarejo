class Transportadora {
    var nome:String? = null
    var frete:Byte? = null
    var quantidade:Short? = null
    var endereço:String? = null

    constructor(
        nome: String,
        frete: Byte,
        quantidade: Short,
        emdereço: String
    ){
        this.nome = nome
        this.frete = frete
        this.quantidade = quantidade
        this.endereço = endereço
    }
}