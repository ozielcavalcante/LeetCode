fun longestCommonPrefix(vararg words: String): String {
    var res = ""
    for (i in 0 until words.minOf { it.length }) {
        if (words.any { it[i] != words[0][i] }) break
        res += words[0][i]
    }
    return res
}
