package pack1;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter base value:");
		int b = obj.nextInt();
		System.out.println("enter height value:");
		int h = obj.nextInt();
		float area = 1.5f*b*h;
        System.out.println("area of triangle = " +area);
        System.out.println("%1.2f,area");
	}

}
