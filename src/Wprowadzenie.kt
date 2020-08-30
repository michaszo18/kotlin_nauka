import kotlin.random.Random

fun main(args: Array<String>) {
    var s: String = "New"
    var newS: String
    val arr: MutableList<String> = ArrayList()
    var order: IntArray

    var factorial = factorial(s.length)

    while (arr.size < factorial) {
        order = getRandomIntArrayWithoutReplication(s.length).toIntArray()
        newS = ""

        for (j in order) {
            newS += s.get(j)
        }

        if (!arr.contains(newS)) {
            arr.add(newS)
        }

    }
    println(arr.size)
    println(arr)
}


fun getRandomIntArrayWithoutReplication(end: Int): List<Int> {

    var rand: Int
    val arr: MutableList<Int> = ArrayList()

    while (arr.size != end) {
        rand = Random.nextInt(0, end)
        if (!arr.contains(rand)) {
            arr.add(rand)
        }
    }
    return arr;
}

fun factorial(num:Int): Int {

    var factorial: Int = 1
    for (i in 1..num) {
        factorial *= i
    }

    return factorial;
}