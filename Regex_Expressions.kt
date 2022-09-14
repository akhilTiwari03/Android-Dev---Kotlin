// Regex Expression
// Regex is generally refers to regular expression which is used to search string or replace on regex object. To use it functionality we need to use Regex(pattern: String) class. Kotlin'sRegex class is found in kotlin.text.regex package.

fun main() {
    val regex = Regex(pattern = "ko")
    val matched = regex.containsMatchIn(input = "ktkolin")
    println(matched)
}