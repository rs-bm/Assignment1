public class CommonSubstring {
    public static void main(String[] args) {
        System.out.println(commonSubstring("spy family", "jujutzu"));
        System.out.println(commonSubstring("gears of war", "History of warriors"));
        System.out.println(commonSubstring("spy family", "jujutzu kaisen"));

    }
    public static String commonSubstring(String s1, String s2) {
        String cmn = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                int k = 0;
                while (i+k < s1.length() && j+k < s2.length() && s1.charAt(i+k) == s2.charAt(j+k)) {
                    k++;
                }
                if (k > cmn.length()) {
                    cmn = s1.substring(i, i+k);
                }
            }
        }
        return cmn;
    }
}
