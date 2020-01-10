package daily.code.dp;

public class FibonacciSeries {

    public static void main(String[] args) {
        printFibonacciSeries(10);
        printFibonacciSeries(2);
        printFibonacciSeries(1);
    }

    private static void printFibonacciSeries(int number) {
        int[] cache = new int[number];
        if (number == 1) {
            cache[0] = 0;
            System.out.println(cache[0]);
        } else {
            cache[0] = 0;
            cache[1] = 1;
            System.out.println(cache[0]);
            System.out.println(cache[1]);
        }
        for (int count = 2; count < cache.length; count++) {
            cache[count] = cache[count - 1] + cache[count - 2];
            System.out.println(cache[count]);
        }

    }
}
