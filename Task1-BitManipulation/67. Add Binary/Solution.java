class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;

        StringBuilder res = new StringBuilder();
        int carry = 0;
        while (i>-1 || j>-1 || carry>0) {
            int val1 = (i > -1) ? a.charAt(i) - '0' : 0; i--;
            int val2 = (j > -1) ? b.charAt(j) - '0' : 0; j--;

            int s = val1 + val2 + carry;
            carry = s >> 1;
            res.append(s & 1);
        }

        return res.reverse().toString();
    }
}
