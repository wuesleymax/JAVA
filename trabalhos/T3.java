package trabalhos;

public class T3 {

    public static void trabalho() {
        int [] v = {1,2,3,4};
        int n = 10;
       
        int l1 =2 ;
        int c2 =3;
        int l= 3;
        int c=2;
  

        int [] [] mat2 = new int [l] [c];
        int [] [] mat = new int [l1] [c2];
        mat [0] [0]= 2;
        mat [0] [1] = 0 ;
        mat [0] [2] = 1;
        mat [1] [0]= 5;
        mat [1] [1] = 3 ;
        mat [1] [2] = 2;

       mat2 [0] [0]= 4;
       mat2 [0] [1] = 3 ;
       mat2 [1] [0] = 1;
       mat2 [1] [1]= 2;
       mat2 [2] [0] = 0 ;
       mat2 [2] [1] = 6;

        

      
        // Transpor( mat, l1 , c2 );

        // PermutacaoLinha(mat, l1, c2 , 0,1);
        // Multi(mat,l1,c2,mat2,l,c);
        

        int  [] vet = {6,5,4,3};
        boolean [] vetor = {};
        boolean [] vz = {};
    //    mostrarInteiros(  v, 'x');//

    //   filtrarMaiores(v, 10);//
    //  Intersecao(v, vet);

    // Pascal(n);
    aplicarElogico(vetor, vz);
      
    }
    

    public static void mostrarInteiros(int[]valores, char separador){
         
        
        int i;
        int j;

        
        


        for ( i=0; i< valores.length; i++){
            System.out.print(valores[i]);
            if (i < valores.length - 1) {  
                System.out.print(separador);
            }

            
        }
      
        

    }

public static void filtrarMaiores (int[]valores, int n)
{ int i; 
    System.out.print("[");
    for (i=0; i<valores.length; i++){
        if (valores[i]>n){
            
            System.out.print(  valores[i] );
            if ( valores[i]<valores.length) {
                System.out.print(", ");
            }
           
        }

    } System.out.print("]");
    


} 

public static void filtrarMenores(int[]valores, int n)
{ int i; 
    for (i=0; i<valores.length; i++){
        if (valores[i]<n){
            System.out.print(valores[i]+" ");
        }
    }
    


} 

public static void aplicarElogico(boolean[] v, boolean[] z) {
   
    if (v.length == 0 && z.length == 0) {
        boolean[] x = new boolean[0]; 
       
        

         
    }

   
    boolean[] x = new boolean[v.length]; 

    for (int i = 0; i < v.length; i++) {
        if (v[i] == z[i]) {
            x[i] = true; 
        }

        if (v[i] =! z[i]) {
            x[i] = false; 
        }
    }

   
    System.out.print("[");
    for (int i = 0; i < x.length; i++) {
        System.out.print(x[i]);
        if (i < x.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}


public static void aplicarOUlogico(boolean[] v, boolean[] z) {
  
    if (v.length == 0 && z.length == 0) {
        boolean[] x = new boolean[0]; 
 }

   
    boolean[] x = new boolean[v.length];
    int i;

    for ( i = 0; i < v.length; i++) {
        if (v[i] == z[i]) {
            x[i] = true; 
        }

        if (v[i] == false && z[i] == false) {
            x[i] = false; 
        }
    }

    
    System.out.print("[");
    for ( i = 0; i < x.length; i++) {
        System.out.print(x[i]);
        if (i < x.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}

public static void aplicarMascara(int[] v, boolean[] z){

    int i;

    
    int count = 0;
    for ( i = 0; i < z.length; i++) {
        if (z[i]) {
            count++;
        }
    }

    
    int[] x = new int[count];
    int indice = 0;

    
    for ( i = 0; i < v.length; i++) {
        if (z[i]==true) {
            x[indice] = v[i];
            indice++;
        }
    }

    System.out.print("[");
    for ( i = 0; i < x.length; i++) {
        System.out.print(x[i]);
        if (i < x.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}

public static void Uniao(int[] v, int[] z) {
   
    int tmaximo = v.length + z.length;
    int[] x = new int[tmaximo]; 

    
    int indice = 0;
    for (int i = 0; i < v.length; i++) {
        x[indice] = v[i];
        indice++;
    }

  
    for (int i = 0; i < z.length; i++) {
        int value = z[i];
        boolean duplo = false;

       
        for (int j = 0; j < indice; j++) {
            if (x[j] == value) {
                duplo = true;
                break; 
            }
        }

       
        if (!duplo) {
            x[indice] = value; 
            indice++;
        }
    }

    
    int[] b = new int[indice];
    for (int i = 0; i < indice; i++) {
        b[i] = x[i];
    }

   
    System.out.print("[");
    for (int i = 0; i < b.length; i++) {
        System.out.print(b[i]);
        if (i < b.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}

public static void uni(int []v, int []z){



    
}



public static void Diferenca(int []v, int []z){
    int i, cont ;
    for(i=0; i<v.length; i++){
        cont = 0;
        for(int j=0; j<z.length; j++){
            if(v[i] == z[j]){
                cont++;
                break;
            }
        }
        if(cont == 0){
            System.out.print(v[i]+" ");
        }
    }

}

public static void Intersecao(int[] v, int[] z) {
    int[] x = new int[v.length]; // O vetor temporário será do tamanho de 'v'
    int cont = 0; // Contador para os elementos comuns

    // Percorrer o vetor v
    for (int i = 0; i < v.length; i++) {
        // Para cada elemento de v, verificar se ele está em z
        for (int j = 0; j < z.length; j++) {
            if (v[i] == z[j]) { // Se v[i] é igual a z[j], então é um elemento comum
                boolean jaExiste = false;

                // Verifica se o elemento já foi adicionado à interseção
                for (int k = 0; k < cont; k++) {
                    if (x[k] == v[i]) {
                        jaExiste = true; // Se já existe, não adicionar novamente
                        break;
                    }
                }

                if (!jaExiste) { // Se o elemento ainda não foi adicionado
                    x[cont] = v[i];
                    cont++; // Incrementa o contador de elementos comuns
                }
            }
        }
    }

    // Criar o vetor final com o tamanho exato da interseção
    int[] y = new int[cont];
    for (int i = 0; i < cont; i++) {
        y[i] = x[i]; // Copia os elementos para o vetor final
    }

    // Exibir o vetor interseção
    System.out.print("[");
    for (int i = 0; i < y.length; i++) {
        System.out.print(y[i]);
        if (i < y.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}


public static void Transpor(int[][] m , int l , int c){

  int [][] mb;

  mb= new int [c] [l];
  
   


    for (int i=0; i<l; i++){
     
        for( int j=0; j<c; j++){
           mb[j] [i] = m[i] [j]; 
        }
    }

    
    for(int i=0; i<mb.length; i++){
        for(int j=0; j<mb[i].length; j++){
            System.out.print(mb[i][j]+" ");
        }
        System.out.println();
    }

}
    
public static void Pascal(int m ){
    
    int [][] mb;
    mb= new int [m] [m];
    int i, j;
      
    for (i=0; i< mb.length; i++){
        mb[i][0] = 1;
        for(j=0; j<mb.length; j++){
           if(i>0 && j>0){mb[i][j] = mb[i-1][j] + mb[i-1][j-1];} 

        }
    }
  
     



    for(i=0; i<mb.length; i++){
        for(j=0; j<mb[i].length; j++){
            System.out.print(mb[i][j]+" ");
        }
        System.out.println();
    }

  
  }

  public static void PermutacaoLinha ( int[][] m, int l, int c , int n , int b ) {
   
    int [][] mb;
    mb= new int [l] [c];
    int i, j;
      
    for (i=n; i<mb.length; i++){
       
        for(j=0; j<mb.length; j++){
            mb [i][j]= m[i][j];
           } 

        }

        for ( j = 0; j < mb[n].length; j++) {
        
            int temp = mb[n][j];
            mb[n][j] = mb[b][j];
            mb[b][j] = temp;
        }


    
  
     



    for( i=0; i<mb.length; i++){
        for( j=0; j<mb.length; j++){
            System.out.print(mb[i][j]+" ");
        }
        System.out.println();
    }

  
  
  }

  public static void Multi ( int [] []m , int l, int c, int [] []ma, int li, int column){
    int [] [] mb ;
    int i,j;
    mb = new int [l] [column];

    if(c!=li){ System.out.println( " Não é possivel multiplicar as matrizes");}

    for ( i = 0; i < l; i++) {
        for ( j = 0; j < column; j++) {
            for (int k = 0; k < c; k++) {
                mb[i][j] += m[i][k] * ma[k][j];
            }
        }
    }
    
    System.out.println("primeira matriz");
    for( i=0; i<m.length; i++){
        for( j=0; j<m.length; j++){
            System.out.print(m[i][j]+" ");
        }
        System.out.println();
    }

    System.out.println("X");

    // for( i=0; i<ma.length; i++){
    //     for( j=0; j<ma.length; j++){
    //         System.out.print(ma[i][j]+" ");
    //     }
    //     System.out.println();
    // }

    System.out.println("Resposta");



    for( i=0; i<mb.length; i++){
        for( j=0; j<mb.length; j++){
            System.out.print(mb[i][j]+" ");
        }
        System.out.println();
    }


  }









    public static void main(String[] args) {
        trabalho();
    
    
    }


}