import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        int suma = 0;
        for (int num :numeros)  {
            suma += num;
        }

        int contadorPares = 0;
        for (int num : numeros ) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }

        boolean tienePares = false;
        for (int num : numeros) {
            if (num % 2 == 0 ) {
                tienePares = true;
                break;
            }
        }
        System.out.println("Elemento de la psoicion 1 es: " + numeros.get(1));
        System.out.println("El tamaño de la lista es: " + numeros.size());
        System.out.println("La suma de la lista es: " + suma);
        System.out.println("Cantidad de numeros pares: " + contadorPares);
        System.out.println("¿La lista tiene al menos un numero Par?: " + tienePares);
    }
}