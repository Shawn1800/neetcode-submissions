class Solution {
       fun twoSum(numbers: IntArray, target: Int): IntArray {
         var count0 = 0
         var count1 = numbers.size-1
         val arr = mutableListOf<Int>()
         while (count0<count1) {
             if (numbers[count0]+numbers[count1]>target) {
                 count1--
             }
             else if (numbers[count0]+numbers[count1]<target) {
                 count0++
             }
             else {
                 return intArrayOf(count0+1,count1+1)

             }
         }

         return intArrayOf()
     }
}
