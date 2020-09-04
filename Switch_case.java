package pack2;
import java.util.*;

public class Switch_case {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("enter 2 numbers");
	int a= obj.nextInt();
	int b= obj.nextInt();
    System.out.println("1.addition");
    System.out.println("2.subtraction");
    System.out.println("3.multiplication");
    System.out.println("4.division");
    System.out.println("enter choice [1...4]:");
    int ch= obj.nextInt();
    switch (ch)
    {
    case 1: System.out.println("Addition = "+(a+b));
    break;
    case 2:System.out.println("subtraction = "+(a-b));
    break;
    case 3:System.out.println("multiplication = "+(a*b));
    break;
    case 4:System.out.println("division = "+(a/b));
    break;
    default:System.out.println("invalid choice ");
    }
	}
}
    
	


