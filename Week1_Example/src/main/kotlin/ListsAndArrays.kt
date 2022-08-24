import java.util.*
import kotlin.collections.ArrayList

fun main(){
    //Immutable list using listOf()
    var inst1 = listOf("trumpet","piano","violin")
    println(inst1)      //çıktı [trumpet, piano, violin]
    var inst2 = listOf("TTT","piano","violin")
    inst1 =  inst2
    println(inst2)      //çıktı [TTT, piano, violin]


    //Mutable list using mu
    var inst3 = mutableListOf("trumpet","piano","violin")
    inst3.set(0,"test")
    println(inst3)      //çıktı [test, piano, violin]
    inst3.removeAt(0)
    println(inst3)      //çıktı [piano, violin]
    inst3.remove("piano")
    println(inst3)      //çıktı [violin]

    //Array using arrayOf()
    var inst4 = arrayOf("trumpet","piano","violin")
    println(inst4)      //çıktı [Ljava.lang.String;@4edde6e5  (obje değeri)

    var inst5:ArrayList<String> = ArrayList()
    inst5 = arrayListOf("trumpet","piano","violin")
    println(inst5)      //çıktı [trumpet, piano, violin]

    var inst6:Array<String> = arrayOf("trumpet","piano","violin")
    println(inst6)      //çıktı [Ljava.lang.String;@70177ecd
    println(Arrays.toString(inst6))     //çıktı [trumpet, piano, violin]

    var inst7 = arrayOf("trumpet",4,4.7)
    println(Arrays.toString(inst7))     //çıktı [trumpet, 4, 4.7]

    var arrayInt = intArrayOf(1,3,4)
    println(Arrays.toString(arrayInt))      //çıktı [1, 3, 4]

    val numbers1 = intArrayOf(1,2,3)
    val numbers2 = intArrayOf(4,5,6)
    val combined = numbers1+numbers2
    println(Arrays.toString(combined))
}