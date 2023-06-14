/**
 * Este clase sirve para generar números primos de 1 hasta un número máximo especificado por el usuario
 * @author Óscar González Escabias
 * @version 1.0.0
 */
public class Recuperacion_RA3_RA4
{
    /**
     * Este método sirve para generar los números primos de la clase
     * @param max Variable entera que se inicializa en 2 y sirve para indicar el tamaño de la array
     */
    public static int[] generarPrimos (int max)
    {
        int i,j;
        if (max >= 2) {


            // Declaraciones
            int dim = max + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[dim];

            // Inicializar el array
            for (i=0; i<dim; i++)
                esPrimo[i] = true;

            // Eliminar el 0 y el 1, que no son primos
            esPrimo[0] = esPrimo[1] = false;

            // Criba
            for (i=2; i<Math.sqrt(dim)+1; i++) {
                if (esPrimo[i]) {
                    // Eliminar los múltiplos de i
                    for (j=2*i; j<dim; j+=i)
                        esPrimo[j] = false;
                }
            }

            // ¿Cuántos primos hay?
            int cuenta = 0;
            for (i=0; i<dim; i++) {
                if (esPrimo[i])
                    cuenta++;
            }
            // Rellenar el vector de números primos
            int[] primos = new int[cuenta];
            for (i=0, j=0; i<dim; i++) {
                if (esPrimo[i])
                    primos[j++] = i;
            }

            return primos;

        } else { // max < 2

            return new int[0]; // Vector vacío
        }
    }
}
