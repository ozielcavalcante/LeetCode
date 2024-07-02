fun longestCommonPrefix(vararg words: String): String {
    var count = 0
    var res = ""
    while (true) {
        words.forEach { if (it.length == count || it[count] != words[0][count]) return res }
        res += words[0][count]
        count++
    }
}
