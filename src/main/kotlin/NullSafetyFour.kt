fun main() {
    val data = Data()
    data.name = "Erik"
    val value: String = data?.first() ?: "Nothing here"
}

