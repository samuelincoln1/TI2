package ti2;
import java.util.*;
public class Soma {
	public static int soma(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Insira dois numeros para a soma: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(soma(a,b));
	}
}
