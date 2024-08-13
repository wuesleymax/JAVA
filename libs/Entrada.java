package libs;

import java.util.Scanner;

public class Entrada {
 public static Scanner entrada;

 public static void abrir () {
    entrada = new Scanner(System.in);

 }

 public static void fechar() {
    entrada.close();
    
 }

 public static int LerInt(){
    return entrada.nextInt();
 }

 public static int LerInt(String Msg){
    System.out.println(Msg);
    return entrada.nextInt();
 }

 public static double lerDouble(){
    return entrada.nextDouble();
 }

 public static double lerDouble(String Msg){
    System.out.println(Msg);
    return entrada.nextDouble();
 }

 public static String lerPalavra(){
   return entrada.next();

 }

 public static String lerPalavra( String Msg){
    System.out.println(Msg);
    return entrada.next();
 
  }

  public static String lerLinha(){
    return entrada.nextLine();
 
  }

  public static String lerLinha(String Msg){
    System.out.println(Msg);
    return entrada.nextLine();
 
  }
    
}