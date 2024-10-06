class Solution {
    public int singleNumber(int[] nums) {

        int res = 0;

        for (int i=0; i<32; i++) {

            int bitSum = 0;

            for (int n: nums) {
                bitSum += (n>>i) & 1;
            }

            if (bitSum%3 != 0) {
                res |= (1 << i);
            }

        }

        return res;
    }
}
