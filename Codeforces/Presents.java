import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        int[] arr = new int[5000];
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int values = input.nextInt();
            arr[values] = i;
        }
        for (int i = 1; i <= n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
