
using System;

public class Solution
{
    public long MaxNumber(long input)
    {
        int numberOfLeftShifts = (int)Math.Log2(input);
        return (1L << numberOfLeftShifts) - 1;
    }
}
