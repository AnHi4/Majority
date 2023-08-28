import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(nums));
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); // мапа для присвоения значению в массиве его количество
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1); //key - значение, value - количество
        }
        for (int num: nums) {
            if(map.get(num) > nums.length/2){ //возврат по условию n/2
                return num;
            }
        }
        return 0;  //если что-то пошло не так
    }
}