### Problem Overview
Given an array of integers where every element appears twice except for one, find the unique integer using O(n) time complexity and O(1) space complexity.

### Initialization
A variable `res` is initialized to `0`. This will store the result of XORing all the numbers in the input array `nums`.

### Looping Through Array
The method iterates through each integer `n` in the array `nums` using a `for-each` loop.

In each iteration:
- The current number `n` is XORed with the result stored in `res` (`res ^= n`).
- Since XOR of a number with itself results in `0`, all numbers that appear twice will cancel each other out, leaving only the number that appears once.

### Final Result
After processing all elements of the array, `res` will hold the single number, which is returned as the result.
