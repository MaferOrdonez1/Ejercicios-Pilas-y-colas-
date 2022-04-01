/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author mafer
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introdusca los parentesis a utilizar");
        Scanner in= new Scanner(System.in); //donde guardamos los datos en ese caso sera de tipo string porque son parentesis
        String entrada=in.next();
        Stack <Character>pila = new <Character>Stack(); //stack es una funcion nos sirve para que el usuario no diga un n de veces 
        int i= 0; //aca inicializamos una variable llamada i para que nos recorra los parentesis
        int tamanio=entrada.length(); //aca nos recorrera el tamanio hasta dodne termine el numero de vecs que hizo
            while(i<tamanio){
                if(entrada.charAt(i)=='(')
                   pila.push('('); //nso agrega un nuevo parentesis a la pila 
                else {
                      if (pila.isEmpty())   //si pila esta vacia es porq no tiene nada asi lo rompe
                          break;
                      else 
                          pila.pop();  // y si tiene que valla eliminando 
                }   
                i++;     //aca ira inicializando one by one 
            } 
            if (pila.isEmpty() && i==tamanio)   // si la pila no tien nada pero el el inicializado i llego al n de veces que elegi que se aocrrecto

               System.out.print("correcta\n");

            else 
               System.out.print("No correcta\n");     // si no falso
        }

    }