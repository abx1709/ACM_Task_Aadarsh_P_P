
R̥1r3lte4yr̥class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int res = right;

        for (int i=0; i<31; i++) {

            int rbit = right & (1<<i);
            if (rbit==0) { continue; }

            int lbit = left & (1<<i);
            if (lbit==0) { res &= ~(1<<i); }

            int minForZero = (left >> (i+1)) + 1;
            int adjustedRight =  (right >> (i+1));
            if (minForZero <= adjustedRight ) { res &= ~(1<<i); }
            else { break; }

        }

        return res;
    }
}