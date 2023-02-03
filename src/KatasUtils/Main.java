package KatasUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Prueba prueba = new Prueba("HolaMundo");
		System.out.println(prueba.Nombre);

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserte un numero");
		int numero = sc.nextInt();

		System.out.println(numero);

		if (numero % 2 == 0) {
			System.out.println("Soy par");

		} else {
			System.out.println("No soy par");

		}

		/**
		 * Mis Katas Prueba definitiva.
		 * 
		 */
		String s = "holaqef";

		if (s.length() % 2 != 0) {
			// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#concat(java.lang.String)
			s = s.concat("_");
		}

		String palabraModificada = "";

		for (int i = 0; i < s.length(); i++) {

			if (i % 2 != 0 && i != 0 && i != s.length() - 1) {
				System.out.println(i + "if");

				char a = s.charAt(i);
				String charToString = String.valueOf(a + ",");
				palabraModificada += charToString;

			} else {
				System.out.println(i + "else");
				char a = s.charAt(i);
				String charToString = String.valueOf(a);
				palabraModificada += charToString;
			}
		}

		String[] partes = palabraModificada.split("\\,");

		System.out.println(Arrays.asList(partes));

		System.out.println(palabraModificada);

//		int number = -20;
//		int resultado = 0;
//		for (int i = 0; i < number; i++) {
//			if (i % 3 == 0 || i % 5 == 0 && i != 0) {
//
//				resultado += i;
//
//			}
//		}
//
//		System.out.println("Primer test: " + resultado);

//		return resultado;
//
//	}
//		

//		Prueba uno = new Prueba("Javier");
//		Scanner sc = new Scanner(System.in);
//		System.out.println(uno.Nombre);
//		uno.cambioNombre();
//		System.out.println(uno.Nombre);
//
//		String sCadena = "Hola Mundo 123456789";
//		String sSubCadena = sCadena.substring(0, 10);
//		String sSubCadena2 = sCadena.substring(12, 20);
//		System.out.println(sSubCadena);
//		System.out.println(sSubCadena2);
//
//		System.out.println(uno.calcularPorcentaje(75, 25));

//		int suma = 0;
//		int resultado = 0;
//		for (int i = 0; i < 10; i++) {
//			if (i % 3 == 0 || i % 5 == 0 && i != 0) {
//
//				resultado += suma + i;
//
//			}
//		}

//		System.out.println("aquiiii: " + resultado);
//
//		String input = "Hola";
//		String palabraModificada = "";
//		for (int i = 0; i < input.length(); i++) {
//			char c = input.charAt(i);
//
//			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
//				palabraModificada += String.valueOf(c);
//			}
//		}
//		input = palabraModificada;
//
//		System.out.println("Suplabra modificada: " + input);
//		System.out.println("Suplabra modificada2: " + palabraModificada);
//
//		System.out.println("Bienvenido a mi programa de claculo de %");
//		System.out.println("Porfavor inserte un numero");
//		int i = sc.nextInt();
//		System.out.println("Porfavor inserte un prcentaje");
//		int w = sc.nextInt();
//
//		int rsultadoPollito = (i * w) / 100;
//		System.out.println("Su resultado mi pollito volador es: " + rsultadoPollito);
//		int precioFinalSuperPollito = i - rsultadoPollito;
//		System.out.println("Por lo tanto el precio final es: " + precioFinalSuperPollito);
//
//		System.out.println("Que pase buena noche con Hawer y vea Fargo, es muy chula");
//
	}

}
