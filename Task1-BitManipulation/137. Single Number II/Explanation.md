### Problem Overview
The task is to find the single number in an integer array `nums`, where every other number appears exactly three times. The solution must have O(n) time complexity and O(1) space complexity.

### Initialization
A variable `res` is initialized to `0`. This variable will hold the resulting single number that appears exactly once.

### Looping Through Bits
The method uses a loop that iterates from `0` to `31` (covering all bits of a 32-bit integer). 

In each iteration:
1. **Bit Sum Calculation**: A variable `bitSum` is initialized to `0`. This variable will count how many numbers have the `i`-th bit set to `1`.
2. The for-each loop iterates through each integer `n` in the `nums` array. In each iteration, it calculates the contribution of the `i`-th bit from each number:
   - `(n >> i) & 1` shifts the number `n` to the right by `i` bits and checks if the least significant bit is `1`. This value is added to `bitSum`.

3. **Constructing the Result**: After calculating `bitSum` for the current bit position, the method checks if `bitSum % 3` is not equal to `0`. 
   - If true, this indicates that the single number contributes a `1` at the i-th bit position. The result variable `res` is updated using the bitwise OR operation (`res |= (1 << i)`).

### Final Result
After all bit positions have been processed, the variable `res` will contain the single number that appears only once in the array. This value is returned as the result.
