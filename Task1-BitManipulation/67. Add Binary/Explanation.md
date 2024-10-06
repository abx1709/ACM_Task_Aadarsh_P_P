
We initialize two pointers, `i` and `j`, to the last indices of the binary strings `a` and `b`, respectively. A `carry` variable is set to `0`, and a `StringBuilder` (`res`) is used to construct the result.

The loop continues as long as there are digits left in either string (`i > -1` or `j > -1`) or a carry exists. For each iteration, the digits from `a` and `b` are extracted and converted to integers (`val1` and `val2`). These are added along with the carry to get the sum `s`.

We compute the new carry as `s >> 1` (remove the LSB), and append the LSB (`s & 1`) to the result. The pointers `i` and `j` are decremented after each step.

After exiting the loop, the `StringBuilder` is reversed and returned as the final binary sum.