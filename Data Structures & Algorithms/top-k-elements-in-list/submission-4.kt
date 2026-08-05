class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()
        val newArr = mutableListOf<Int>()
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        val bucket = Array(nums.size + 1) {
            mutableListOf<Int>()
        }

        var index = 0
        val result = IntArray(k)

        for (i in map) {
            val key = i.key
            val value = i.value
            bucket[value].add(key)
        }
        
        for (i in bucket.size - 1 downTo 0) {
            if (bucket.isNotEmpty()) {
                for (j in bucket[i]) {
                    result[index] = j
                    index++
                    if (index == k) {
                        return result
                    }
                }
            }
        }
        return result
    }
}


