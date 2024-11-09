package aulas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import libs.Vetores;
import libs.Tempo;



public class Aula36 {
    public static void aula(){
        System.out.println(" ## lista ##");

        ex02();
    }

    public static void ex01(){

    //    LinkedList<Integer> lista = new LinkedList<>();
       ArrayList<Integer> lista = new ArrayList<>();
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

       System.out.println("---------");
     
       for(int y : lista){
        System.out.printf("[%d] %d\n", lista.indexOf(y),y);
       }


       System.out.println("-------");
          ListIterator <Integer> l= lista.listIterator();

          while (l.hasNext()) { 
            System.out.println(l.next());
            
          }
      

    }
    public static void ex02(){
        Set <Integer> conjunto = new HashSet<>();

        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);
        conjunto.add(40);

        for ( int y: conjunto){
            System.out.println(y);
        }

        System.out.printf("Elemento 30 está no conjunto? %b\n", conjunto.contains(30));
        System.out.printf("Elemento 70 está no conjunto? %b\n", conjunto.contains(70));

        Iterator <Integer> it= conjunto.iterator();
        System.out.println(it.hashCode());
        


    }

   











    
}
