public class isPalindrome {
    public static boolean isPalin(String str,
                                  int left,
                                  int right){
        if(left > right){
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        boolean ans = isPalin(str,left+1,right-1);
        return ans;
    }
    public static void main(String[] args) {
        String word = "madam";
        boolean ans = isPalin(word,0,
                word.length()-1);
        System.out.println(ans);
    }
}
