class Solution {
    fun numUniqueEmails(emails: Array<String>): Int {
        return emails
            .map { it.split('@') }
            .map { "${it.first().substringBefore("+").replace(".", "")}@${it.last()}" }
            .toSet()
            .size
    }
}