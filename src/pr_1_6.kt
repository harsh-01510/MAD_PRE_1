fun main(){
    print("Enter the First Number:")
    var n1 = readln().toInt()

    print("Enter the Second Number:")
    var n2 = readln().toInt()

    println("Add of two number ="+addition(n1,n2) )
    println("sub of two number ="+subtraction(n1,n2) )
    println("multiplication of two number ="+multiplication(n1,n2) )
    println("division of two number ="+division(n1,n2) )

}

fun addition(n1: Int, n2: Int) : Int { return n1 + n2}
fun multiplication(n1: Int, n2: Int) : Int { return n1 * n2}
fun division(n1: Int, n2: Int) : Int { return n1/n2}
fun subtraction(n1: Int, n2: Int) : Int { return n1 - n2}