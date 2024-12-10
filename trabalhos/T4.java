package trabalhos;
import libs.Vetores;
import libs.Tempo;

public class T4 {

    public static void aula(){
        System.out.println("Buscas-linear");

        TesteCounting();
        TesteQuick();
        TesteRadix();
        TesteSeletion();
        TesteBubblesort();
        TesteMerge();
        TesteInsertion();

    
    }

    public static void TesteBubblesort() {
        // Gera um vetor com 60.000 elementos aleatórios
        int[] v = Vetores.gerarValoresAleatorios(1000000, 0, 10000000);
        
        // Medir o tempo de execução da ordenação (Insertion Sort)
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.bubbleSort(v); // Chama a função de ordenação
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
    
        // Exibir o tempo de execução da ordenação
        System.out.printf("Tempo de ordenação (bubble Sort) com %d elementos: %f segundos\n", v.length, tempo_ordenacao_segundos);
    }


    public static void TesteInsertion() {
        // Gera um vetor com 60.000 elementos aleatórios
        int[] v = Vetores.gerarValoresAleatorios(100000, 0, 10000000);
        
        // Medir o tempo de execução da ordenação (Insertion Sort)
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.ordenarInsertionSort(v); // Chama a função de ordenação
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
    
        // Exibir o tempo de execução da ordenação
        System.out.printf("Tempo de ordenação (Insertion Sort) com %d elementos: %f segundos\n", v.length, tempo_ordenacao_segundos);
    }

    public static void TesteSeletion() {
        // Gera um vetor com 60.000 elementos aleatórios
        int[] v = Vetores.gerarValoresAleatorios(100000, 0, 10000000);
        
        // Medir o tempo de execução da ordenação (Insertion Sort)
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.ordenarSelectionSort(v); // Chama a função de ordenação
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
    
        // Exibir o tempo de execução da ordenação
        System.out.printf("Tempo de ordenação (Seletion Sort) com %d elementos: %f segundos\n", v.length, tempo_ordenacao_segundos);
    }

    public static void TesteMerge() {
        // Gera um vetor com 60.000 elementos aleatórios
        int[] v = Vetores.gerarValoresAleatorios(100000, 0, 10000000);
        
        // Medir o tempo de execução da ordenação (Insertion Sort)
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.mergeSort(v); // Chama a função de ordenação
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
    
        // Exibir o tempo de execução da ordenação
        System.out.printf("Tempo de ordenação (Merge Sort) com %d elementos: %f segundos\n", v.length, tempo_ordenacao_segundos);
    }

    public static void TesteCounting() {
        // Gera um vetor com 60.000 elementos aleatórios
        int[] v = Vetores.gerarValoresAleatorios(100000, 0, 100000);
        
        // Medir o tempo de execução da ordenação (Insertion Sort)
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.CountingSort(v,4); // Chama a função de ordenação
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
    
        // Exibir o tempo de execução da ordenação
        System.out.printf("Tempo de ordenação (CountingSort) com %d elementos: %f segundos\n", v.length, tempo_ordenacao_segundos);
    }

    public static void TesteQuick() {
        // Gera um vetor com 60.000 elementos aleatórios
        int[] v = Vetores.gerarValoresAleatorios(100000, 0, 100000);
        
        // Medir o tempo de execução da ordenação (Insertion Sort)
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.quickS(v); // Chama a função de ordenação
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
    
        // Exibir o tempo de execução da ordenação
        System.out.printf("Tempo de ordenação (QuickSort) com %d elementos: %f segundos\n", v.length, tempo_ordenacao_segundos);
    }

    public static void TesteRadix() {
        // Gera um vetor com 60.000 elementos aleatórios
        int[] v = Vetores.gerarValoresAleatorios(100000, 0, 100000);
        
        // Medir o tempo de execução da ordenação (Insertion Sort)
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.radixSort(v); // Chama a função de ordenação
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
    
        // Exibir o tempo de execução da ordenação
        System.out.printf("Tempo de ordenação (radixSort) com %d elementos: %f segundos\n", v.length, tempo_ordenacao_segundos);
    }



    
}
