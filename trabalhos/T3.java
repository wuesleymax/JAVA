package trabalhos;

public class T3 {

    public static void trabalho() {
        int [] v = {1 ,2,3,8};

        int  [] vet = {2,4,6,8,10};
        boolean [] vetor = {false,true,false,false,false};
    //    mostrarInteiros(  v, 'x');//

      filtrarMaiores(v, 10);//
    //   Uniao(vet, v);
      
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
       
        System.out.print("[");
        System.out.println("]");

        return; 
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

        
        System.out.print("[");
        System.out.println("]");

        return; 
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
int 


    
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







    public static void main(String[] args) {
        trabalho();
    
    
    }


}