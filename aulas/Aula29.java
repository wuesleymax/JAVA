package aulas;
import libs.Matrizes;

public class Aula29 {

    public static void aula() {
        System.out.println("Aula 29");

        ex01();
        
    }

    public static void ex01() {
        int [][] m1,m2,m3;
        int n_linhas = 2;
        int n_colunas = 2;
        
        m1 = new int[n_linhas] [n_colunas];
        m2 = new int[n_linhas] [n_colunas];

        m1[0] [0]=7;
        m1[0] [1]=20;
        m1[1] [0]=18;
        m1[1] [1]=1;

        m2[0] [0]=13;
        m2[0] [1]=4;
        m2[1] [0]=10;
        m2[1] [1]=17;

        if(Matrizes.comparar(m1,m2)){
            System.out.println("As matrizes sao iguais.");
        } else{
            System.out.println("As matrizes sao diferentes.");
        }

        m3= Matrizes.somar(m1,m2);

        Matrizes.mostrar(m3);
    
}}
