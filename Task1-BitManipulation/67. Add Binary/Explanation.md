# Problem Overview
Given two binary strings, return their sum as a binary string.

## Initialization
Two pointers, `i` and `j`, are initialized to the last indices of the binary strings `a` and `b`, respectively. A variable `carry` is set to `0`, and a `StringBuilder` named `res` is created to build the result.

## Looping Through Input
The method enters a `while` loop that continues while there are digits left in either string (`i > -1` or `j > -1`) or a `carry` remains.

In each iteration:
- The current digits are extracted from `a` and `b` and converted to integers (`val1` and `val2`).
- These values, along with `carry`, are summed to produce `s`.
- The carry is updated by extracting the second least significant bit (`carry = s >> 1`), and the least significant bit (`s & 1`) is appended to `res`.
- The pointers `i` and `j` are decremented to move to the next lower bits.

## Final Result
Once the loop is complete, the `StringBuilder` is reversed to correct the order of the binary result, which is then returned as the final binary sum.
