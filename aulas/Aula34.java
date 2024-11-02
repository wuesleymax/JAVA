package aulas;

import libs.Vetores;
import libs.Tempo;

public class Aula34 {

    public static void aula(){
        System.out.println("Buscas-linear");

        ex02();
        ex04();
    }

    public static void ex01(){
        int []v = {15,19,4,7,0,100};
        int x=4;
        int pos; 
        pos = Vetores.buscaSequencial(v, x);
        

     }

   

    public static void ex02(){
        int []v = Vetores.gerarValoresAleatorios(60000, 0, 10000000);
        int x=70000;
        int pos;
        long tempo_inicio = Tempo.medirTempoIniciar();
         

        pos= Vetores.buscaSequencial(v,x);
        double tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);
        if(pos !=-1) {
            System.out.printf("Valor %d encontrado na pos. %d.\n", x , pos);

        }
        else{System.out.printf( "valor %d nao encontrado.\n", x);}

        System.out.printf( "tempo de busca sequencial com %d elementos: %f segundos\n", v.length, tempo_segundos);





        

     }

     public static void ex04(){
        int []v = Vetores.gerarValoresAleatoriosOrdenado(60000, 0, 10000000);
        int x=70000;
        int pos;
        long tempo_inicio = Tempo.medirTempoIniciar();
         

        pos= Vetores.buscaBinaria(v,x);
        double tempo_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio);
        if(pos !=-1) {
            System.out.printf("Valor %d encontrado na pos. %d.\n", x , pos);

        }
        else{System.out.printf( "valor %d nao encontrado.\n", x);}

        System.out.printf( "tempo de busca binaria com %d elementos: %f segundos\n", v.length, tempo_segundos);





        

     }


    

    
}
