/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas_pilas;

import java.util.Scanner;

/**
 *
 * @author mafer
 */
public class Listas_Pilas {
    Scanner in = new Scanner(System.in);
    ListasPila lista = new ListasPila();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Listas_Pilas list = new Listas_Pilas();
        list.menu();
    }
    public void menu(){
        boolean  exit = false;
        int opcion;        
        
        while(!exit) {
            System.out.println("------------Bienvenido a Univerdidad San Pablo Guatemala-------------");
            System.out.println("Que desea realizar: \n"
                    + "1.Empujar un elemento en la pila\n"
                    + "2.sacar un elemento de la pila\n"
                    + "3.¿Esta la pila vacia?\n"
                    + "4.¿Que elemento esta en la cima ?\n"
                    + "5.Tamaño de la pila\n"
                    + "6.vaciar pila\n"
                    + "7.Mostrar\n"
                    + "8.introvertir\n"
                    + "9.Exit\n");
                  
            
            
            System.out.println("Please select an option");

            opcion = in.nextInt();
            switch(opcion) {

                case 1:  
                    add();
                    break;   

                case 2: 
                    if(!lista.estavacia()){
                    System.out.println("El elemento obtenido\n"+lista.sacar());                   
                    }
                    
                    else{
                        System.out.println("La pila esta vacia");
                    }                   
                    break;  
                    
                case 3: 
                    if (lista.estavacia()){
                        System.out.println("La pila esta vacia");
                        
                    }else {
                        System.out.println("La pila contiene datos");               
                    }              
                    break;  
                    
                case 4:  
                    if (!lista.estavacia()) {
                        System.out.println("El elemento que se encuentra en la cima es\n"+ lista.cima());
                        System.out.println("\npila vacia");
                        
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    
                   
                    break;    
                case 5:                     
                    System.out.println("El tamaño de la pila es\n" +  lista.tamanio());
                    System.out.println("Tamaño de la pila");
                    
                    break;                  
                case 6:
                    if (!lista.estavacia()) {
                        lista.limpiar();
                        System.out.println("La pila se ha vaciado");  
                    } else {
                    }
                    System.out.println("La pila esta vacia");        
                    
                    break; 
                    
                case 7:
                    lista.mostrarLista();
                    
                case 8:
                    introvertir();
                    
                case 9:
                    exit= true;
                    break;
                default: 
                    System.out.println("----------------Please select the correct option----------------");
                break;        
            } 
          }
    }
        
    public void add(){
        String elemento;    
        System.out.println("Ingresar un elemento a la pila");
        elemento = in.next();
        lista.push(elemento);
    }
    
    public void introvertir(){
    System.out.println("Ingrese una de palabra de su pila para ser introvertida");
        String elemento=in.next();
		// Esta será la cadena invertida, primero está vacía
        String invertida = "";
        // Recorremos la original del final al inicio
        for (int indice = elemento.length() - 1; indice >= 0; indice--) {
                // Y vamos concatenando cada carácter a la nueva cadena
            invertida += elemento.charAt(indice);
        }
        System.out.println("Original word: " + elemento);
        System.out.println("introvert word: " + invertida);
    }
}
