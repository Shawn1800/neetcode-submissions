class Solution {
  fun productExceptSelf(nums: IntArray): IntArray {
    val res = IntArray(nums.size)
    var product = 1
    for (i in 0 until nums.size) {
        product = 1
        for (j in 0 until nums.size) {
            if (i == j) continue
                product *= nums[j]

        }
        res[i] = product
    }

    return res
}
}
