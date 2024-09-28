package libs;
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

    

