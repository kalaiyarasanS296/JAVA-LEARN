package graphs.detectcycleBFS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            char[][] arr = new char[n][m];
            for (int i = 0; i < n; i++) {
                String str = sc.nextLine();
                String[] a = str.split(" ");
                for (int j = 0; j < a.length; j++) {
                    arr[i][j] = a[j].charAt(0);
                }
            }

        for(int i = 0;i < 4;i++) {
            for(int j = 0; j < 4;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
