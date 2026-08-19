fun main(){
    print("Enter Number : ")
    val num = readln().toInt()
    println(
        when (num) {
            1 -> "january"
            2 -> "february"
            3 -> "march"
            4 -> "april"
            5 -> "may"
            6 -> "june"
            7 -> "julay"
            8 -> "Augest"
            9 -> "september"
            10 -> "october"
            11 -> "november"
            12 -> "december"
            else -> "please Enter the proper number"
        })
}