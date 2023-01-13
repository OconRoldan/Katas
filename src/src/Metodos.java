import java.util.ArrayList;
import java.util.Arrays;

public interface Metodos {

	// ---------------------Enunciado: Kata1---------------------//

	/**
	 * Kata 1:
	 *
	 * Quitar las vocales a la palabra que recibes por parametros.
	 * 
	 */

	// ---------------------Soluciones: Kata1---------------------//

	/**
	 * Kata (Mi respuesta):
	 * 
	 * @param input
	 * @return input
	 */
	public static String shortcut(String input) {
		String palabraModificada = "";
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				palabraModificada += String.valueOf(c);
			}
		}
		input = palabraModificada;
		return input;
	}

	/**
	 * Kata 1 (Mejor solución):
	 * 
	 * @param input
	 * @return input.replaceAll("[aeiou]", "")
	 */
	public static String shortcutMejor(String input) {
		return input.replaceAll("[aeiou]", "");
	}

	// ---------------------Enunciado: Kata1---------------------//

	/**
	 * Annunciate: If we list all the natural numbers below 10 that are multiples of
	 * 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * 
	 * Finish the solution so that it returns the sum of all the multiples of 3 or 5
	 * below the number passed in. Additionally, if the number is negative, return 0
	 * (for languages that do have them).
	 * 
	 * Note: If the number is a multiple of both 3 and 5, only count it once.
	 * ------------------------------------------------------------------------------
	 * 
	 * Si enumeramos todos los números naturales debajo de 10 que son múltiplos de 3
	 * o 5, obtenemos 3, 5, 6 y 9. La suma de estos múltiplos es 23.
	 * 
	 * Termina la solución para que devuelva la suma de todos los múltiplos de 3 o 5
	 * por debajo del número pasado. Además, si el número es negativo, devuelve 0
	 * (para los idiomas que los tienen).
	 * 
	 * Nota: si el número es un múltiplo de 3 y 5, solo cuéntelo una vez.
	 * 
	 */

	// ---------------------Soluciones: Kata2---------------------//

	/**
	 * Kata 2 (Mi resultado):
	 * 
	 * @param number
	 * @return resultado
	 */
	public static int solution(int number) {
		int resultado = 0;
		for (int i = 0; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0 && i != 0) {
				resultado += i;
			}
		}
		return resultado;
	}

	/**
	 * Kata 2 (Mejor resultado):
	 * 
	 * @param number
	 * @return sum
	 */
	public class Solution {

		public int solution(int number) {
			int sum = 0;

			for (int i = 0; i < number; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
				}
			}
			return sum;
		}
	}

	// ---------------------Enunciado: Kata3---------------------//

	/**
	 * Annunciate:Complete the solution so that it splits the string into pairs of
	 * two characters. If the string contains an odd number of characters then it
	 * should replace the missing second character of the final pair with an
	 * underscore ('_').
	 * 
	 * Enunciado:Complete la solución para que divida la cadena en pares de dos
	 * caracteres. Si la cadena contiene un número impar de caracteres, debe
	 * reemplazar el segundo carácter faltante del par final con un guión bajo
	 * ('_').
	 * 
	 * 'abc' => ['ab', 'c_'] || 'abcdef' => ['ab', 'cd', 'ef']
	 */

	// ---------------------Soluciones: Kata3---------------------//

	/**
	 * Kata 3 (Mi resultado):
	 * 
	 * @param s
	 * @return partes;
	 */
	public static String[] solution(String s) {

		if (s.length() % 2 != 0) {
			// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#concat(java.lang.String)
			s = s.concat("_");
		}

		String palabraModificada = "";

		for (int i = 0; i < s.length(); i++) {

			if (i % 2 != 0 && i != 0 && i != s.length() - 1) {

				char a = s.charAt(i);
				String charToString = String.valueOf(a + ",");
				palabraModificada += charToString;

			} else {

				char a = s.charAt(i);
				String charToString = String.valueOf(a);
				palabraModificada += charToString;
			}
		}

		String[] partes = palabraModificada.split("\\,");
		// System.out.println(Arrays.asList(partes));
		return partes;
	}

	/**
	 * Kata 3 (Mejor solución):
	 * 
	 * @param s
	 * @return s.split("(?<=\\G.{2})");
	 */
	public class StringSplit {
		public static String[] solution(String s) {
			s = (s.length() % 2 == 0) ? s : s + "_";
			return s.split("(?<=\\G.{2})");
		}
	}

	// ---------------------Enunciado: Kata4---------------------//

	/**
	 * Annunciate:Complete the function that accepts a string parameter, and
	 * reverses each word in the string. All spaces in the string should be
	 * retained.
	 * 
	 * Anunciar: Complete la función que acepta un parámetro de cadena, y invierte
	 * cada palabra en la cadena. Todos los espacios en la cadena deben ser
	 * retenido.
	 * 
	 * Examples:
	 * 
	 * "This is an example!" ==> "sihT si na !elpmaxe" || "double spaces" ==>
	 * "elbuod secaps"
	 * 
	 */

	// ---------------------Soluciones: Kata4---------------------//

	/**
	 * 
	 * PRUEBA
	 * 
	 */
}
