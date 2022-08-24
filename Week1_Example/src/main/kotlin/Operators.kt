fun main(){
    val toplama = 1+1
    var cikartma = 53-3
    var carpma = 5*10
    var bolme = 50/10
    var kalan = 10%3

    println("toplama :" + toplama)       //kotlin.Int
    println("Çıkartma : " + cikartma)   //kotlin.Int
    println("Çarpma : " + carpma)       //kotlin.Int
    println("Bölme : " + bolme)
    println("Kalan : " + kalan)

    var mathResult1 = 1.0/2.0           //Kotlin.Double
    println("1.0/2.0 = " + mathResult1 )

    var mathResult2 = 1.5*2.0
    println("1.5*2.0 = " + mathResult2 )    //kotlin.Double

    //primitive methods

    var mathResult3 = 2.plus(3)
    println("toplama : " +mathResult3)

    var mathResult4 = 2.times(4)
    println("çarpma : " + mathResult4)

    var mathResult5 = 2.div(3)
    println("Bölme :" + mathResult5)  //değer integer olduğundan 0 çıkar

    var mathResult6 = 2.0.div(3)
    println("Bölme : " + mathResult6)  //değer double olduğundan küsürat çıkar

    var mathResult7 = 0.2.plus(0.1)    //özel değer
    println(mathResult7)


}