package actividad1_Moneda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainMoneda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		double moneda;
		Moneda euros = new Moneda();
		System.out.print("Bienvenido. ");
		try {
		do {
			do {
				System.out.println("¿Que acción desea realizar?");
				System.out.println("1. Pasar Euros a Dolares");
				System.out.println("2. Pasar Dolares a Euros");
				System.out.println("3. Mostrar el valor del Dolar");
				System.out.println("4. Cambiar el valor del Dolar");
				System.out.println("5. Salir");
				n = teclado.nextInt();
				teclado.nextLine();
			} while (n < 1 && n > 5);
			switch (n) {
			case 1:
				System.out.print("Introduce el valor en Euros: ");
				moneda = teclado.nextDouble();
				System.out.print("El valor en dolares es: ");
				System.out.println(euros.EurosDolares(moneda));
				System.out.println();
				break;
			case 2:
				System.out.print("Introduce el valor en Dolares: ");
				moneda = teclado.nextDouble();
				System.out.print("El valor en euros es: ");
				System.out.println(euros.DolaresEuros(moneda));
				System.out.println();
				break;
			case 3:
				System.out.print("El valor de 1 euro son " + euros.MostrarValor() + " dolares.");
				System.out.println();
				break;
			case 4:
				System.out.print("Introduzca el valor actual del dolar: ");
				double v = teclado.nextDouble();
				euros.ValorMoneda(v);
				System.out.println();
				break;
			case 5:
				System.out.println();
			}
		} while (n != 5);
		} catch (InputMismatchException e) {
			System.err.print("Solo puedes introducir numeros.");
		}
		teclado.close();
	}
}