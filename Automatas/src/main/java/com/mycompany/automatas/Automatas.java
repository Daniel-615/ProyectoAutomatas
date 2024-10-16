package com.mycompany.automatas;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

/**
 * @author suyan
 * @author vale
 */
public class Automatas {
    //Importación de clases fichero y listas
    static Fichero fichero = new Fichero();
    static Listas listas = new Listas();
    
    //expresiones regulares
    static String[] expresiones = {
        "(a|b)*abb(ab)+",
        "(ab)+abb(a|b)*(a|b)*",
        "(a|b)abb(ab)*(aa)+(bb)+",
        "(01)+1(0|1)*00(01)+",
        "110(0|1)*011(00)+"
    };
    
    public static void lecturaArchivo(String nombre_archivo) {
        /*
            Llamada al método leerArchivo.
        */
        fichero.leerArchivo(nombre_archivo, listas);  
    }

    public static void expresionRegular(Listas listas) {
        /*
            Método para evaluar si la expresion regular es reconocida.
        */
        
        //itera cada elemento de la lista y lo obtiene por String cadena.
        for (String cadena : listas.getLista()) {
            
            boolean coincidencia = false;

            //itera las expresiones regulares y las evalúa con el patrón viendo si coinciden.
            for (String patron : expresiones) {
                Pattern expresion = Pattern.compile(patron);
                Matcher matcher = expresion.matcher(cadena);

                //En dado caso coincidan retorna true.
                if (matcher.matches()) {
                    System.out.println("La cadena \"" + cadena + "\" coincide con la expresion regular: " + patron);
                    coincidencia = true;
                    break;
                }
            }
            //Si es false entra a este if devolviendo un mensaje que no coinciden las expresiones.
            if (!coincidencia) {
                System.out.println("La cadena \"" + cadena + "\" no coincide con ninguna expresion regular.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //F:\Progra\Universidad\Proyectos\Expresiones Regulares\Automatas\src\main\java\com\mycompany\automatas\cadenas.txt
        System.out.print("Cual es el nombre del archivo? ");
        String nombre = scanner.nextLine();
        lecturaArchivo(nombre);

       
        if (!listas.getLista().isEmpty()) {
            expresionRegular(listas);
        } else {
            System.out.println("Error al leer el archivo o archivo vacio.");
        }

        scanner.close();
    }
}
