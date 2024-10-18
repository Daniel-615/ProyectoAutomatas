package com.mycompany.automatas;

import java.util.Scanner;

public class Automatas {
    static Fichero fichero = new Fichero();
    static Listas listas = new Listas();
    public static int procesarCadena1(String cadena) {
        char estado = 'A';  // Estado inicial

        // Recorrer cada carácter de la cadena
        for (char caracter : cadena.toCharArray()) {
            switch (estado) {
                case 'A' -> {
                    if (caracter == 'a') {
                        estado = 'B';
                    } else if (caracter == 'b') {
                        estado = 'C';
                    }
                }
                case 'B' -> {
                    if (caracter == 'a') {
                        estado = 'B';
                    } else if (caracter == 'b') {
                        estado = 'D';
                    }
                }
                case 'C' -> {
                    if (caracter == 'a') {
                        estado = 'B';
                    } else if (caracter == 'b') {
                        estado = 'C';
                    }
                }
                case 'D' -> {
                    if (caracter == 'a') {
                        estado = 'B';
                    } else if (caracter == 'b') {
                        estado = 'E';
                    }
                }
                case 'E' -> {
                    if (caracter == 'a') {
                        estado = 'F';
                    } else if (caracter == 'b') {
                        estado = 'C';
                    }
                }
                case 'F' -> {
                    if (caracter == 'a') {
                        estado = 'B';
                    } else if (caracter == 'b') {
                        estado = 'G';
                    }
                }
                case 'G' -> {
                    if (caracter == 'a') {
                        estado = 'B';
                    } else if (caracter == 'b') {
                        estado = 'E';
                    }
                }
            }
        }

        // Verificar si termina en el estado de aceptación (G)
        return estado == 'G' ? 1 : 0;
    }
    public static int procesarCadena2(String cadena){
        char estado = 'A';  // Estado inicial
        for(char caracter : cadena.toCharArray()){
            switch(estado){
                case 'A'->{
                    if(caracter=='a'){
                        estado='B';
                    }
                }
                case 'B'->{
                    if(caracter=='b'){
                        estado='C';
                    }
                }
                case 'C'->{
                    if(caracter=='a'){
                        estado='D';
                    }
                }
                case 'D'->{
                    if(caracter=='b'){
                        estado='E';
                    }
                }
                case 'E'->{
                    if(caracter=='b'){
                        estado='F';
                    }
                }
                case 'F'->{
                    if(caracter=='a'){
                        estado='G';
                    }else if(caracter=='b'){
                        estado='H';
                    }
                }
                case 'G'->{
                    if(caracter=='a'){
                        estado='G';
                    }else if(caracter=='b'){
                        estado='H';
                    }
                }
                case 'H'->{
                    if(caracter=='a'){
                        estado='G';
                    }else if(caracter=='b'){
                        estado='H';
                    }
                }
            }
        }
         return estado == 'H' ? 2 : 0;
    }
    // Definir los otros métodos (procesarCadena2, procesarCadena3, etc.)...
    /*public static int procesarCadena2(String cadena) {
        int estado = 0;  
        for (int i = 0; i < cadena.length(); i++) {
            char simbolo = cadena.charAt(i);

            switch(estado){
                case 0 -> { // Espera encontrar la primera 'a' para comenzar (ab)+
                    if (simbolo == 'a') {
                        estado = 1; // Transición al estado que busca 'b'
                    } else {
                        return 0; // Cadena no válida si no empieza con 'a'
                    }
                }
                case 1 -> { // Espera encontrar 'b' después de 'a' para completar 'ab'
                    if (simbolo == 'b') {
                        estado = 2; // Encontró 'ab', puede continuar con la secuencia
                    } else {
                        return 0; // Cadena no válida si no sigue con 'b'
                    }
                }
                case 2 -> { // Verifica si continúa con 'abb'
                    if (simbolo == 'a') {
                        estado = 3; // Comienza 'ab' para 'abb'
                    } else {
                        return 0; // Debe seguir con 'a' para continuar la secuencia
                    }
                }
                case 3 -> { // Después de 'a', espera una 'b' para completar 'abb'
                    if (simbolo == 'b') {
                        estado = 4; // Encontró 'ab', espera otra 'b'
                    } else {
                        return 0; // No es válido si no sigue con 'b'
                    }
                }
                case 4 -> { // Después de 'ab', espera una segunda 'b' para completar 'abb'
                    if (simbolo == 'b') {
                        estado = 5; // Secuencia 'abb' completada
                    } else {
                        return 0; // No es válido si no sigue con 'b'
                    }
                }
                case 5 -> { // Después de 'abb', puede aceptar cualquier 'a' o 'b'
                    if (simbolo == 'a' || simbolo == 'b') {
                        estado = 5; // Permanece en este estado mientras consume 'a' o 'b'
                    } else {
                        return 0; // No válido si no es 'a' o 'b'
                    }
                }
                default -> {
                    return 0; // Cualquier otro estado no es válido
                }
            }
        }
    // La cadena es válida si terminó en el estado 5 (después de abb y consumiendo (a|b)*)
        return (estado == 5) ? 2 : 0;
    }
    */
    public static int procesarCadena3(String cadena) {
        return 0; 
    }
    public static int procesarCadena4(String cadena) {
        return 0; 
    }
    public static int procesarCadena5(String cadena) {
        return 0; 
    }

    public static void lecturaArchivo(String nombre_archivo) {
        fichero.leerArchivo(nombre_archivo, listas);
    }

    public static void evaluarCadenas(Listas listas) {
        for (String cadena : listas.getLista()) {
            int aceptada = procesarCadena1(cadena) + procesarCadena2(cadena) + procesarCadena3(cadena) + procesarCadena4(cadena) + procesarCadena5(cadena);
            
            if (aceptada > 0) {
                System.out.println("La cadena \"" + cadena + "\" es aceptada por el automata "+aceptada+".");
            } else {
                System.out.println("La cadena \"" + cadena + "\" no es aceptada por ningun automata.");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String ruta = "F:\\Progra\\Universidad\\Proyectos\\Expresiones Regulares\\Automatas\\src\\main\\java\\com\\mycompany\\automatas\\";
            System.out.print("Cual es el nombre del archivo? ");
            String nombre = scanner.nextLine();
            lecturaArchivo(ruta + nombre);
            
            if (!listas.getLista().isEmpty()) {
                evaluarCadenas(listas);
            } else {
                System.out.println("Error al leer el archivo o archivo vacío.");
            }
        }
    }
}
