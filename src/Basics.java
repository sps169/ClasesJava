/*
    Coverage:
        - int, float, double, char, boolean
        - Clase String
        - arrays
        - logical operations (< > == !=)
        - casting
        - loops
        - conditions, switches

 */
public class Basics {
    public static void run(){
        /*
            Ejercicio 1: el metodo ej1 recibe un caracter y comprueba si es una letra del abecedario.
            Si es una letra, la letra se convierte en la siguiente letra del abecedario. En caso de no serlo,
            no se modifica. El resultado de la operación es devuelto por el método. No se contemplan los carácteres tildes.
         */
        System.out.println("Entra 'a' sale "+ ej1_solution('a'));
        System.out.println("Entra 'x' sale "+ ej1_solution('x'));
        System.out.println("Entra 'z' sale "+ ej1_solution('z'));
        System.out.println("Entra 'A' sale "+ ej1_solution('A'));
        System.out.println("Entra 'X' sale "+ ej1_solution('X'));
        System.out.println("Entra 'Z' sale "+ ej1_solution('Z'));
        System.out.println("Entra '1' sale "+ ej1_solution('1'));
        System.out.println("Entra '\\n' sale "+ ej1_solution('\n'));

        /*
            Ejercicio 2: aplica el enunciado anterior a una cadena de caracteres.
         */
        System.out.println("Entra \"Buenos dias\", sale \"" + ej2_solution("Buenos dias") + "\"");
        System.out.println("Entra \"Tengo 15 zebras, pero 3 huelen mal.\", sale \"" + ej2_solution("Tengo 15 zebras, pero 3 huelen mal.") + "\"");
        System.out.println();
        /*
            Ejercicio 3: recibes dos caracteres por parametro, devuelve una cadena
            que contenga todos los caracteres ascii comprendidos entre ellos (ambos incluidos).
            El orden es siempre de menor valor ascii a mayor, independientemente del orden de los parametros.
         */
        System.out.println("Entran 'a' y '0', sale: \""+ ej3_solution('a', '0') + "\"");
        System.out.println("Entran 'b' y 'z', sale: \""+ ej3_solution('b', 'z') + "\"");
        System.out.println("Entran 'A' y 'z', sale: \""+ ej3_solution('A', 'z') + "\"");
        System.out.println("Entran 'A' y 'A', sale: \""+ ej3_solution('A', 'A') + "\"");
        System.out.println();

        /*
            Ejercicio 4: Comprobar si un array de enteros recibido por parametro contiene exclusivamente
            numeros contenidos en el rango obtenido por parametro (dos enteros, ambos incluidos en el rango).
            Devuelve true o false. Solo se permite un return en el metodo.
         */
        System.out.println("Entra null, 1 y 2, sale: " + ej4_solution(null, 1, 2));
        System.out.println("Entra [0, 2, 3], 1 y 2, sale: " + ej4_solution(new int[]{0, 2, 3}, 1, 2));
        System.out.println("Entra [1, 2, 3], -1000 y 1000, sale: " + ej4_solution(new int[]{1, 2, 3}, -1000, 1000));
        System.out.println("Entra [1, 2, 3], 1 y 3, sale: " + ej4_solution(new int[]{1, 2, 3}, 1, 3));
        System.out.println("Entra [1, 2, 3], 1 y 2, sale: " + ej4_solution(new int[]{1, 2, 3}, 1, 2));
        System.out.println("Entra [], 1 y 10, sale: " + ej4_solution(new int[]{}, 1, 10));

        //EJERCICIOS BUCLES: TODOS LOS EJERCICIOS DEBEN TENER UNA SOLUCION CON FOR Y UNA SOLUCION CON WHILE
        /*
            Ejercicio Bucles 1: Imprimir todos los numeros desde a hasta b donde a y b son numeros enteros
            recibidos por parametro. El formato de la impresión debe ser n1, n2, n3, n4, ..., nx.
            (no hay coma al final)
         */

        /*
            Ejercicio Bucles 2: Imprimir el numero en la posicion n de la sucesión fibonacci. La sucesion
            fibonacci se logra sumando un numero al siguiente de la sucesion, tal y como se puede observar aqui:
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ..., siendo el resultado de n = 5 un 3 y de n = 7 un 8.
         */

        /*
            Ejercicio Bucles 3: Imprimir el resultado de la operación a elevado a la b, donde a y b son enteros
            pasados por parametro, a y b no pueden ser 0 a la vez (el codigo debe printear "Infinity") y b no
            puede ser negativo.
         */

        /*
            Ejercicio Bucles 4: Encuentra el maximo comun divisor entre a y b donde a y b son dos numeros naturales
            distintos de 0.
         */

        /*
            Ejercicio Bucles 5: Encuentra el minimo comun multiplo entre a y b donde a y b son dos numeros naturales
            distintos de 0.
         */



    }

    public static char ej1_solution(char letra){
        char nuevaLetra;

        if (letra >= 'a' && letra <= 'z'
                || letra >= 'A' && letra <= 'Z')
            if (letra == 'Z')
                nuevaLetra = 'A';
            else if (letra == 'z')
                nuevaLetra = 'a';
            else
                nuevaLetra = (char)(letra + 1);
        else
            nuevaLetra = letra;
        return nuevaLetra;
    }

    public static String ej2_solution(String cadena){
        String nuevaCadena = "";
        for (int i = 0; i < cadena.length(); i++) {
            nuevaCadena += ej1_solution(cadena.charAt(i));
        }
        return (nuevaCadena);
    }

    public static String ej3_solution(char caracter1, char caracter2){
        char minChar, maxChar;
        String cadenaFinal = "";

        if (caracter1 < caracter2) {
            minChar = caracter1;
            maxChar = caracter2;
        } else {
            minChar = caracter2;
            maxChar = caracter1;
        }

        for (int i = 0; i < maxChar - minChar + 1; i++) {
            cadenaFinal += (char)(minChar + i);
        }
        return cadenaFinal;
    }

    public static boolean ej4_solution(int[] array, int integer1, int integer2) {
        boolean result = true;
        int minInt;
        int maxInt;

        if (integer1 < integer2) {
            minInt = integer1;
            maxInt = integer2;
        } else {
            minInt = integer2;
            maxInt = integer1;
        }
        if (array != null && array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < minInt || array[i] > maxInt)
                    result = false;
            }
        } else
            result = false;
        return result;
    }
}
