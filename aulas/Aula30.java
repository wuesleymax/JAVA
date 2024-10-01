package aulas;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

import libs.Entrada;



public class Aula30 {
    public static void aula(){
        System.out.println("Aula30");

        ex01();
    }


    public static void ex01(){

        String nome_arquivo= "teste1.txt";
        int i;

        try{
            FileWriter arquivo = new FileWriter(nome_arquivo);
            // arquivo.write(16 + "\n");

            for(i=0; i<=10; i++){
                arquivo.write(i + "\n ");
            }
            arquivo.close();

        } catch(Exception e){
            System.err.println("erro");
            System.err.println(e);
        }

    }

    public static void ex02(){

        String nome_arquivo= "exemplo.txt";
        int i;
        String nome;
        int valor;

        try{
            File arquivo = new File(nome_arquivo);
            Scanner entrada= new Scanner(arquivo);

             nome = entrada.nextLine();
             System.out.println(nome);

             valor = entrada.nextInt();
             System.out.println(valor);
            entrada.close();

        } catch(Exception e){
            System.err.println("erro");
            System.err.println(e);
        }

    }

    
}
