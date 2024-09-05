package co.edu.uniquindio.Ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, Integer> mapa = new HashMap<>();

        List<String> lineas = leerArchivo("src/main/resources/Ejercicio3.txt");
        Iterator<String> lineasIt = lineas.listIterator();

        while (lineasIt.hasNext()) {
            String linea = lineasIt.next();
            String[] palabras = linea.split(" ");

            for (int i = 0; i < palabras.length; i++) {
                if (mapa.containsKey(palabras[i])) {
                    mapa.put(palabras[i], mapa.get(palabras[i]) + 1);
                } else {
                    mapa.put(palabras[i], 1);
                }
            }
        }

        mapa.forEach((w, t) -> System.out.println(w + " => " + t));
    }

    private static List<String> leerArchivo(String direccion) throws IOException
    {
        return Files.readAllLines(new File(direccion).toPath());
    }
}