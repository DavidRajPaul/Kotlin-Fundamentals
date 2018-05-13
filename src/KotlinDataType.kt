/**
 * Created by David Raj Paul on 13-05-2018.
 */

/**
 * Kotlin has two data types
 *
 * var - Read & write (Mutable)
 * val - Read (Immutable) - constant
 */
fun main(args: Array<String>) {
    val a = "My Name is"
    val b = "David"
//    b="Raj" will throw CT error
    val c = 25

    val d: String = "I was born on June"//The type is inferred(assigned by default) if not specified

    val e: Int = 7

    var f: Any = "I love"
    f = "I love learning new things."// can be re initialized

    print("$a $b. I am $c $d $e $f")
}