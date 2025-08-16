
#include <cmath>
using namespace std;

class Solution {

public:
    long long maxNumber(long long input) const {
        int numberOfLeftShifts = log2(input);
        return (1L << numberOfLeftShifts) - 1;
    }
};
