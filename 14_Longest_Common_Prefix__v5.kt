fun longestCommonPrefix(vararg words: String) =
    (0 until words.minOf { it.length })
        .fold("") {res, i -> res + if (words.all { it[i] == words[0][i] }) words[0][i] else "" }
