class Solution {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()
        val list = mutableListOf<Int>()
        for (i in nums) {
            map.put(i, map.getOrDefault(i, 0) + 1)
        }
        val sortedMap = map.entries.sortedByDescending{it.value}.associate{it.key to it.value}

        for ((key,value) in sortedMap) {
            if (list.size < k) {
                list.add(key)
            }
        }
   return list.toIntArray()
    }

}


