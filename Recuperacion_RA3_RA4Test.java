
public class Recuperacion_RA3_RA4Test {
    public static void main(String[] args) {
        testGenerarPrimosPositivos();
        testGenerarPrimosNegativos();
        testGenerarPrimoCero();
    }

    public static void testGenerarPrimosPositivos() {
        int max = 3;
        int[] expected = {2, 3};
        int[] actual = Recuperacion_RA3_RA4.generarPrimo(max);
        assertArrayEquals(expected, actual);
        System.out.println("Test 'testGenerarPrimosPositivos' pasado");
    }
    public static void testGenerarPrimosNegativos() {
        int max = -3;
        int[] expected = {};
        int[] actual = Recuperacion_RA3_RA4.generarPrimo(max);
        assertArrayEquals(expected, actual);
        System.out.println("Test 'testGenerarPrimosNegativos' pasado");
    }
    public static void testGenerarPrimoCero() {
        int max = 0;
        int[] expected = {};
        int[] actual = Recuperacion_RA3_RA4.generarPrimo(max);
        assertArrayEquals(expected, actual);
        System.out.println("Test 'testGenerarPrimoCero' pasado");
    }

    public static void assertArrayEquals(int[] expected, int[] actual) {
        if (expected.length != actual.length) {
            return;
        }
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != actual[i]) {
                return;
            }
        }
    }
}
