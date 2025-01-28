public class WhereInSequence {
    public static void main(String[] args) {
        System.out.println(whereInSequence(0));
        System.out.println(whereInSequence(3));
        System.out.println(whereInSequence(39));
        System.out.println(whereInSequence(40));
    }
    public static int whereInSequence(int in) {
        if (in == 0) {return 1;}
        if (in < 3) {return 2;}

        int nf = 0, i = 1, j = 0, c = 1;

        while (nf <= in) {
            nf = 3 * i + 2 * j;
            j = i;
            i = nf;
            c++;
        }
        return c;
    }
}
