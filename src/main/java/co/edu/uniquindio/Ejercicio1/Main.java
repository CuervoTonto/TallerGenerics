package co.edu.uniquindio.Ejercicio1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> enlazada = new LinkedList<>();

        llenarConEnteros(array, 100);
        llenarConEnteros(enlazada, 100);

        long insercion = (long) 0;
        long remocion = (long) 0 ;
        long accesso = (long) 0;

        insercion = tomarTiempo(() -> array.set(50, 500));
        remocion = tomarTiempo(() -> array.remove(50));
        accesso = tomarTiempo(() -> array.get(50));


        System.out.println("# ArrayList -------------------");
        System.out.println("    insercion: " + insercion + "ns");
        System.out.println("    remocion : " + remocion + "ns");
        System.out.println("    accesso  : " + accesso + "ns");

        insercion = tomarTiempo(() -> enlazada.set(50, 500));
        remocion = tomarTiempo(() -> enlazada.remove(50));
        accesso = tomarTiempo(() -> enlazada.get(50));

        System.out.println("# LinkedList -------------------");
        System.out.println("    insercion: " + insercion + "ns");
        System.out.println("    remocion : " + remocion + "ns");
        System.out.println("    accesso  : " + accesso + "ns");
    }

    private static void llenarConEnteros(List<Integer> lista, int tope)
    {
        for (int i = 1; i <= tope; i++) lista.add(i);
    }

    private static long tomarTiempo(Runnable action)
    {
        long inicio = System.nanoTime();
        action.run();

        return System.nanoTime() - inicio;
    }
}