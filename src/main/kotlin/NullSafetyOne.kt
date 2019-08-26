fun main() {
    val string: String? = "Hello!"
//    print(string.length) Compiler error
    if (string != null) {
        print(string.length)
    }
}