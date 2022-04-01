/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_pilas;

/**
 *
 * @author mafer
 */
public class ListasPila {
    private Nodo cima ;
    String tamano;
    String Lista = "";
    public ListasPila (){
        cima=null;
        tamano="";
    }
    // pilas esta vacia 
    public boolean estavacia(){
        return cima==null;
    }
    //inseratar un elemento en la pila PUSH 
    public void push(String elemento){
        Nodo nuevo = new Nodo(elemento);
        nuevo.siguiente=cima;
        cima=nuevo;       
    }
    // para sacar popo un elemento den la pila 
    public String sacar(){
        String auxiliar=cima.dato;
        cima=cima.siguiente;
        return auxiliar;
    }
    //Metodo para saber quien esta encima de la pila
    public String cima(){
        return cima.dato;
    }
    //pafra saber eltamano de la pila
    public String tamanio(){
        return tamano;
    }
    public void limpiar(){
    while(!estavacia()){
           sacar();
    }
   }
    public void mostrarLista(){
        Nodo auxiliar = this.cima;
        while(auxiliar != null){
            Lista += auxiliar.dato + "\n";
            auxiliar=auxiliar.siguiente;
        }
        System.out.println(Lista);
        Lista = "";
    }
}
