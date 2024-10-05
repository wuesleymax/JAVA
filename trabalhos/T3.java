package trabalhos;

public class T3 {

    public static void trabalho() {
        int [] v = {1 ,2,3};
        mostrarInteiros(  v, 'x');
      
    }
    

    public static void mostrarInteiros(int[]valores, char separador){
         
        
        int i;

        
        


        for ( i=0; i< valores.length; i++){
            System.out.print(valores[i]);
            System.out.print(separador);

            
        }

        

    }
}
