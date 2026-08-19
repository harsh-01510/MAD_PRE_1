fun main(){
    print("Enter the number :")
    val number = readln().toInt()

    println(
        if ( number % 2 == 0 )
            "EVEN"
        else
            "ODD"
    )
}