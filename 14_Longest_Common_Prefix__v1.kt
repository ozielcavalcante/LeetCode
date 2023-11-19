fun longestCommonPrefix(vararg strs: String): String {
    var count = 0
    var res = ""
    while (true) {
        strs.forEach { if (it.length == count || it[count] != strs[0][count]) return res }
        res += strs[0][count]
        count++
    }
}
