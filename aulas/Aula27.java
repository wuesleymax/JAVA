package aulas;

import libs.Vetores;

public class Aula27 {
    public static void aula(){
     System.out.println( "Aula27");
    //  exercicioLeituraVetorInteiro();
     exercicioBuscarPosicao();




    }

    public static void exercicioLeituraVetorInteiro(){
        int n = 4;
        int [] valores;
        System.out.println("Digite" + n + "valores:");
        valores = Vetores.lerInteiros(n);
        Vetores.mostrar(valores);
    



}

public static void exercicioBuscarPosicao(){
    int [] valores = {1,2,3,4,5,4,3,2,1};
    int pos_inicial=3 , valor=3, pos ;
 pos=Vetores.obterPosicaoInteiro(valores, valor, pos_inicial);
 System.out.println(pos);
}





}

