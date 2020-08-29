import kotlin.system.exitProcess

fun main(args: Array<String>) {

    print("Wpisz liczbę sekund: ")
    var getData:String = readLine().toString()
    var secounds:Int

    try {
         secounds = getData.toInt();
    } catch (e: NumberFormatException ) {
        println("Błędne dane")
        exitProcess(0);
    }

    for(i in secounds downTo 0) {
        println(i)
        Thread.sleep(1000)
    }


}