package task2

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun feeMoneyTransferVkpay() {
        val cardType = "Vk Pay"
        val totalTransfer = 0
        val amountTransfer = 100

        val result = task2.feeMoneyTransfer(cardType, totalTransfer, amountTransfer)

        assertEquals(0, result)
    }

    @Test
    fun feeMoneyTransferVisaLow() {
        val cardType = "Visa"
        val totalTransfer = 0
        val amountTransfer = 1000 * 100

        val result = task2.feeMoneyTransfer(cardType, totalTransfer, amountTransfer)

        assertEquals(3500, result)
    }

    @Test
    fun feeMoneyTransferVisaHigh() {
        val cardType = "Visa"
        val totalTransfer = 0
        val amountTransfer = 10000 * 100

        val result = task2.feeMoneyTransfer(cardType, totalTransfer, amountTransfer)

        assertEquals(7500, result)
    }

    @Test
    fun feeMoneyTransferMastercardLow() {
        val cardType = "Mastercard"
        val totalTransfer = 12000 * 100
        val amountTransfer = 10000 * 100

        val result = task2.feeMoneyTransfer(cardType, totalTransfer, amountTransfer)

        assertEquals(0, result)
    }

    @Test
    fun feeMoneyTransferMastercardHigh() {
        val cardType = "Mastercard"
        val totalTransfer = 76000 * 100
        val amountTransfer = 1000 * 100

        val result = task2.feeMoneyTransfer(cardType, totalTransfer, amountTransfer)

        assertEquals(0, result)
    }
}