class Vendedor {
    var nome:String? = null
    var idade:Byte? = null
    var endereço:String? = null
    var cpf:String? = null
    var telefoneComercial:String? = null

    constructor(
        nome: String,
        idade: Byte,
        endereço: String,
        cpf: String,
        telefoneComercial: String,

        ){
        this.nome = nome
        this.idade = idade
        this.endereço = endereço
        this.cpf = cpf
        this.telefoneComercial = telefoneComercial
    }
}