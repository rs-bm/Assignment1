public class NotFibonacci {
    public static void main(String[] args) {
        int term = 10;
        long[] series = notFib(term);
        String res = "";
        for (int i = 0; i < term - 1; i++) {
            res += series[i] + ", ";
        }
        res += series[term - 1] + ".";
        System.out.println(res);
    }
    public static long[] notFib(int term) {
        long[] series = new long[term];
        for (int i = 0; i < term; i++)
            if (i == 0)
                series[i] = 0;
            else if (i == 1)
                series[i] = 1;
            else
                series[i] = 3 * series[i - 1] + 2 * series[i - 2];
        return series;
    }
}
