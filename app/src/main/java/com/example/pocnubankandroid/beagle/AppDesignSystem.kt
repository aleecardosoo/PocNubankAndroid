package com.example.pocnubankandroid.beagle

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem
import com.example.pocnubankandroid.R

@BeagleComponent
class AppDesignSystem: DesignSystem() {

    override fun textStyle(id: String): Int? =
        when (id) {
            "name" -> R.style.Name
            "smalltitle" -> R.style.SmallTitle
            "maintext" -> R.style.MainText
            "smallblack" -> R.style.SmallBlack
            "smallgreen" -> R.style.SmallGreen
            "cardText" -> R.style.CardText
            "bigWhite" -> R.style.BigWhite
            else -> super.textStyle(id)
        }

    override fun inputTextStyle(id: String): Int? =
        when (id) {
            "valueInput" -> R.style.ValueInput
            else -> super.inputTextStyle(id)
    }

    override fun buttonStyle(id: String): Int? =
        when (id) {
            "arrowdown" -> R.style.Arrowdown
            "bigButton" -> R.style.BigButton
            else -> super.buttonStyle(id)
        }

    override fun image(id: String): Int? =
        when (id) {
            "logo" -> R.drawable.whitelogo
            "creditcard" -> R.drawable.creditcard
            "carrinho" -> R.drawable.carrinho
            "arrowup" -> R.drawable.arrowup
            "gift" -> R.drawable.gift
            "money" -> R.drawable.money
            "pagamento" -> R.drawable.pagamento
            "poupanca" -> R.drawable.poupanca
            "userconf" -> R.drawable.userconf
            "deposito" -> R.drawable.deposito
            "resgatar" -> R.drawable.resgatar
            "poupar" -> R.drawable.poupar
            "saquecartao" -> R.drawable.saquecartao
            "setadireita" -> R.drawable.setadireita
            "transactionsBlack" -> R.drawable.transactionsblack
            "transactionsWhite" -> R.drawable.transactionswhite

            else -> super.image(id)
        }
}
