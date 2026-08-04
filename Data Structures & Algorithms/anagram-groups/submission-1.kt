class Solution {
      fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String,MutableList<String>>()
        for (i in strs) {

            val key = i.toCharArray().sorted().joinToString()
            if (!map.containsKey(key)) {
                map[key]= mutableListOf()
            }
            map[key]!!.add(i)
        }
return map.values.toList()
    }
}
