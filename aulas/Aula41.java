package aulas;

import libs.Vetores;

public class Aula41 {
    public static void aula(){
        System.out.println(" ##  radix sort ##");

        ex01();
       
    }



    public static void ex01(){

        int  meio;

        int[] v_0 = { 27,19,21,12,92,71,05};
        System.out.println("entrada");
        Vetores.mostrar(v_0);
        int[] v0_ordenado =  Vetores.radixSort(v_0);
        Vetores.mostrar(v0_ordenado);

        int [] v1 = {21,71,12,92,5,27,19,2};
        System.out.println("entrada");
        Vetores.mostrar(v1);
        int[] v1_ordenado =  Vetores.radixSort(v1);
        Vetores.mostrar(v1_ordenado);
        System.out.println("------------------");

        


    }}