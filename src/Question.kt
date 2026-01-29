data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Diffecilty
){

}
enum class Diffecilty{
    EASY,
    MEDIUM,
    HARD
}
interface ProgressPrintable{
    val progressText: String
    fun printProgressBar()
}
class  Quiz: ProgressPrintable{
    companion object StudentProgress{
        var total: Int = 10
        var answered: Int = 3
    }
    override val progressText: String
        get() = "$answered of $total answered"
    val question1 = Question<String>(
        questionText = "Речка спятила с ума – По домам пошла сама. ___",
        answer = "водопровод",
        Diffecilty.MEDIUM
    )
    override fun printProgressBar() {
        repeat(times = answered) { print("▓") }
        repeat(times = total - answered) { print("▒") }
        println()
        println(progressText)
    }
    val question2 = Question<Boolean>(
        questionText = "Небо зелёное. Правда или ложь",
        answer = false,
        Diffecilty.EASY
    )

    val question3 = Question<Int>(
        questionText = "Сколько дней между полнолуниями?",
        answer = 28,
        Diffecilty.HARD
    )
}
}
fun main() {
//    println(Quiz.progressText)
//    println("${Quiz.answered} of ${Quiz.total} answered")
    Quiz().printProgressBar()
}