# Maximum-Number-That-Makes-Result-of-Bitwise-AND-Zero
Challenge at LeetCode.com. Tags: Bitwise Operations, Math.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

The solutions for JavaScript and TypeScript apply Math.pow(2, numberOfLeftShifts) instead of<br> (1 << numberOfLeftShifts) because when applying bitwise operations, their double-precision 64-bit binary format IEEE 754 value is treated in a 32-bit format. And for this problem the range of answers exceeds the maximum value of a 32-bit integer.
