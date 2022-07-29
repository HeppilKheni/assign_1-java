import java.util.*;

public class pr_8 {
        public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of student : ");
        int num1 = obj.nextInt();

        System.out.print("Enter the number of Question : ");
        int num2 = obj.nextInt();

        String[][] arr = new String[num1][num2];
        for (int i = 0; i < num1; i++) 
        {
            System.out.print("Student " + i + " : ");
            
            for (int j = 0; j < num2; j++) 
            {
                arr[i][j] = obj.next();
            }
        }
        System.out.println("Enter the Key of all Qustions : ");
        String[] key = new String[num2];
        for (int i = 0; i < num2; i++) 
        {
            key[i] = obj.next();
        }
        int b[] = new int[num1];
        for (int i = 0; i < num1; i++) 
        {
            int c = 0;
            for (int j = 0; j < num2; j++) {
                if (arr[i][j].equals(key[j])) 
                {
                    c++;
                    b[i] = c;
                }
            }
        }
        // System.out.println(c);
        for (int i = 0; i < num1; i++) 
        {
            System.out.println("Student " + i + " : " + b[i]);
        }

        obj.close();
    }
}
