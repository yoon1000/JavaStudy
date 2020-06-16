import java.util.Scanner;

public class project4 {


    static int seqSearch(int[] a, int key) {

        for (int i=0;i<a.length;i++)
            if (a[i] == key)
                return i;
        return -1;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] x = {15, 27, 39, 77, 92, 108, 121};

        System.out.print("검색할 값: ");
        int ky = input.nextInt();

        int idx = seqSearch(x,ky);

        while (idx == -1) {
            System.out.print("검색한 값이 배열에 없습니다. 다시 입력하세요: ");
            ky = input.nextInt();
            idx = seqSearch(x,ky);
        }
        if(idx !=-1)
            System.out.print(ky + "는 x[" + idx + "]에 있습니다");
    }
}
