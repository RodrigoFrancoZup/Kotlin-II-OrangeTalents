class Gerente(
    var nome: String,
    var salario: Double,
    var cpf: String,
    var senha: Int
){
    fun bonificacao(): Double {
        return salario * 0.10
    }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}