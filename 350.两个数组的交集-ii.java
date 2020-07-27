import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<String,Integer> map =new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            String key = String.valueOf(nums1[i]);
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            } else{
                map.put(key, 1);
            }
        }
        List<Integer> list=new ArrayList<>();
        int k = 0;
        for (int i = 0; i < nums2.length; i++) {
            String key = String.valueOf(nums2[i]);
            if(map.getOrDefault(key,0)>0){
                map.put(key, map.get(key)-1);
                list.add(nums2[i]) ;
                k++;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
// @lc code=end

