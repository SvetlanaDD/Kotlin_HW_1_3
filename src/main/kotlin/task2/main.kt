package task2

fun main () {
    val cardType = "Мир"
    val totalTransfer = 0
    val amountTransfer = 5000 * 100 // переводим в копейки
    println("Комиссия за перевод ${feeMoneyTransfer(cardType, totalTransfer, amountTransfer) / 100} руб " +
            "${feeMoneyTransfer(cardType, totalTransfer, amountTransfer) % 100} коп")
}

fun feeMoneyTransfer (cardType: String = "Vk Pay", totalTransfer: Int = 0, amountTransfer: Int): Int{
    when (cardType){
        "Visa", "Мир" -> return if (amountTransfer * 0.0075 < 3500) 3500 else {(amountTransfer * 0.0075).toInt()}
        "Mastercard", "Maestro" -> return if (totalTransfer > 75000) {(amountTransfer * 0.006 + 20).toInt()} else 0
        else -> return 0
    }
}