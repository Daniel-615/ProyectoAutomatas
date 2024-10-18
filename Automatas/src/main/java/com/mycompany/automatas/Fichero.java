package com.mycompany.automatas;

import java.io.*;
/**
 * @author suyan
 * @author vale
 */
public class Fichero {

    
    public void leerArchivo(String nombre_archivo, Listas listas) {
        /*
            Método para leer el archivo almacenando en una lista.
        */
        try (BufferedReader br = new BufferedReader(new FileReader(nombre_archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                listas.AgregarLista(linea); 
            }
            //System.out.println("Elementos agregados desde el archivo: " + nombre_archivo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
