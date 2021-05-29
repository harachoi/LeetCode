import java.util.*;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new LinkedList<>();
        boolean[] tmp = new boolean[nums.length + 1];
        int index = 0;
        for (int i : nums) tmp[i] = true;
        for (int i = 1; i <= nums.length; i++) {
            if (!tmp[i]) answer.add(i);
        }
        System.out.println(answer);
        return answer;
    }
}
