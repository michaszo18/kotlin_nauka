fun main(args: Array<String>) {


        var num: Any = 'c'

        when (num) {
            is Int -> println("Int")
            is String -> println("String")
            is Double -> println("Double")
            is Long -> println("Long")
            is Char -> println("Char")
        }
}

fun getData(message: String): String {
    println(message)
    print("> ")
    return readLine().toString()
}

fun multiply(x: Double, y: Double): Double {
    return x * y
}