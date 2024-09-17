package aulas;

import libs.Vetores;

public class Aula26 {
    public static void aula() {
        System.out.println("Aula 26 vetores");

        ExCopiarVetores();
       
    }

    public static void exAlocarVetores()
    {
        int[] vet;
        vet= Vetores.alocarInteiros(0);
       
        Vetores.mostrar(vet);
        
       }

       public static void ExCopiarVetores(){
        int [] v= Vetores.alocarInteiros(10);
        int [] v_copia= Vetores.copiar(v);
       }

       public static void ExSubVetores(){
        int [] n =Vetores.alocarInteiros(0);
        int [] y ;

       }


       

       





}