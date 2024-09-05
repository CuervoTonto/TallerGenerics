package co.edu.uniquindio.Ejercicio2;

import java.util.HashSet;

public class MiConjunto<E>
{
    private HashSet<E> conjunto;

    public MiConjunto()
    {
        this.conjunto = new HashSet<>();
    }

    public void agregar(E e)
    {
        this.conjunto.add(e);
    }

    public void Eliminar(E e)
    {
        this.conjunto.remove(e);
    }

    public boolean comprobar(E e)
    {
        return this.conjunto.contains(e);
    }
}