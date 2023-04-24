import java.util.HashMap

class Solution {
//    fun solution(phone_book: Array<String>): Boolean {
//        val sortedPhoneBook = phone_book.sorted()
//        for (i in 0 until sortedPhoneBook.size - 1) {
//            if (sortedPhoneBook[i + 1].startsWith(sortedPhoneBook[i])) {
//                return false
//            }
//        }
//        return true
//    }


    fun solution(phone_book: Array<String>): Boolean {
        val hashMap = HashMap<String, Boolean>()
        phone_book.forEach { hashMap[it] = true }
        return phone_book.none { phoneNumber ->
            (1 until phoneNumber.length).any{
                hashMap.containsKey(phoneNumber.substring(0,it))
            }
        }
    }
}