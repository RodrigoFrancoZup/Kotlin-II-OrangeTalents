open class Funcionario(
    var nome: String,
    var salario: Double,
    var cpf: String
) {
    open val bonificacao: Double get() =  salario * 0.10



}