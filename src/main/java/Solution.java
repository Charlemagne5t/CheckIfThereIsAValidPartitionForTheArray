import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean validPartition(int[] nums) {
        Map<Integer, Boolean> memo = new HashMap<>();
        return  dfs(nums, 0, memo);
    }
    private boolean dfs(int[] nums, int i, Map<Integer, Boolean> memo){
        if(memo.containsKey(i)){
            return memo.get(i);
        }
        if(i == nums.length){
            return true;
        }

        boolean tryTwo = false;

        if(i < nums.length - 1 && nums[i] == nums[i + 1]){
            tryTwo = dfs(nums, i + 2, memo);
        }

        boolean tryThree = false;
        if(i < nums.length - 2 && nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]){
            tryThree = dfs(nums, i + 3, memo);
        }

        boolean tryConsecutive = false;
        if(i < nums.length - 2 && nums[i + 2] - nums[i + 1] == 1 && nums[i + 1] - nums[i] == 1){
            tryConsecutive = dfs(nums, i + 3, memo);
        }
        boolean result = tryTwo || tryThree || tryConsecutive;
        memo.put(i, result);
        return result;
    }
}
