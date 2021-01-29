data class Text(
    var text: String = "Hello World!!"
)
/**
 * class MM : Serialize { }
 * */
fun main(args: Array<String>) {
    val message : Text? = Text("Hello Hello Jin") // message 가 null 이면 null 처리
                                // type에 ?를 붙임으로서 null이 가능한 변수임을 명시적으로 표현

    var m = when (message) {
        null -> 5
        else -> 0
    }
    println(m)

    m = if (message == null) {
        5
    } else {
        0
    }

    println(m)

    println(message?.text)  // NullSafe

    message?.let {
        println("Message : ${it.text}")
    }

}
