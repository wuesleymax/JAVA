package libs;

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

    // public static int[] copiar( int []v ){


    //     int [] v_novo = Vetores.alocarInteiros(v.length);
       
      
    //     for ( int i=0; i< v.length; i++){
    //         v_novo[i]= v[i];
            
    //     }


      
        

        
    // }

    public static int[] subVetor ( int[] v, int a, int b) {
        int 
        if (a < 0) a = 0;
        if (b > v.length) b = v.length;
        if (a >= b) return new int[0]; 



            


    }

    }

