import java.util.ArrayList;

public class Activity_Selection_1 {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        int lastend = end[0];
        ans.add(0);
        for(int i=1; i< end.length; i++){
            if(start[i]>=lastend){
                maxAct++;
                ans.add(i);
                lastend = end[i];
            }
        }
        System.out.println("max Activities = " +maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.println("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
