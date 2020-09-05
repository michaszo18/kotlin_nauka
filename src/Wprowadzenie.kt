import kotlin.random.Random
import kotlin.reflect.typeOf

fun main(args: Array<String>) {

    var dna:String = "ATTGC" //TAACG
    var output:String = ""

    val DNAValMap = mapOf(
        'A' to 'T',
        'T' to 'A',
        'C' to 'G',
        'G' to 'C'
    )

    for (i:Char in dna.toCharArray()) {
        output += DNAValMap.get(i).toString()
    }

    println(output)
}

