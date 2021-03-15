import java.util.Arrays;
import java.util.Scanner;
public class Lab_3_I_am_Valentin{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array;
        System.out.println("Input size :");
        int size = in.nextInt();
        array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Input element :");
                array[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < size;  i++){
            System.out.println(Arrays.toString(array[i]));
        }
        int sum1 = 0;
        int sum2 = 0;
        int x = -1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum1 += array[i][j];
            }
            if (sum1 != sum2) {
                sum2 = sum1;
                ++x;
            }
            else {
                sum2 = sum1;
            }
            sum1 = 0;
        }
        sum1 = 0;
        sum2 = 0;
        int y = -1;
        System.out.println(x);
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                sum1 += array[i][j];
            }
            if (sum1 != sum2) {
                sum2 = sum1;
                ++y;
            }
            else {
                sum2 = sum1;
            }
            sum1 = 0;
        }
        System.out.println(y);
        if(x == 0 && y == 0){
            System.out.println("Magic");
        }
        else{
            System.out.println("No Magic");
        }
    }
}