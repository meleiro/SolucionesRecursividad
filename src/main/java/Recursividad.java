public class Recursividad {

    // 1. MCD usando el algoritmo de Euclides por restas
    public static int mcd(int a, int b) {
        // Caso base
        if (a == b) {
            return a;
        }
        // Paso recursivo
        if (a > b) {
            return mcd(a - b, b);
        } else {
            return mcd(a, b - a);
        }
    }

    // 2. Comprobar si una cadena es palíndromo
    public static boolean esPalindromo(String s) {
        s = s.replace(" ", "").toLowerCase(); // limpiar cadena
        return esPalindromoRec(s, 0, s.length() - 1);
    }

    private static boolean esPalindromoRec(String s, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        return esPalindromoRec(s, i + 1, j - 1);
    }

    // 3. Sumar los elementos de un array
    public static int suma(int[] array) {
        return sumaRec(array, 0);
    }

    private static int sumaRec(int[] array, int i) {
        if (i == array.length) {
            return 0;
        }
        return array[i] + sumaRec(array, i + 1);
    }

    // 4. Invertir un array de enteros
    public static void invertir(int[] array) {
        invertirRec(array, 0, array.length - 1);
    }

    private static void invertirRec(int[] array, int i, int j) {
        if (i >= j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        invertirRec(array, i + 1, j - 1);
    }

    // 5. Devolver el menor elemento de un array
    public static int menorElemento(int[] array) {
        return menorElementoRec(array, 0, array[0]);
    }

    private static int menorElementoRec(int[] array, int i, int menor) {
        if (i == array.length) {
            return menor;
        }
        if (array[i] < menor) {
            menor = array[i];
        }
        return menorElementoRec(array, i + 1, menor);
    }

    // MAIN DE PRUEBA
    public static void main(String[] args) {

        // Prueba 1: MCD
        System.out.println("MCD(48, 18) = " + mcd(48, 18));

        // Prueba 2: palíndromo
        System.out.println("¿'anilina' es palíndromo? " + esPalindromo("anilina"));
        System.out.println("¿'Hola' es palíndromo? " + esPalindromo("Hola"));

        // Prueba 3: suma de array
        int[] numeros = {3, 5, 7, 2, 8};
        System.out.println("Suma del array = " + suma(numeros));

        // Prueba 4: invertir array
        invertir(numeros);
        System.out.print("Array invertido: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Prueba 5: menor elemento
        System.out.println("Menor elemento del array = " + menorElemento(numeros));
    }
}
