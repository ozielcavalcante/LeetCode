fun longestCommonPrefix(vararg words: String): String {
    return with(words) {
        (0 until words.minOf { it.length })
        .map { i -> map { it[i] }.distinct() }
        .takeWhile { it.size == 1 }
        .flatten()
        .joinToString("")
    }
}
