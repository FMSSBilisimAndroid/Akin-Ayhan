fun main(){
    var a:Int = 127
    var b:Byte = a.toByte()  //byte 127 ye kadar çevirir
    println(b)  //çıktı 127

    var c:Int = b.toInt()
    println(c)  //çıktı 127

    var d:Double = c.toDouble()
    println(d)  //çıktı 127.0

    var e:Any = c.toDouble()
    e = c.toInt()
    println(e)  //çıktı 127

    var f:String = "2"
    var g = f.toInt()
    println(g)  //çıktı 2

    var h:Char = '2'
    var j = h.toInt()
    println(j)   //çıktı 50 olur ASCII değerini verir

    val s1 = "Test"
    println(s1)

    val s2 = "Test\nDeneme"
    println(s2)     //alt satıra geçer

    val s3 = "Test\" Deneme"
    println(s3)     //özel karakter kullanımı

    val s4 = "buy \$a100"
    println(s4)     //özel karakter kullanımı

    val s5 = "buy $100"
    println(s5)     //özel karakter kullanmasakta rakam yanına yazılabilir

    val s6 = """
    |satır1
        |satır2
    |satır3
    """
    println(s6)     //kod ekranında nasıl görülüyor ise aynı çıktıyı verir

    val numberOfDogs = 3
    val numberOfCats = 2
    println("I have $numberOfDogs dogs and $numberOfCats cats.")

    val i = 10
    println("i = $i")     //çıktı i = 10

    val str = "Test"
    println("${str.length}")    //çıktı 4 (string uzunluğu)

    val k = 1
    println("${k.plus(1)}")     //çıktı 2

}