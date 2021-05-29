public class Solution {
    public int[] countBits(int num) {
        int[] answer = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            String bin = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < bin.length(); j++) {
                if (bin.charAt(j) == '1') count++;
            }
            answer[i] = count;
        }
        return answer;
    }
}
