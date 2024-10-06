## Problem Overview
Given two strings that represent binary numbers, return their sum as a binary string.

## Initialization

We start by initializing two pointers, `i` and `j`, to the last indices of the binary strings `a` and `b`, respectively. A `carry` variable is set to `0`, and a `StringBuilder` (`res`) is used to build the result.

## Loop Condition

The loop continues while there are digits left in either string (`i > -1` or `j > -1`) or a carry remains. In each iteration, the digits from `a` and `b` are extracted and converted to integers (`val1` and `val2`). These values are added along with the carry to produce the sum `s`.

## Updating Carry and Result

The carry is updated by extracting the second least significant bit (`s >> 1`), and the least significant bit (`s & 1`) is appended to the result. After processing each digit, the pointers `i` and `j` are decremented, moving towards the next lower bits of the numbers.

## Final Result

Once the loop completes, the `StringBuilder` is reversed to correct the order of the binary result and returned as the final binary sum.
