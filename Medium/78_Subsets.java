import java.io.*;
import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<Integer>());

        for (int num : nums) {
          List<List<Integer>> subset = new ArrayList<>();
          for (List<Integer> i : output) {
              subset.add(new ArrayList<Integer>(i){{add(num);}});
          }
          for (List<Integer> curr: subset) {
              output.add(curr);
          }
        }
        return output;
    }
}
