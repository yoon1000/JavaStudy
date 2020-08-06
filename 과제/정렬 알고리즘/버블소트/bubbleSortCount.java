import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bubbleSort {
    static void swap (int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubblesort(int[] a, int n) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < n - 1; i++) {
            int l = i+1;
            System.out.println("패스"+ l + ":");

            for (int j = n - 1; j > i; j--) {
                for(int m = 0; m<n; m++){
                    System.out.print(a[m] + (m!=j-1 ? " ": (a[m]>a[m+1] ? "+":"-")));
                }

                System.out.println();
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    x++;
                }
                else {
                    y++;
                }
            }
            for(int k =0; k<n; k++) {
                System.out.print(a[k] + " ");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println("교환을 " + x + "회 했습니다.");
        System.out.println("비교를 " + y + "회 했습니다.");
    }
    

    public static void main(String[] args) {

        int[] pass = {16, 2, 3, 5, 1, 22, 8};

        bubblesort(pass, pass.length);

    }
}
