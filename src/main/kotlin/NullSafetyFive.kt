fun main() {
    val string: String = "Hello, World"
    var nullableString: String? = null
//    string = nullableString // Compiler error: Can't assign nullable to non-nullable type
    nullableString = string

    println(nullableString)
}