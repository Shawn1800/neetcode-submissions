class Solution {
        fun isPalindrome(s: String): Boolean {
      val t = s.replace(" ","").replace(Regex("[^A-Za-z0-9]"),"").lowercase()
        var count0 =0
        var count1 = t.length-1

        while (count0<count1) {
            if (t[count0]!=t[count1]) {
               return false
            }
            count0++
            count1--
        }

        return true
    }
}


