public class CommonSubsequence {
    public static void main(String[] args) {
        System.out.println(commonSubsequence("abc","abc",0,0));
        System.out.println(commonSubsequence("almanacs","albatross",0,0));
        System.out.println(commonSubsequence("almanac","ferris",0,0));
    }
    public static int commonSubsequence(String s1, String s2, int a, int b) {
        if (a == s1.length() || b == s2.length()) {return 0;}
        if (s1.charAt(a) == s2.charAt(b)) {return 1 + commonSubsequence(s1,s2,a+1,b+1);}
        else {
            int i = commonSubsequence(s1, s2, a, b + 1);
            int j = commonSubsequence(s1, s2, a + 1, b);
            if (i > j) {return i;}
            else {return j;}
        }

    }
}
