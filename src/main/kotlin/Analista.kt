class Analista(
    nome: String,
    salario: Double,
    cpf: String
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario *0.1
        }
}