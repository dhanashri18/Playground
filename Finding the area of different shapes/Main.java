import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        int cas;
         Scanner sc= new Scanner(System.in);
      cas=sc.nextInt();
      switch(cas)
      {
        case 1:
          int side;
      side=sc.nextInt();
          System.out.println(side*side);
          break;
        case 2:
          int l,b;
          l=sc.nextInt();
          b=sc.nextInt();
           System.out.println(l*b);
          break;
        case 3:
          int d,h;
          d=sc.nextInt();
          h=sc.nextInt();
          System.out.println(d*h/2);
          break;
        case 4:
          int r;
          r=sc.nextInt();
          System.out.println(3.14*r*r);
          break;
      }
    }
}