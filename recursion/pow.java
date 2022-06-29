/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description: Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 **************************************************************************** */

class Solution {
    private double result = 1.0;

    public double positivePow(double x, long N) {
        if (N == 0) {
            return result;
        }
        double rest = positivePow(x, N / 2);
        return (N % 2 == 1) ? rest * rest * x : rest * rest;
    }

    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? positivePow(x, N) : 1.0 / positivePow(x, -N);
    }
}
