package menuakGit;
import java.util.Scanner;
public class menuak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long factorial = 1;
		int elec,x,y;
		
		System.out.println("menu \r\n"
				+ "1-suma \r\n"
				+ "2-resta \r\n"
				+ "3-multiplicar \r\n"
				+ "4-dividir \r\n"
				+ "5-factorial de tu numero");
		elec = input.nextInt();
		switch(elec) {
		case 1: 
			System.out.println("Primer numero");
			x = input.nextInt();
			System.out.println("Segundo numero");
			y = input.nextInt();
			System.out.println(x+y);
			break;
		case 2:
			System.out.println("Primer numero");
			x = input.nextInt();
			System.out.println("Segundo numero");
			y = input.nextInt();
			System.out.println(x-y);
			break;
		case 3:
			System.out.println("Primer numero");
			x = input.nextInt();
			System.out.println("Segundo numero");
			y = input.nextInt();
			System.out.println(x*y);
			break;
		case 4:
			System.out.println("Primer numero");
			x = input.nextInt();
			System.out.println("Segundo numero");
			y = input.nextInt();
			System.out.println(x/y);
			break;
		}
		x = input.nextInt();
		for (int i = x; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de " + x + " es: " + factorial);
	}

}
