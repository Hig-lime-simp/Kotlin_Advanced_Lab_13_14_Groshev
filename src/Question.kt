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
class  Quiz{
    companion object StudentProgress{
        var total: Int = 10
        var answered: Int = 3
    }

    val question1 = Question<String>(
        questionText = "Речка спятила с ума – По домам пошла сама. ___",
        answer = "водопровод",
        Diffecilty.MEDIUM
    )

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
val Quiz.StudentProgress.progressText: String
    get() = "$answered of $total answered"

fun Quiz.StudentProgress.printProgressBar(){
    repeat(Quiz.answered) {print("▓")}
    repeat(times = Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}
fun main() {
//    println(Quiz.progressText)
//    println("${Quiz.answered} of ${Quiz.total} answered")
    Quiz.printProgressBar()
}