class Fornecedor {
    var nome: String? = null
    var endereço:String? = null
    var telefonecomercial:String? = null
    var preço:Short? = null

    constructor(
        nome: String,
        endereço: String,
        telefoneComercial: String,
        preço:Short
    ){
        this.nome = nome
        this.endereço = endereço
        this.telefonecomercial = telefonecomercial
        this.preço = preço
    }
}