/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma.de.colas;

import java.util.Scanner;
import java.util.LinkedList;

/**
 *
 * @author mafer
 */
public class SumaDeColas {
    Scanner leer = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    Cola colaA = new Cola();
    Cola colaB = new Cola();
    Cola resultado = new Cola();


        public void menu(){
        boolean salir = false;
        int opcion;
        
        while(!salir){
            
           System.out.println("1. Agregar 1");
           System.out.println("2. Mostrar 2");
           System.out.println("3. Esta vacía? 3");
           System.out.println("4. Quien esta arriba 4");
           System.out.println("5. Tamaño 5");
           System.out.println("6. Sumar colas 6");
           System.out.println("7. exit 7");
           System.out.println("Escribe una de las opciones:");
           opcion = in.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("Cola A");
                   colaA.push(false,0);
                   System.out.println("Cola B");
                   colaB.push(false,0);
                   break;
                           
               case 2:
                    System.out.println("Cola A");
                    colaA.pop();
                    System.out.println("Cola B");
                    colaB.pop();
                   break;
                case 3:
                   System.out.println("Cola 1");
                   System.out.println(" Esta vacía? " + colaA.isEmpty());
                   System.out.println("Cola 2");
                   System.out.println(" Esta vacía? " + colaB.isEmpty());
                   break;
                case 4:
                   if(!colaA.isEmpty()){
                        System.out.println("Cola 1 Esta vacía? ");
                        System.out.println(colaA.inicio());
                    }else{
                        System.out.println("Cola 1 Esta vací?");
                    }
                   if(!colaB.isEmpty()){
                        System.out.println("Cola 2 Esta vacía? ");
                        System.out.println(colaB.inicio());
                    }else{
                        System.out.println("Cola 2 Esta vacía");
                    }
                   break;
                case 5:
                   System.out.println("Tamaño cola 1; " + colaA.size());
                   System.out.println("Tamaño cola 2: " + colaB.size());
                   break;
                case 6:
                    
                    sumar();
                   break;
                case 7:
                   salir=true;
                   System.out.println("Programa terminado");
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
    
    
            }
        }
    }   
    public void prueba(){
        
    
    }
    public void sumar(){
        int r;
        resultado = new Cola();
        Nodo NcolaA = new Nodo();
        Nodo NcolaB = new Nodo();
        NcolaA = colaA.inicio;
        if(NcolaA != null && NcolaB != null){
            for(int i = 0; i < colaA.size();i++){
                    NcolaB = colaB.inicio;
                for(int y = 0; y < colaB.size();y++){
                        if(i==y){
                        r = NcolaA.dato + NcolaB.dato;
                        resultado.push(true, r);
                    }
                    NcolaB = NcolaB.siguiente;
                }
                NcolaA = NcolaA.siguiente;
                      
            }
            System.out.println("Resultado");
            resultado.pop();
        }else{
            System.out.println("Las colas estan vacias");
        }
    }
    
    public static void main(String[] args) {
        SumaDeColas Colas = new SumaDeColas();
        Colas.menu();
    } 
}
