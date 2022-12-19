
import java.util.Arrays;
import java.util.Scanner;

public class Challenge01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];
        int i= 0;

        for (i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        //declarando os pares em sequencia crescente
        for (int arr : array) {
            if (arr %2 == 0) {
                System.out.println(arr);
            }
        }
        //declarando sequencia impares decrescente
            for (i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }
    }
}
