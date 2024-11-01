package com.mycompany.automatas;
/*
@author vale
@author suyan
*/
import java.util.Scanner;

public class Automatas {
    static Fichero fichero = new Fichero();
    static Listas listas = new Listas();
    public static int procesarCadena1(String cadena) {
        char estado = 'A';  
        char estado_final='G';
        
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
                        estado = 'F';
                    } else if (caracter == 'b') {
                        estado = 'E';
                    }
                }
            }
        }
        return (estado == estado_final) ? 1 : 0;
    }
    
    public static int procesarCadena2(String cadena) {
        char estado = 'A';
        for (char caracter : cadena.toCharArray()) {
            switch (estado) {
                case 'A' -> { 
                    if (caracter == 'a') {
                        estado = 'B';
                    }
                }
                case 'B' -> {
                    if (caracter == 'b') {
                        estado = 'C';
                    }
                }
                case 'C' -> {  
                    if (caracter == 'a') {
                        estado = 'D'; 
                    } 
                }
                case 'D' -> {  
                    if (caracter == 'b') {
                        estado = 'E';
                    }
                }
                case 'E' -> {  
                    if (caracter=='a'){
                        estado='D';
                    }else if(caracter=='b'){
                        estado='F';
                    }
                }
                case 'F' -> {  
                    if(caracter=='b'){
                        estado='H';
                    }else if(caracter=='a'){
                        estado='G';
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
                    if(caracter=='b'){
                        estado='H';
                    }else if(caracter=='a'){
                        estado='G';
                    }
                }
            }
        }
        return (estado == 'H' || estado=='F' || estado=='G') ? 2 : 0;  
    } 
    
    public static int procesarCadena3(String cadena) {
        char estado = 'A';  
        char estado_final='L';
        for (char caracter : cadena.toCharArray()) {
            switch (estado) {
                case 'A' -> { 
                    if(caracter=='a'){
                        estado='B';
                    }else if(caracter=='b'){
                        estado='C';
                    }
                }
                case 'B' -> {
                    if(caracter=='a'){
                        estado='D';
                    }
                }
                case 'C' -> {  
                    if(caracter=='a'){
                        estado='D';
                    }
                }
                case 'D' -> {  
                   if(caracter=='b'){
                       estado='E';
                   }
                }
                case 'E' -> {  
                   if(caracter=='b'){
                       estado='F';
                   }
                }
                case 'F' -> {  
                   if(caracter=='a'){
                       estado='G';
                   }
                }
                case 'G'->{
                    if(caracter=='a'){
                        estado='H';
                    }else if(caracter=='b'){
                        estado='I';
                    }
                }
                case 'H'->{
                    if(caracter=='a'){
                        estado='J';
                    }else if(caracter=='b'){
                        estado='K';
                    }
                }
                case 'I'->{
                    if(caracter=='a'){
                        estado='G';
                    }
                }
                case 'J'->{
                    if(caracter=='a'){
                        estado='H';
                    }
                }
                case 'K'->{
                    if(caracter=='b'){
                        estado='L';
                    }
                }
                case 'L'->{
                    if(caracter=='b'){
                        estado='H';
                    }
                }
            }
        }
        return (estado == estado_final) ? 3 : 0;  
    } 
    
    public static int procesarCadena4(String cadena) {
        char estado = 'A';  
        char estado_final='I';
        for (char caracter : cadena.toCharArray()) {
            switch (estado) {
                case 'A'->{
                    if(caracter=='0'){
                        estado='B';
                    }
                }
                case 'B'->{
                    if(caracter=='1'){
                        estado='C';
                    }
                }
                case 'C'->{
                    if(caracter=='0'){
                        estado='B';
                    }else if(caracter=='1'){
                        estado='D';
                    }
                }
                case 'D'->{
                    if(caracter=='0'){
                        estado='E';
                    }else if(caracter=='1'){
                        estado='F';
                    }
                }
                case 'E'->{
                    if(caracter=='0'){
                        estado='G';
                    }else if(caracter=='1'){
                        estado='F';
                    }
                }
                case 'F'->{
                    if(caracter=='0'){
                        estado='E';
                    }else if(estado=='1'){
                        estado='F';
                    }
                }
                case 'G'->{
                    if(caracter=='0'){
                        estado='H';
                    }else if(caracter=='1'){
                        estado='F';
                    }
                }
                case 'H'->{
                    if(caracter=='0'){
                        estado='H';
                    }else if(caracter=='1'){
                        estado='I';
                    }
                }
                case 'I'->{
                    if(caracter=='0'){
                        estado='J';
                    }else if(caracter=='1'){
                        estado='F';
                    }
                }
                case 'J'->{
                    if(caracter=='0'){
                        estado='G';
                    }else if(caracter=='1'){
                        estado='I';
                    }
                }
            }
        }
        return (estado==estado_final) ? 4 : 0;
    }
    public static int procesarCadena5(String cadena) {
        char estado = 'A';
        for (char caracter : cadena.toCharArray()) {
            switch (estado) {
                case 'A'->{
                    if(caracter=='1'){
                        estado='B';
                    }
                }
                case 'B'->{
                    if(caracter=='1'){
                        estado='C';
                    }
                }
                case 'C'->{
                    if(caracter=='0'){
                        estado='D';
                    }
                }
                case 'D'->{
                    if(caracter=='0'){
                        estado='E';
                    }else if(caracter=='1'){
                        estado='F';
                    }
                }
                case 'E'->{
                    if(caracter=='0'){
                        estado='E';
                    }else if(caracter=='1'){
                        estado='G';
                    }
                }
                case 'F'->{
                    if(caracter=='0'){
                        estado='E';
                    }else if(caracter=='1'){
                        estado='F';
                    }
                }
                case 'G'->{
                    if(caracter=='0'){
                        estado='E';
                    }else if(caracter=='1'){
                        estado='H';
                    }
                }
                case 'H'->{
                    if(caracter=='0'){
                        estado='I';
                    }else if(caracter== '1'){
                        estado='F';
                    }
                }
                case 'I'->{
                    if(caracter=='0'){
                        estado='J';
                    }else if(caracter=='1'){
                        estado='G';
                    }
                }
                case 'J'->{
                    if(caracter=='0'){
                        estado='I';
                    }
                }
            }
        }    
        return estado=='J' ? 5 : 0;
    }

    public static void lecturaArchivo(String nombre_archivo) {
        fichero.leerArchivo(nombre_archivo, listas);
    }

    public static void evaluarCadenas(Listas listas) {
        for(String cadena: listas.getLista()){
            int aceptada=0;
            if(procesarCadena1(cadena)==1){
                aceptada=1;
            }else if(procesarCadena2(cadena)==2){
                aceptada=2;
            }else if(procesarCadena3(cadena)==3){
                aceptada=3;
            }else if(procesarCadena4(cadena)==4){
                aceptada=4;
            }else if(procesarCadena5(cadena)==5){
                aceptada=5;
            }
            if (aceptada > 0) {
                System.out.println("La cadena \"" + cadena + "\" es aceptada por el automata " + aceptada + ".");
            } else {
                System.out.println("La cadena: \"" + cadena );
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