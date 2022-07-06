package task1

fun main () {
    val amountSeconds = 87000
    println("Был(а) в сети ${agoToText(amountSeconds)}")
}
fun agoToText (amountSeconds: Int): String {
    return when (amountSeconds){
        in (0 .. 60) -> "только что"
        in (61 .. 60*60) -> "${amountSeconds/60} ${stringMinutes(amountSeconds)} назад"
        in (60*60+1 .. 60*60*24) -> "${amountSeconds/(60*60)} ${stringHours(amountSeconds)} назад"
        in (60*60*24+1 .. 60*60*24*2) -> "сегодня"
        in (60*60*24*2+1 .. 60*60*24*3) -> "вчера"
        else -> "вчера"
    }
}

fun stringMinutes (amountSeconds: Int): String {
    if (amountSeconds/60 % 100 in 11..14) return "минут"
    if (amountSeconds/60 % 10 == 1) return "минуту"
    if (amountSeconds/60 % 10 in 2..4) return "минуты"
    else return "минут"
}

fun stringHours (amountSeconds: Int): String {
    if (amountSeconds/120 % 100 in 11..14) return "часов"
    if (amountSeconds/120 % 10 == 1) return "час"
    if (amountSeconds/120 % 10 in 2..4) return "часа"
    else return "часов"
}
