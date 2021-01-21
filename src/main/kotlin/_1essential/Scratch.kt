
fun main() {
    functionWithUnusedParameter("first", "second")
    functionWithUnusedParameter("used", "unused")
    intentionExample()
}

fun functionWithUnusedParameter(used: String, /*caret*/redundant: String) {
    println("It is used parameter: $used")
}

fun intentionExample(): String {
    /*caret*/return "Hello!"
}
