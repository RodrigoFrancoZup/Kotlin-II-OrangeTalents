class Funcionario(
    var nome: String,
    var salario: Double,
    var cpf: String
) {
    fun bonificacao(): Double {
        return salario * 0.10
    }


}