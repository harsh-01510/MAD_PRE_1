fun main() {
    print("Enter the number: ")
    val n = readln().toInt()

    print("factorial $n is  :  "+ factorial(n))

}

fun factorial(n: Int): Int {
    if (n == 0 || n == 1) return 1
    else return n * factorial(n - 1)
}