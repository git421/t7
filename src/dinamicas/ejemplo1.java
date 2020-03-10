/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cissanal
 * ejemplo de uso de ArrayList
 */
public class ejemplo1 {
    public static void main(String[] args) {
        
        List <String> lista = new LinkedList<>();//Podemos usar ArrayList, o mejor
        //Lo pasamos a List (la capa anterior de la herencia) para tener codigo generico
        //aka le pasamos el tipo de coleccion en el new, el contenedor se deja generico para que pueda funcionar con cualquier coleccion
        
        System.out.println("Esta vacia? " + lista.isEmpty());
        lista.add(new String("uno"));
        lista.add(new String("dos"));
        lista.add(new String("tres"));
        System.out.println(lista);
        System.out.println(lista.size());
        
        ArrayList <String> lista2 = new ArrayList<>();
        lista2.add(new String("cuatro"));
        lista2.add(new String("cinco"));
        
        lista.addAll(lista2);
        System.out.println(lista);
        
        lista.add(0, "cero");
        System.out.println(lista);
        
        System.out.println(lista.set(0, "0")); //el set no solo reemplaza, devuelve el valor que hubiera anteriormente
        System.out.println(lista);
        
        System.out.println("Esta la cadena ocho? " +lista.contains("ocho"));
        System.out.println("Posicion de la cadena dos? " + lista.indexOf("dos"));
        
        System.out.println("Objeto de la posicion 3: "+lista.get(2));
        System.out.println("Eliminamos la cadena '0': " +lista.remove("0"));
        System.out.println(lista);
        
        System.out.println("Eliminamos la cadena de la posicion 3: " +lista.remove(2));
        System.out.println(lista);
        
        //recorremos el ArrayList
        lista.forEach((s) -> {
            System.out.println(s+" longitud: "+s.length());
        });
        
        Iterator<String> it=lista.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s+" longitud: "+s.length());
        }
        
        
        
        
        
        
        
        
        
    }
}
