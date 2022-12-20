fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    var name: String = "Anat"
    println("Hello $name How are you?")
    println("Hello \name How are you?")

    var a: Int = 1
    var b: Int = 2

    println("a + b = ${a + b}")

    val userKotlin = UserKotlin("anat@gmail.com")
    println("UserKotlin ${userKotlin.email}")

}