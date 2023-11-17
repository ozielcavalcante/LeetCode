class Solution {
    fun makeEqual(words: Array<String>) =
        words
            .joinToString("")
            .groupingBy { it }
            .eachCount()
            .all { it.value % words.size == 0 }
}
