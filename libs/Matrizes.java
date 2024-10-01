package libs;

public class Matrizes{

    public static int [][] alocarInt(int n_linhas, int n_colunas){

        // ex11
        int [][] m;
        int i, j;
        m= new int[n_linhas][n_colunas];
        for(i=0; i<m.length; i++){
            for(j=0; j<m[i].length; j++){
                m[i][j]= 0;
            }
        }

        return m;

    }

    public static int [][] preencherInt(int [][] m, int n){
        int i, j;
        for(i=0; i<m.length; i++){
            for(j=0; j<m[i].length; j++){
                m[i][j]= n;
            }
        }




        return m;
    }

    public static int [][] lerInt( int[][]m){
        // ex14 com leitura

        return null;
    }
    

   

    public static int [][] obterLinha(int[][]m, int linha){
        // ex17
        return null;
    }

    public static int [][] obterLinhaColuna (int[][]m, int coluna){
    return null;


    }

    

    public static int [][] multiplicar(int [][]a , int [][]b){


        return null;
    }






    public static int [][] somar (int [][] mA, int [][] mB){

        int i, j;
        int [][] mC;

        mC= new int[mA.length][mA[0].length];
        for(i=0; i<mA.length; i++){
            for(j=0; j<mA[i].length; j++){
                mC [i][j]= mA[i] [j] + mB[i][j];
            }
        }
  return mC;
}

public static boolean comparar(int[][] mA, int[][] mB){
    int i, j;
    if(mA.length!=mB.length || mA[0].length!=mB[0].length){
        return false;
    }
    for(i=0; i<mA.length; i++){
        for(j=0; j<mA[i].length; j++){
            if(mA[i][j]!=mB[i][j]){
                return false;
            }
        }
    }
    return true;

}

public static int [][] novaIdentidade(int n){
    int [][] m;
    m= new int[n][n];
    int i;
   
    // for(i=0; i<n; i++){
    //     for(j=0; j<n; j++){
       
    //         if(i==j){
    //             mI[i][j]=1;
    //         }
    //         else{
    //             mI[i][j]=0;
    //         }
    //     }

    for(i=0; i<n; i++){
      m[i][i]=1;

    }
        
       return m;
    }













public static void mostrar( int[][] m ){
    int i, j;
    for(i=0; i<m.length; i++){
        for(j=0; j<m[i].length; j++){
            System.out.print(m[i][j]+" ");
        }
        System.out.println();
    }

}
}


