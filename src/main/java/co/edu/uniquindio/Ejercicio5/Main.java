package co.edu.uniquindio.Ejercicio5;

public class Main
{
    public static void main(String[] args)
    {
        MiPila<String> pila = new MiPila<>();
        pila.push("juan");
        pila.push("pedro");
        pila.push("diana");

        // vista al elemento en la cima
        System.out.println(pila.peek());
        // desapilar el elemento en la cima
        System.out.println(pila.pop());
        // desapilar el elemento en la cima
        System.out.println(pila.pop());
        // vista al elemento en la cima
        System.out.println(pila.peek());
    }
}