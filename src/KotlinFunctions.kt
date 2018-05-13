/**
 * Created by David Raj Paul on 13-05-2018.
 */
fun main(args: Array<String>) {
    simpleFunc()
    funcWithParam("David", 25)
    funcWithNamedParam(age = 25, name = "David")
    funcWithReturnType(5, 7)
    singleExpressionFunctions("David Raj", 25)
}

fun simpleFunc() {
    println("fun simpleFunc() ==> This is a No Parameter function")
}

fun funcWithParam(name: String, age: Int) {
    println("fun funcWithArgs(name:String,age:Int) ==> Parameter function : Output Name $name , Age $age")
}

fun funcWithNamedParam(name: String, age: Int) {
    println("fun funcWithArgs(name:String,age:Int) ==> Named Parameter function. No need for following the same order" +
            "The Args can be passed based on the names : Output Name $name , Age $age")
}

fun funcWithReturnType(a: Int, b: Int): Int {
    val result: Int = a + b
    println("fun funcWithReturnType(a: Int, b: Int) ==> Function with return type. Returns $result")
    return result
}

fun singleExpressionFunctions(name: String, age: Int) = print("fun singleExpressionFunctions(name: String,age: Int) ==> Single expression. Returns Name : $name Age : $age")

