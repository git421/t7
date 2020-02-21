/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

/**
 *
 * @author cissanal
 */
public class Datos {

    
    
    public static void main(String[] args) {
        int[] arrayDatos;
        arrayDatos = new int[10];
        int suma=0;

        for (int i = 0; i < arrayDatos.length; i++) {
            int r = (int) Math.round(Math.random()*1000);
            arrayDatos[i]=r;
        }
        System.out.println("Pares:");
        for (int i = 0; i < arrayDatos.length; i=i+2) {
            System.out.println(arrayDatos[i]);
            suma=suma+arrayDatos[i];
        }
        System.out.println("Suma: "+suma);
        
        
        
    }
}
