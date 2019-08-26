fun main() {
    val a: String? = "Nullable String Value"

    val b: Int = if (a != null) a.length else -1

    val c = a?.length ?: -1

    println(a)
    println(b)
    println(c)
}