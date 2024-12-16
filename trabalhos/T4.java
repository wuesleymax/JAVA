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
        // TesteBubblesort();
        TesteMerge();
        TesteInsertion();
    }

    public static void TesteBubblesort() {
        int[] v = Vetores.gerarValoresAleatorios(1000000, 0, 10000000);
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.bubbleSort(v);
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
        System.out.println("Tempo de ordenação (bubble Sort) com " + v.length + " elementos: " + tempo_ordenacao_segundos + " segundos");
    }

    public static void TesteInsertion() {
        int[] v = Vetores.gerarValoresAleatorios(100000, 0, 10000000);
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.ordenarInsertionSort(v);
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
        System.out.println("Tempo de ordenação (Insertion Sort) com " + v.length + " elementos: " + tempo_ordenacao_segundos + " segundos");
    }

    public static void TesteSeletion() {
        int[] v = Vetores.gerarValoresAleatorios(100000, 0, 10000000);
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.ordenarSelectionSort(v);
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
        System.out.println("Tempo de ordenação (Seletion Sort) com " + v.length + " elementos: " + tempo_ordenacao_segundos + " segundos");
    }

    public static void TesteMerge() {
        int[] v = Vetores.gerarValoresAleatorios(100000, 0, 10000000);
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.mergeSort(v);
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
        System.out.println("Tempo de ordenação (Merge Sort) com " + v.length + " elementos: " + tempo_ordenacao_segundos + " segundos");
    }

    public static void TesteCounting() {
        int[] v = Vetores.gerarValoresAleatorios(100000, 0, 100000);
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.CountingSort(v ,1);
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
        System.out.println("Tempo de ordenação (CountingSort) com " + v.length + " elementos: " + tempo_ordenacao_segundos + " segundos");
    }

    public static void TesteQuick() {
        int[] v = Vetores.gerarValoresAleatorios(100000, 0, 100000);
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.quickS(v);
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
        System.out.println("Tempo de ordenação (QuickSort) com " + v.length + " elementos: " + tempo_ordenacao_segundos + " segundos");
    }

    public static void TesteRadix() {
        int[] v = Vetores.gerarValoresAleatorios(100000, 0, 100000);
        long tempo_inicio_ordenacao = Tempo.medirTempoIniciar();
        Vetores.radixSort(v);
        double tempo_ordenacao_segundos = Tempo.medirTempoFinalizarSegundos(tempo_inicio_ordenacao);
        System.out.println("Tempo de ordenação (radixSort) com " + v.length + " elementos: " + tempo_ordenacao_segundos + " segundos");
    }
}

