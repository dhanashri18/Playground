import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int lastdigit=0;
      int sum =0;
     while(n>0)
     {
       lastdigit=n%10;
       sum=sum+lastdigit;
       n=n/10;
     }
      System.out.println(sum);
      
	}
}