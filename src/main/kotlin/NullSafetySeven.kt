fun main() {
    val string: String? = "Hello, World!"
//    println(string.length) // Compile error: Can't directly access property of nullable type
    println(string?.length) // Will print the string's length, or "null" if the string is null
}