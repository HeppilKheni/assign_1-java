import java.util.Scanner;

class assig{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    String a=sc.nextLine();
    String b=sc.nextLine();
    int a1=a.length();
    int b1=b.length();
    int count=0;




    
    for(int i=0;i<a1-2;i++)
    {
        
        for(int j=0;j<b1-2;j++)
        {
            String x=a.substring(i,i+2);

            String y=b.substring(j,j+2);
            if(x==y)
            {
                 count++;
            }
                
        }
    }
    System.out.println(count);



    
}
}