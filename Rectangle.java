package pack1;
import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        System.out.println("enter length value:");
        int l = obj.nextInt();
        System.out.println("enter breadth value:");
        int b = obj.nextInt();
        int a = l*b;
        System.out.println("area of rectangle = " + a);
	}

}
