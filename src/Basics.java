public class Basics {
    public static void run(){
        /*
            Ejercicio 1: el metodo ej1 recibe un caracter y comprueba si es una letra del abecedario.
            Si es una letra, la letra se convierte en la siguiente letra del abecedario. En caso de no serlo,
            no se modifica. El resultado de la operación se imprime por pantalla seguido de un salto de linea.
         */
    }

    public void ej1(char letra){
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
        System.out.println(nuevaLetra);
    }
}
