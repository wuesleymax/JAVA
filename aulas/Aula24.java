package aulas;
import libs.Entrada;


 public class Aula24 {
public static void aula() {
    // mostrarMaioresQueMedia();
    trocarNegativosPorZero();

    
}
    


public static void mostrarMaioresQueMedia(){
    int[] v;
    double media, soma=0;
    int n_maiores=0;
    int n_valores=8;
    v=new int[n_valores];
    int i;
    

    Entrada.abrir();
    System.out.println("Entre com os valores");
     
    for(i=0; i<n_valores; i++){
    v[i]= Entrada.LerInt("valor:");
    }
    Entrada.fechar();

    for(i=0;i<v.length;i++){
        soma+=v[i];
    }
        media=soma/n_valores;

        for(i=0;i<v.length;i++){
            if(v[i]>media)
            n_maiores++;
        }

        System.out.println(n_maiores);

    }

    public static void trocarNegativosPorZero(){
      int[]v;
      int n_valores=10;
      v =new int[ n_valores];
      int i;
 
      Entrada.abrir();
      System.out.println("Entre com os valores");
       
      for(i=0; i<n_valores; i++){
      v[i]= Entrada.LerInt("valor:");
      }
      Entrada.fechar();

      for(i=0;i<v.length;i++){
        if (v[i]<0) {
            v[i]=0;
        }

        for(i=0;i<v.length;i++){
            System.out.print(n_valores);
        }

        



    }
        

        



      

    }










}



    // v[0]=Entrada.LerInt("valor:");
    // v[1]=Entrada.LerInt("valor:");
    // v[2]=Entrada.LerInt("valor:");
    // v[3]=Entrada.LerInt("valor:");
    // v[4]=Entrada.LerInt("valor:");
    // v[5]=Entrada.LerInt("valor:");
    // v[6]=Entrada.LerInt("valor:");
    // v[7]=Entrada.LerInt("valor:");

    // media=(v[0]+v[1]+v[2]+v[3]+v[4]+v[5]+v[6]+v[7])/8;

    // if(v[0]>media)
    // n_maiores++;
    // if(v[1]>media)
    // n_maiores++;
    // if(v[2]>media)
    // n_maiores++;
    // if(v[3]>media)
    // n_maiores++;
    // if(v[4]>media)
    // n_maiores++;
    // if(v[5]>media)
    // n_maiores++;
    // if(v[6]>media)
    // n_maiores++;
    // if(v[0]>media)
    // n_maiores++;
    
    




