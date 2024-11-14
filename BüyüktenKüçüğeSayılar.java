import java.util.Scanner;

public class BüyüktenKüçüğeSayılar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Sayı : ");
		int a = sc.nextInt();
		
		System.out.print("2. Sayı :");
		int b = sc.nextInt();
		
		System.out.print("3. Sayı : ");
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			if (b > c) {
				System.out.println("a > b > c");
			}else {
				System.out.println("a > c > b");
			}
		}else if (b > a && b > c) {
			if (a > c) {
				System.out.println("b > a > c");
			}else {
				System.out.println("b > c > a");
			}
		}else {
			if (a > b) {
				System.out.println("c > > a > b");
			}else {
				System.out.println("c > b > a");
			}
		}

	}

}
