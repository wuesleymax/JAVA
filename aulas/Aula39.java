package aulas;

import libs.Vetores;

public class Aula39 {

    public static void aula(){
        System.out.println(" ##  ##");

        ex02();
       
    }

    public static void ex01(){
        int  meio;

        int[] v_0 = { 4,1,7,0,8,5,2,9,6,3};
        System.out.println("entrada");
        Vetores.mostrar(v_0);
        meio= v_0.length/2;
        int[] v_0_sub_vetor_esq =  Vetores.subVetor(v_0, meio, meio);
        Vetores.mostrar(v_0_sub_vetor_esq);

    }

    public static void ex02(){

        int[] v_0 = { 4,1,7,0,8,5,2,9,6,3};
        System.out.println("entrada");
        Vetores.mostrar(v_0);

        int[] v_0_ordenado = Vetores.mergeSort(v_0);
        System.out.println("saida");
        Vetores.mostrar(v_0_ordenado);
        


    }

    


    
}
