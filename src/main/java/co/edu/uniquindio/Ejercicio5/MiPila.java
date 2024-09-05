package co.edu.uniquindio.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class MiPila<E>
{
    private List<E> elementos;

    public MiPila()
    {
        this.elementos = new ArrayList<>();
    }

    public void push(E e)
    {
        this.elementos.add(e);
    }

    public E pop()
    {
        E e = this.elementos.get(this.elementos.size() - 1);
        this.elementos.remove(this.elementos.size() - 1);

        return e;
    }

    public E peek()
    {
        return this.elementos.get(this.elementos.size() - 1);
    }
}