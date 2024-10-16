package com.mycompany.automatas;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    private final List<String> lista = new ArrayList<>();

    public void AgregarLista(String elemento) {
        /*
            Agrega un elemento al arrayList
        */
        
        lista.add(elemento);
        System.out.println("Elemento agregado: " + elemento);
    }
    public void buscarLista(String elemento) {
        /*
            Busca el elemento en el arrayList
        */
        int indice = lista.indexOf(elemento);
        if (indice != -1) {
            System.out.println("El elemento '" + elemento + "' se encuentra en la posición " + indice);
        } else {
            System.out.println("El elemento '" + elemento + "' no se encuentra en la lista.");
        }
    }
    
    public void imprimirLista() {
        /*
            Método para imprimir la lista.
        */
        
        System.out.println("Lista completa: ");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
    public List<String> getLista() {
        /*
            Devuelve la lista completa.
        */
        return lista;
    }
}