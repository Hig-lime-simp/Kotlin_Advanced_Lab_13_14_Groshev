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
fun main() {
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

    println(question1.answer)
    println(question2.answer)
    println(question3.answer)
}