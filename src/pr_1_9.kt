fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    var max=0
    println("The array is ${array1.contentToString()}")
    for (j in 0 until 5){
        if (max <= array1[j]){
            max = array1[j]
        }
    }
    println("the max number is $max")
}