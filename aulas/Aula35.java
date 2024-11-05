package aulas;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import libs.Vetores;
import libs.Tempo;



public class Aula35 {
    public static void aula(){
        System.out.println(" ## Fila ##");

        ex02();
    }

    public static void ex01(){

       Queue<Integer> fila = new LinkedList<>();
        fila.add(15);
        fila.add(20);
        fila.add(50);
        fila.add(-10);
        fila.add(18);

        System.out.println(fila.isEmpty());
     
        int x = fila.poll();
        System.out.println(x);

        x = fila.poll();
        System.out.println(x);

        System.out.println("retirando elementos ");

        while(!fila.isEmpty()) {
            x=fila.poll();
            System.out.println(x);
        }

      

    }
    public static void ex02(){
        Stack <Integer> pilha = new Stack<>();
        int x;

        pilha.push(15);
        pilha.push(20);
        pilha.push(50);
        pilha.push(-10);
        pilha.push(18);


        while(!pilha.isEmpty()) {
            x=pilha.pop();
            System.out.println(x);
        }

        



    }

    public static void calcularPolonesaReversa(String [] Valores){
  
        int i;
        int result;

        for(i=0; i>Valores.length; i++){
          if (Valores[i]=="+"){

           result =  Valores[i-1] + Valores[i-2];

          }

          if (Valores[i]=="+"){

            result =  Valores[i-1] - Valores[i-2];
 
           }
          
          





        }







    }











    
}
