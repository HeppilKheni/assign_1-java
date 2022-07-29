import java.util.*;
public class pr_9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        final int row = 3;
        final int colomn = 3;
        int arr[][]= new int[row][colomn];

        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < colomn; j++) 
            {
                arr[i][j] = obj.nextInt(); 
            }
        }
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < colomn; j++) 
            {
                System.out.printf("%2d" ,arr[i][j]);
            }
            System.out.println();
        }
        obj.close();
    }
}
