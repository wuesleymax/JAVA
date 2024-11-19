package aulas;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


import libs.Vetores;
import libs.Tempo;



// public class Aula37 {
//     public static void aula(){
//         System.out.println(" ## Tabelas hash ##");

//         // ex01();
//         ex03();
//     }

//     public static void ex01(){
//         Hashtable<String, Integer> tabela= new Hashtable<>();

//         tabela.put("batata", 10);
//         tabela.put("carne", 15);
//         tabela.put("abacate", 3);

//         for (String posicao : tabela.keySet()){
//             System.out.printf("%s: %d\n", posicao, tabela.get(posicao));
//         }






// }


// public static void ex02(){
//     String msg = "hoje e um dia apos ontem hoje tambem e uma dia antes de amanha hoje nao e ontem nem amanha";


//     String [] palavras = msg.split(" ");
//     String palavra;
//     int i;

   


// Hashtable< String, Integer> contador = new Hashtable<>();

// for(i=0; i<palavras.length; i++) {
//     palavra = palavras[i];

//     if(contador.containsKey(palavras[i])){
//         contador.put(palavras[i], contador.get(palavras[i])+1);

//     }else{
//     contador.put(palavras[i], 1);

// }




// }

// for (String posicao: contador.keySet()){
//     System.out.printf("%s: %d\n", posicao, contador.get(posicao));
// }
// }

// public static void ex03(){
//  System.out.println("vetor esparso");
//  int[] vetor={0,0,0,0,0,50,60,0,0,0,0,0,90,50,0,0,0,0,0,0,0,0,0,0,20};
//  int i;

//  Hashtable< Integer, Integer> vetor_esparso = new Hashtable<>();

//  for(i=0; i<vetor.length; i++){
//     if(vetor[i]!=0){
//     vetor_esparso.put(i, vetor[i]);



//     }}

//     for(i=0; i<vetor.length; i++){
//         System.err.printf("[%d] - %d - %d\n", i, vetor[i], vetorEsparso(vetor_esparso, i));
//     }




// }


//     public static int vetorEsparso(Hashtable<Integer, Integer> vetor_esparso, int posicao){
//         if(vetor_esparso.containsKey(posicao)){
//             return vetor_esparso.get(posicao);
//         }


    
// }



