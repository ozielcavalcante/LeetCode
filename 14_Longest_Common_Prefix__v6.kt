fun longestCommonPrefix(vararg words: String) = words.reduce { acc, s -> acc.commonPrefixWith(s) }
