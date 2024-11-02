package libs;
import java.util.Arrays;
import java.util.Random;
import java.util.Arrays;

import libs.Entrada;

public class Vetores {
    public static int [] alocarInteiros ( int n ){
        int[] vetor;
        int i;
        vetor = new int [n];
        for ( i=0; i< vetor.length; i++){
            vetor[i]= 0;
        }

        return vetor;
    }
    public static void mostrar (int []v){
        int i;
        System.out.print("[");
        for (i=0; i<v.length; i++){
            System.out.print(v[i]+ ", ");

            if(i<v.length-1){
                System.out.println(", ");
            }
           
        }
        System.out.println("]");

       
    }

    public static int[] lerInteiros(int n){
        int [] valores= alocarInteiros(n);
        int i;

        

        for(i=0; i<n; i++){
            valores[i]= Entrada.LerInt();
        }

        

        return valores;

    }

    public static int obterPosicaoInteiro(int[] vetor, int valor_buscar,int pos_inicial){ int i;
        for( i= pos_inicial; i<vetor.length; i++) {
            if (vetor[i]== valor_buscar) { return i;
                
            }
            
        }
        return -1;



    }

    public static int[] gerarValoresAleatorios(int n, int valor_min, int valor_max) {
        Random random = new Random();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            // Gera um número aleatório entre min (inclusivo) e max (inclusivo),
            //   e salva na posição i do vetor
            vetor[i] = random.nextInt(valor_max - valor_min + 1) + valor_min;
        }
        
        return vetor;
    }

    public static int buscaSequencial(int[] vetor, int x){ int i;
        for( i= 0; i<vetor.length; i++) {
            if (vetor[i]== x) { return i;
                
            }
            
        }
        return -1;



    }

    public static int[] gerarValoresAleatoriosOrdenado(int n, int valor_min, int valor_max) {

        //Obtém um vetor de valores aleatórios
        int[] vetor = gerarValoresAleatorios(n, valor_min, valor_max);

        // Ordena o vetor antes de retornar
        Arrays.sort(vetor);

        return vetor;
    }

    public static int buscaBinaria(int[] vetor, int valor_buscar)
    {
        int ini, fim, meio;
        ini=0;
        fim= vetor.length;
        while (ini<=fim) {
            meio= (int)(ini+fim)/2;
            if(vetor[meio] == valor_buscar){
                return meio;
            }  else {

                if( valor_buscar< vetor[meio]){
                    fim= meio -1;

                }  else {ini=meio+1;}
            }
            
        }






        return -1;
    }

    // public static int [] oberIndice(  int []v, int valor_buscar){
    //     int i,j ;
    //     int [] indices= new int[0];
    //     for( i= 0; i<v.length; i++) {
    //         if (v[i]== valor_buscar) { 
    //             for(j=0; j<v.length; j++){
                   
    //                     indices[j]=i;
                        
    //                 }
    //             }
                
    //         }
            
    //     }



    }

    // public static int[] copiar( int []v ){


    //     int [] v_novo = Vetores.alocarInteiros(v.length);
       
      
    //     for ( int i=0; i< v.length; i++){
    //         v_novo[i]= v[i];
            
    //     }


      
        

        
    // }

    // public static int[] subVetor ( int[] v, int a, int b) {
    //     int 
    //     if (a < 0) a = 0;
    //     if (b > v.length) b = v.length;
    //     if (a >= b) return new int[0]; 



            


    // }

    

