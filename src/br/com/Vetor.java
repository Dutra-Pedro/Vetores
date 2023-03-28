package br.com;

public class Vetor {
    public static void main(String[] args) {


        int[] x = new int[10];
        lerVetor(x);
        printVetorForeach(x);
    }

    public static void lerVetor(int[] x){
        for (int i = 0; i < x.length; i++){
            x[i] = 2 * i;
        }
    }

    public static void printVetor(int[] x){
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i] + "\t");
        }
    }

    public static void printVetorForeach(int[] x){
        for (int i : x) {
            System.out.println(x[i] + "\t");
        }
    }
}
