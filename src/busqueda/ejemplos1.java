/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

import java.util.Arrays;

/**
 *
 * @author cissanal
 */
public class ejemplos1 {
    public static void main(String[] args) {
        int[] array={21,2,3,54,5,6};
        int posicion=Arrays.binarySearch(array, 99);
        System.out.println(posicion);
        
        int[]numeros=new int[10];
        Arrays.fill(numeros, -1);
        System.out.println(Arrays.toString(numeros));
        
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
        
    }
}
