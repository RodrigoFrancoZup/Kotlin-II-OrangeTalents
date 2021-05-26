class Conta(var titular: String, var numero: Int){
     var saldo = 0.0
         private set

    /* --Construtor Secundário

    constructor(titular: String, numero: Int){
        this.titular = titular
        this.numero = numero
    }
    */


    /*
    - Caso eu quisesse colocar uma regra de négocio, no set padrao da propertie saldo:
    - valor é de fato o valor que eu estou passando para a propertie
    - field é de fato a atribuição do valor para a propertie, é ele que injeta o valor!
        var saldo = 0.0
        set(valor){
            if(valor > 1000){
                field = valor
            }
        }
     */

    fun deposita(valor: Double){
        if(valor > 0){
            this.saldo += valor
        }
    }

    fun saca(valor: Double){
        if(this.saldo >= valor){
            this.saldo -= valor
        }else{
            println("Saldo insuficiente!")
        }
    }

    fun transfere(valor: Double, destino: Conta) : Boolean{
        if(this.saldo >= valor){
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
            return false
    }
/*
    -- Não usamos getter e setter em Kotlin
    fun getSaldo() : Double{
        return this.saldo
    }

    fun getTitular() : String{
        return this.titular
    }

    fun getNumero() : Int{
        return this.numero
    }

    fun setSaldo(saldo: Double){
        this.saldo = saldo
    }

    fun setTitular(titular: String){
        this.titular = titular
    }

    fun setNumero(numero: Int){
        this.numero = numero
    }

 */
}