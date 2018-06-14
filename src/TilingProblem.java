import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class TilingProblem {

    public static void main(String[] args) {
        System.out.println(numOfWaysToSetRect2(9));
        System.out.println(findWays(9));
        System.out.println(ways(9));
    }

    public static int numOfWaysToSetRect2(int n){
        int result = 1;
        int previous1 = 1;
        int previous2 = 1;
        for (int i = 2; i <= n; i++) {
            result = previous1 + previous2;
            previous2 = previous1;
            previous1 = result;
        }
        return result;
    }

    public static int findWays(int n){
        int result = 0;
        result = (int) ((pow((1 + sqrt(5)) / 2, n+1) - pow((1 - sqrt(5)) / 2, n+1)) / sqrt(5));
        return result;
    }

    public static int ways(int n) {
        // O(n)
        int[] D = new int[n+1];
        D[1] = 1;
        D[2] = 2;
        for(int i = 3; i <= n; i++ ) {
            D[i] = D[i-1] + D[i-2];
        }
        return D[n];
    }

}
