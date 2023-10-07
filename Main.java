import java.util.Scanner;
public class Main
{
	 public static void main(String[] args) 
	 {
		 int num1;
		 int num2;
		 Calculator c1;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter number 1: ");
		 num1=s.nextInt();
		 s=new Scanner(System.in);
		 System.out.println("Enter number 2: ");
		 num2=s.nextInt();
		 System.out.println("Sum : "+c1.add(num1, num2));
		 System.out.println("Substraction : "+c1.sub(num1, num2));
		 
		 
		 
	 }
}