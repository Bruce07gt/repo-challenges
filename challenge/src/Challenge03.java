import java.util.Scanner;

public class Challenge03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++ ) {
            array[i] = sc.nextInt();
        }
        int result = 0;
        for (int j = 0; j < array.length; j++) {
            for (int m = 0; m < array.length; m++) {
                if (array[j] - array[m] == k) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
