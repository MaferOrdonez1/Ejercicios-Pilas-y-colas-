/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma.de.colas;

import java.util.Scanner;

/**
 *
 * @author mafer
 */
public class Cola {
    Nodo inicio,fin;
    int tamaño;
    Scanner teclado = new Scanner(System.in);

    
    public Cola(){
        inicio=fin=null;
        tamaño=0;
    }
   
    public boolean isEmpty(){
        return inicio == null;
    }
   
    public void push(boolean esResultado, int recibido){
        Nodo nuevo = new Nodo();
        if(!esResultado){
            System.out.println("Ingrese dato:");
            nuevo.dato = teclado.nextInt();
        }else{
            nuevo.dato=recibido;
        }
        if(isEmpty()){
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamaño++;
    }
   
    public void pop(){
        Nodo actual = new Nodo();
        actual=inicio;
        if(inicio != null){
            while(actual != null){
                System.out.println(" "+ actual.dato);
                actual = actual.siguiente;
            
            }
        }else{
            System.out.println("Esta vacia");
        }
    }
   
    public int inicio(){
        return inicio.dato;
    }
   
    public int size(){
        return tamaño;
    }
    
}


