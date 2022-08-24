fun main(){

    // ?

    var inst1: Int? = null
    println(inst1)      //çıktı null

    var number: Int? = null
    number = number?.dec()
    println(number)     //çıktı null

    var number3: Int? = 6
    var number4: Int = 4
    number3 = number3?.let {
        number4 = number4.dec()
        it.dec() }
    println(number4)    //çıktı 3

    // !!

   // var text: String? = null
   // println(text!!.length)  //hata verir

    //Elvis Operator

    var text: String? = null
    println(text ?: "null value")   //çıktı null value

}