package methods;
import java.util.*;
public class functions1 {
public int add(int a, int b) {
	return a+b;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no.s: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		functions1 obj1= new functions1();
		int res=obj1.add(a,b);
		System.out.println("Result: "+res);
		sc.close();
	}

}
