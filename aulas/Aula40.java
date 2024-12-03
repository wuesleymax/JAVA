package aulas;

import libs.Vetores;

public class Aula40 {
    public static void aula(){
        System.out.println(" ##  counting sort ##");

        ex01();
       
    }



    public static void ex01(){

        int  meio;

        int[] v_0 = { 4,1,7,0,8,5,2,9,6,3};
        System.out.println("entrada");
        Vetores.mostrar(v_0);
        int[] v0_ordenado =  Vetores.CountingSort(v_0,1);
        Vetores.mostrar(v0_ordenado);
        


    }














}
