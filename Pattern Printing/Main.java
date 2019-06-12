import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int r,c,result=1;
      Scanner sc= new Scanner(System.in);
      r=sc.nextInt();
      c=sc.nextInt();
      for (int i = r;i > 0; i--)
{
    for (int j = c;j > i; j--)
        System.out.print(j);
 
    for (int j = i; j > 0; j--)
        System.out.print(i);
 
    System.out.println();
}
      //stem.out.println(result);
      
    }
}