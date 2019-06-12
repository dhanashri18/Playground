import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int sum=0;
      int lastdigit=0;
      int firstdigit = n%10;
      while(n!=0)
      {
         lastdigit= n%10;
        n=n/10;
      }
      sum = firstdigit + lastdigit;
      System.out.println(sum);
	}
}