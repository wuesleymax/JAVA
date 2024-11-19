package aulas;

import libs.Vetores;


public class Aula38 {
    public static void aula(){
        System.out.println(" ##  ##");

        ex02();
       
    }
    

    public static void ex01(){

int[] v_0 = {17,5,0,18,2,9};

Vetores.ordenarInsertionSort(v_0);
Vetores.mostrar(v_0);

// int []v_1 = Vetores.gerarValoresAleatorios(10,10,50);
// Vetores.mostrar(v_1);
// Vetores.ordenarInsertionSort(v_1);
// Vetores.mostrar(v_1);

}


    public static void ex02() {

        int [] v_1 = {17,5,0,18,2,9};

        Vetores.ordenarInsertionSort(v_1);
        System.out.println("Saida: ");
        Vetores.mostrar(v_1);

        System.out.println("-------------");
    }
    

    
    
    
    
    
    
    }