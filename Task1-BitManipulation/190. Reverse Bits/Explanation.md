## Problem Overview: Reverse Bits

Given a 32-bit unsigned integer, reverse its bits and return the result.

### Initialization

The `reverseBits` method takes an integer `n` as input and initializes a result variable `res` to `0`.

### Looping Through Bits

A `for` loop runs exactly 32 times to take each bit of `n`, starting from the least significant bit (LSB) and moving toward the most significant bit (MSB). In each iteration, the current result (`res`) is shifted left by one bit to make space for the next bit. Thus, the `i`-th LSB of `n` becomes the `i`-th MSB of `res` in each iteration.

### Extracting and Shifting Bits

In each iteration, the least significant bit (LSB) of `n` is extracted using `n & 1` and added to `res` using the bitwise OR operation (`res |= (n & 1)`). Then, `n` is right-shifted by one bit using the unsigned right shift operator (`>>>`). The use of `>>>` ensures that `n` is treated as an unsigned integer.

### Why Both `>>` and `>>>` Work

In this case, both the signed right shift (`>>`) and unsigned right shift (`>>>`) work because we are processing the bits exactly 32 times. However, `>>>` is a safer option as it consistently treats `n` as an unsigned number.

### Final Result

After 32 iterations, `res` contains the reversed bits of `n`, and the method returns `res`, giving the correct reversed binary representation of the original integer.
