import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int sum=0;
      int lastdigit=0;
      int seconddigit=0;
      int firstdigit = n%10;
      while(n!=0)
      {
        seconddigit = lastdigit;
         lastdigit= n%10;
        n=n/10;
      }
       System.out.println(seconddigit);
	}
}
      