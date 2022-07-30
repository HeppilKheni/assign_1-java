//ID : 21CE056
//Name : Heppil Kheni
//Aim : solve a pyramid pattern using mathematics logic and loops.

import java.util.*;
public class pr_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Solution is : ");
        
            for(int i=1;i<=n;i++)
            {
//for space according to rows and colomns.
                 for(int j=1;j<=(n-i);j++)
                    {
                       System.out.print(" ");
                    }
            int sum=1;
            System.out.print("1");

//for half left part    
                   if(i!=1){
                    for(int k=1;k<i;k++)
                    {   
    
                        sum=sum*2;
                        System.out.printf("%3d",sum);
                    }
                
//for half right part
                    for(int b=i-1;b>1;b--)
                    {
                        sum=sum/2;                                                  
                        System.out.printf("%3d",sum);
                    }
                  System.out.print(" 1");
            }
            System.out.println("");
        }

    }
}
