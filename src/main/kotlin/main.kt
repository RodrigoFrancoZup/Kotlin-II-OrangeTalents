fun main() {
    println("Bem vindo ao Bytebank!");

    val rodrigo = Funcionario(
        nome = "Rodrigo",
        salario = 2500.00,
        cpf = "111.111.111-11"
    )

    val fran = Gerente(
        nome = "Fran",
        salario = 5500.00,
        cpf = "222.222.222-22",
        senha = 1234
    )

    println("Nome: ${rodrigo.nome}")
    println("Salario: ${rodrigo.salario}")
    println("CPF: ${rodrigo.cpf}")
    println("Bonificação ${rodrigo.bonificacao()}")

    println()

    println("Nome: ${fran.nome}")
    println("Salario: ${fran.salario}")
    println("CPF: ${fran.cpf}")
    println("Bonificação ${fran.bonificacao()}")
   if(fran.autentica(1234)){
       println("Sim, autenticou")
   }else{
       println("Senha incorreta!")
   }
}









