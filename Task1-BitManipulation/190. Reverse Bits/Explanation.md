### Initialization

The `reverseBits` method takes an integer `n` as input and initializes a result variable `res` to `0`. This variable will store the reversed bits of `n` as the method processes the input.

### Looping Through Bits

A `for` loop runs exactly 32 times to process each bit of `n`, starting from the least significant bit (LSB) and moving toward the most significant bit (MSB). In each iteration, the current result (`res`) is shifted left by one bit to make space for the next bit.

### Extracting and Shifting Bits

In each iteration, the least significant bit (LSB) of `n` is extracted using `n & 1` and added to `res` using the bitwise OR operation (`res |= (n & 1)`). Then, `n` is right-shifted by one bit using the unsigned right shift operator (`>>>`). The use of `>>>` ensures that `n` is treated as an unsigned integer, preventing sign extension when handling negative numbers.

### Why Both `>>` and `>>>` Work

In this case, both the signed right shift (`>>`) and unsigned right shift (`>>>`) work because we are processing the bits exactly 32 times. However, `>>>` is a safer option as it consistently treats `n` as an unsigned number, avoiding issues with sign extension that may occur when using `>>` on negative numbers.

### Final Result

After 32 iterations, `res` contains the reversed bits of `n`, and the method returns `res`, giving the correct reversed binary representation of the original integer. Using `>>>` ensures consistent behavior for both positive and negative values.
