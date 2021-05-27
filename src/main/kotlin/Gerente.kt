class Gerente(
    nome: String,
    salario: Double,
    cpf: String,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

    override val bonificacao: Double
        get() {
            return salario * 0.3
        }
}