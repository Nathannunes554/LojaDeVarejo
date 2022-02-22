class Cliente {
    var nome:String? = null
    var cpf:String? = null
    var telefone:String? = null

    constructor(
        nome: String,
        cpf: String,
        telefone: String
    ){
        this.nome = nome
        this.cpf = cpf
        this.telefone = telefone
    }
}