import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		in = new Scanner(System.in);
		int n2 = in.nextInt();
		System.out.println("Add: "+cl.add(n1, n2) + " Sub: "+cl.sub(n1, n2));
	}

}
