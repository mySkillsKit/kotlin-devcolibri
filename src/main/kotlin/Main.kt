fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    var name: String = "Anat"
    println("Hello $name How are you?")
    println("Hello \$name How are you?")

    var a: Int = 1
    var b: Int = 2

    println("a + b = ${a + b}")

    val userKotlin = UserKotlin("anat@gmail.com")
    println("UserKotlin ${userKotlin.email}")
    var a1: String = "123"
    var a6: Byte = 12 //8 bit
    var a0: Short = 11 //16 bit
    var a2: Int = 123  //32 bit
    var a3: Long = 123L //64 bit
    var a4: Double = 1.1  //64 bit
    var a5: Float = 1.33F //32 bit

    var b1: Long = a2.toLong()

    var c1: Char = 'a'
    var bool: Boolean = true

    val result = myFirstFunction4(2, 3.2)
    println("result = $result")

    val str: String = "hello"
    val size = str.length
    println(size)
//null
    val str2: String?
    str2 = getStr()
    val size2 = str2!!.length
    println(size2)

}

fun getStr(): String? {
    return null
}

fun myFirstFunction(): Int {
    return 4
}

fun myFirstFunction2(abc: Long): Int {
    return abc.toInt()
}

fun myFirstFunction3() {
}

fun myFirstFunction4(a: Long, b: Double) = a + b