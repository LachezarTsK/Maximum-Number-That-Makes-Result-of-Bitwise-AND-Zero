
import kotlin.math.log2

class Solution {

    fun maxNumber(input: Long): Long {
        val numberOfLeftShifts = log2(input.toDouble()).toInt()
        return (1L shl numberOfLeftShifts) - 1
    }
}
