import java.util.Scanner;
public class numero{
    static Scanner entrada;

    public static void entradaAbrir(){
         entrada= new Scanner(System.in);
    };

    public static void entradaFechar(){
        entrada.close();
    }
    public static int lerInt(){

        return entrada.nextInt();
     }
 
     public  static  int lerInt(String mensagem){
         System.out.println(mensagem);
         return entrada.nextInt();
     }

    public static void main(String [] args){

        int []n;

        n=new int[10];
        n[]=lerInt(null)

        System.out.println();




    }
}
