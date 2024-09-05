package co.edu.uniquindio.Ejercicio4;

public class Caja<T>
{
    private T elemento;
    private boolean ocupado;

    public Caja()
    {
        this.ocupado = false;
    }

    public boolean poner(T elemento)
    {
        if (this.ocupado) return false;

        this.elemento = elemento;
        this.ocupado = true;

        return true;
    }

    public T sacar()
    {
        T elemento = this.elemento;
        this.elemento = null;
        this.ocupado = false;

        return elemento;
    }
}