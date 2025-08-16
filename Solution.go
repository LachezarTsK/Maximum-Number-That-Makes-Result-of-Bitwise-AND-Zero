
package main
import "math"

func maxNumber(input int64) int64 {
    numberOfLeftShifts := int(math.Log2(float64(input)))
    return (1 << numberOfLeftShifts) - 1
}
