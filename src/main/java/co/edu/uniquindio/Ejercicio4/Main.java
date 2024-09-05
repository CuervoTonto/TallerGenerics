package co.edu.uniquindio.Ejercicio4;

public class Main
{
    public static void main(String[] args)
    {
        Caja<Integer> miCaja = new Caja<>();

        miCaja.poner(12);
        miCaja.poner(23);
        miCaja.poner(52);

        System.out.println(miCaja.sacar());
        System.out.println(miCaja.sacar());
    }
}