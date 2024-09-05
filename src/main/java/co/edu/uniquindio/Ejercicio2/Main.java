package co.edu.uniquindio.Ejercicio2;

public class Main
{
    public static void main(String[] args)
    {
        MiConjunto<String> miConjunto = new MiConjunto<>();

        System.out.println("Se agregan \"Pedro\" y \"Juan\" al conjunto");

        miConjunto.agregar("Pedro");
        miConjunto.agregar("Juan");

        System.out.print("Se comprueba la existencia de \"Pedro\" en el conjunto => ");
        System.out.println(miConjunto.comprobar("Pedro") ? "Existe" :  "No Existe");

        System.out.println("Se remueve a \"Pedro\" del conjunto");
        miConjunto.Eliminar("Pedro");

        System.out.print("Se comprueba la existencia de \"Pedro\" en el conjunto => ");
        System.out.println(miConjunto.comprobar("Pedro") ? "Existe" :  "No Existe");
    }
}