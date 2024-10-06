## Problem Overview

Given two integers, `left` and `right`, representing a range \([left, right]\), return the bitwise AND of all numbers within that range, inclusive.

## Where to Start?

The result will always be **equal to or less than `right`**, because the bitwise AND (`&`) operation can only turn `1` bits into `0`s, never the other way around. Thus, each operation can only clear bits in `right`.

## What Does the Program Do?

The program initially stores `right` in `res` and then iterates over 31 bits (`i` goes from 0 to 30) to determine if any of `right`'s bits should be turned to zero. The iteration starts from the **least significant bit (LSB)** to the **most significant bit (MSB)**. This is done to progressively narrow down the possible result as bits in `res` are cleared when necessary.

### Why Check Only 31 Bits and Not 32?

It is given that `0 <= left <= right <= 2^31 - 1`, meaning the 32nd bit will always be `0`, since any number equal to or greater than `left` is non-negative.

## Explanation of the Bitwise Checks

1. **Right Bit Check**:  
    If the bit at the `i`-th LSB of `right` is zero, it does not contribute to the result since for any `x`, `(x & 0 = 0)`. Therefore, the loop continues to the next iteration without modifying `res`.
    
2. **Left Bit Check**:  
    If the bit at the `i`-th LSB of `left` is zero, then the `i`-th bit of `res` must also become zero, because `(0 & x = 0)`. This is done using `res &= ~(1 << i)`.
    
3. **Check for the Smallest Number with a Zero at the `i`-th LSB**:  
    We need to determine if it's possible for a number between `left` and `right` to have a zero in the `i`-th bit position. This is where the following check is used:
    
    - To directly check this, you can use the expression `(((left >> (i + 1)) + 1) << (i + 1)) < right`.
        
        - This operation removes the `i+1` bits, adds one, and then shifts back to put `i+1` zeros in their place.
        - For example, if `left = 0110` and `right = 1011` with `i = 1`:
            - `(left >> (i + 1)) + 1` gives us `01 + 1 = 10`.
            - Shifting `10` back gives us `1000`, which is the smallest number greater than `left` and has a zero at the `i`-th LSB.
            - `1000 < 1011` is true.
            - The LSB at index `i` is turned to `0`.
    - To avoid integer overflow, we can instead use `((left >> (i + 1)) + 1) <= (right >> (i + 1))`.
        
        - This is effectively the same check, ensuring we stay within bounds.
        - For example, if `left = 0110` and `right = 1011` with `i = 1`:
            - `(left >> (i + 1)) + 1` gives us `01 + 1 = 10`.
            - `(right >> (i + 1))` is `10`.
            - `10 <= 10` is true.
            - The LSB at index `i` is turned to `0`.
    - To prove that `( (x << n) < y ) -> ( x <= (y >> n) )`:
        
        - If `x << n < y`
        - Then `x * 2^n < y`
        - Therefore, `x < y / 2^n`
        - Thus, `x <= floor(y / 2^n)`
        - And finally, `x <= y >> n`.

At the end of this process, `res` will hold the final result.
