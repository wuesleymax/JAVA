package aulas;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import libs.Vetores;
import libs.Tempo;



public class Aula36 {
    public static void aula(){
        System.out.println(" ## Fila ##");

        ex01();
    }

    public static void ex01(){

       LinkedList<Integer> lista = new LinkedList<>();
       int i;
       int x;

        lista.add(1);
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.add(40);

       for(i=0; i <lista.size(); i++){
        x= lista.get(i);
        System.out.printf("[%d] %d\n", i,x);
       }
       System.out.println("---------");
       lista.add(3,500);
       lista.set(5,400);
       
       for(i=0; i<lista.size(); i++){
        x = lista.get(i);
        System.out.printf("[%d] %d\n", i,x);

       }

       System.out.println(("-------"));
       for (int y :lista){
        System.out.println(y);
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

   











    
}
