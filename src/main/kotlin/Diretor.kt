class Diretor(
    nome: String,
    salario: Double,
    cpf: String,
    senha: Int,
    val prl: Double
) : FuncionarioAdministrador(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override val bonificacao: Double get() =  this.salario * 0.3


}