import java.util.HashSet;

public class HappyNumber {
        public static boolean isHappy(int n) {
            HashSet<Integer> set = new HashSet<>();
            while(n!=1 && !(set.contains(n))){
                set.add(n);
                n = Next(n);

            }
            if(n==1){
                return true;
            }
            return false;
        }
        public static int Next(int n){
            int totalSum = 0;
            while(n>0){
                int d = n%10;
                n = n/10;
                totalSum +=d*d;
            }
            return totalSum;
        }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }


    }

