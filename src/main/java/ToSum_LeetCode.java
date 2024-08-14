import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ToSum_LeetCode {
//nums = [2,7,11,15], target = 9
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 1, 2}, 3)));//CHECKED
    }

    public static int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
             if (hashMap.containsKey(target - nums[i]) && i != hashMap.get(target - nums[i])) {
                 return new int[]{i,hashMap.get(target - nums[i])};
             }
            hashMap.put(nums[i],i);
        }

       return null;
    }

}

