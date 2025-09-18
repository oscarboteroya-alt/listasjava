import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
        // Suma de valores con foreach
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        // Contar números pares
        int contadorPares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }
        // Verificar si hay al menos un número par
        boolean tienePares = false;
        for (int num : numeros) {
            if (num % 2 == 0) {
                tienePares = true;
                break;
            }
        }
        // Mostrar resultados de la lista de números
        System.out.println("Elemento de la posición 1 es: " + numeros.get(1));
        System.out.println("El tamaño de la lista es: " + numeros.size());
        System.out.println("La suma de la lista es: " + suma);
        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("¿La lista tiene al menos un número par?: " + tienePares);

        // LISTA DE NOMBRES
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("María");
        nombres.add("Luis");
        nombres.add("Sofía");

        // Imprimir usando for
        System.out.println("\nImprimiendo nombres con FOR:");
        for (String s : nombres) {
            System.out.println(s);
        }

        // Imprimir usando foreach
        System.out.println("\nImprimiendo nombres con FOREACH:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Imprimir usando while
        System.out.println("\nImprimiendo nombres con WHILE:");
        int i = 0;
        while (i < nombres.size()) {
            System.out.println(nombres.get(i));
            i++;
        }
    }
}