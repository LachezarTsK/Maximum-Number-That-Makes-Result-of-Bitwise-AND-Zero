
public class Solution {

    public long maxNumber(long input) {
        int numberOfLeftShifts = (int) (Math.log10(input) / Math.log10(2));
        return (1L << numberOfLeftShifts) - 1;
    }
}
