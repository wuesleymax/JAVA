package aulas;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

import libs.Entrada;



public class Aula31{
    public static void aula(){
        System.out.println("Aula31");

        ex02();
    }

    public static void ex01(){
        String nome_arquivo= "arquivos/valores_10.txt";
        int i;
        int soma=0, valor_lido;
        double media;

        try{
            File arquivo = new File(nome_arquivo);
            Scanner entrada= new Scanner(arquivo);

            for(i=0;i<10;i++){
             valor_lido = entrada.nextInt();
             soma= soma+valor_lido;}

             media=(double)soma/10;

             System.out.println("Média" + media);

             entrada.close();

            

        } catch(Exception e){
            System.err.println("erro");
            System.err.println(e);
        }



    }

    public static void ex02(){
        String nome_arquivo= "arquivos/valores_n.txt";
        int i,n;
        int soma=0, valor_lido;
        double media;

        try{
            File arquivo = new File(nome_arquivo);
            Scanner entrada= new Scanner(arquivo);

            n = entrada.nextInt();

            for(i=0;i<n;i++){
             valor_lido = entrada.nextInt();
             soma= soma+valor_lido;}

             media=(double)soma/n;

             System.out.println("Média" + media);

             entrada.close();

            

        } catch(Exception e){
            System.err.println("erro");
            System.err.println(e);
        }




        
    }
}
