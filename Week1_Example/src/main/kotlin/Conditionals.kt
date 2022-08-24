fun main(){
    //if/else
    val numberOfCups = 30
    val numberOfPlates = 50

    if (numberOfCups > numberOfPlates){
        println("Too many cups!")
    }else{
        println("Not enougt cups! ")
    }

    //Ranges
    val numberOfStudent = 50
    if(numberOfStudent in 1..50)
        println(numberOfStudent)     //çıktı 50 (1 ve 50 dahil)

    //when
    val result1 = 50
    when(result1){
        0 -> println("0")
        in 1..30-> println("1-30 range")
        else -> println("else")
    }

    val result2 = false
    when(result2){
        true -> println("true")
        else -> println("false")
    }

    //loops
    val pets = arrayOf("dog","cat","bird")
    for (item in pets){
        println(item)
    }

    for ((index,item) in pets.withIndex()){
        println("item = $item, index = $index")
    }

    for(i in 1..5) print(i)     //çıktı 12345
    println()
    for(i in 5 downTo 1) print(i)   //çıktı 54321
    println()
    for (i in 3..6 step 2) println(i)   //çıktı 3  5
    println()
    for(i in 'a'..'d') print(i)     //çıktı abcd
    println()

    // while
    var count1 = 0
    while (count1 < 20) {
        count1++
    }
    println(count1)      //çıktı 20

    //do while

    var count2 = 0
    while (count2 < 20){
        count2++
    }
    println(count2)     //çıktı 20
    do {
        count2--
    }while (count2 > 0)
    println("$count2")      //çıktı 0

    //repeat
    repeat(3){
        print("test")   //çıktı testtesttest
    }

}