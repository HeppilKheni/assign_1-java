//ID : 21CE056
//Name : Heppil Kheni
//Aim : how many 2 char are same in string.

import java.util.Scanner;
import static java.lang.Math.min;
class pr_5{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter first string : ");
        String a=sc.next();
        System.out.println("Enter second string : ");
        String b=sc.next();
        int c=Match(a,b);
        System.out.println(c);
        sc.close();
    }
    public static int Match(String x,String y)
    {
        int count=0;
        int f=min(x.length(),y.length());
        for(int i=0;i<f-1;i++)
        {
//compare to char are same or not.
            String z=x.substring(i,i+2);
            String t=y.substring(i,i+2);
            if(z.equals(t))
            {
                count++;
            }
        }
        return count;
    }   
}