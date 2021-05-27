class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
   numero = numero
) {

    override fun saca(valor: Double) {
        var valorComTaxa = valor + 0.10
        super.saca(valorComTaxa)
    }
}