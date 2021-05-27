abstract class FuncionarioAdministrador(
     nome: String,
     salario: Double,
     cpf: String,
    val senha: Int
) : Funcionario(
    nome = nome,
    salario = salario,
    cpf = cpf
){


    fun autentica(senha: Int):Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }

}