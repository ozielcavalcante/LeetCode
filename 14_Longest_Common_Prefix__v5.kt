fun longestCommonPrefix(vararg words: String) =
    (1 .. words.minOf { it.length })
        .fold("") {res, i -> res + if (words.all { it.subSequence(0, i) == words[0].subSequence(0, i) }) words[0][i-1] else "" }
