import java.util.Arrays;
import java.util.Scanner;

public class Diagonal_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int size2=scanner.nextInt();
        int[][] matrix = new int[size][size2];
        int [] result = new int[size];
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size2; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(diagonal_sum(matrix));
    }

    static int diagonal_sum(int[][] matrix) {
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            //System.out.println(matrix[i][i]);
        }
        return sum;
    }
}
