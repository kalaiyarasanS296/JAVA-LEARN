package Dynamicprogramming;

public class LCSRecursion {
    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "agcfd";
        System.out.println(LCSRecursion(s1, s2));

    }

    public static int LCSRecursion(String s1, String s2) {

        if (s1.length() == 0 || s2.length() == 0) {
            return 0;
        }

        char ch1 = s1.charAt(0);
        char ch2 = s2.charAt(0);

        String ros1 = s1.substring(1);
        String ros2 = s2.substring(1);

        int ans = 0;

        if (ch1 == ch2) {
            ans = LCSRecursion(ros1, ros2) + 1;
        } else {
            int o1 = LCSRecursion(s1, ros2);
            int o2 = LCSRecursion(ros1, s2);

            ans = Math.max(o1, o2);
        }

        return ans;

    }
}
