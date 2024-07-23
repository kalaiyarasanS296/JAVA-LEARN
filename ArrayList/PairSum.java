import java.util.ArrayList;

public class PairSum {
    //2 Pointer for Sorted Array
    public static boolean findSum1(ArrayList<Integer> list,
                                   int target) {
        int lp = 0, rp = list.size()-1;
        while(lp < rp) {
            if(lp+rp == target) {
                return true;
            }
            if(lp+rp < target) {
                lp++;
            } else {
                rp--;
            }
        }

        return false;
    }


    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 5;

        System.out.println(findSum1(list, target));
    }
}
