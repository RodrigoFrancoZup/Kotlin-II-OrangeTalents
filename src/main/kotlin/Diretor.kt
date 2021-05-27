class Diretor(
    nome: String,
    salario: Double,
    cpf: String,
    val senha: Int,
    val prl: Double
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
            return super.bonificacao + salario + prl
        }


}