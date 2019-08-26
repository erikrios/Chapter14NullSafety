fun main() {
    val a: List<Int?> = listOf(1, 2, 3, null)
    val b: List<Int> = a.filterNotNull()

    println(a.toString())
    println(b.toString())
}