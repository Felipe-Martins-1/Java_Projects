package controller;

import java.util.Scanner;
import model.Ordering;
import model.Vector;

public class Main {

    public static void main(String[] args) {
        Vector v = new Vector();
        Ordering o = new Ordering();
        Scanner s = new Scanner(System.in);
        int choice;
        long start = 0, finish = 0, time;
        boolean status = false;
        System.out.println("=================== ORDENAÇÃO DE VETOR ==================="
                + "\n\nATENÇÃO!!!"
                + "\nOBSERVAÇÃO IMPORTANTE: para utilizar o arquivo de texto é "
                + "\nnecessário alterar o caminho na classe \"Vector\", pois, "
                + "\ncada máquina o caminho é diferente!"
                + "\n\nFormas de criar o vetor:"
                + "\n1 - Gerar números com o laço de repetição"
                + "\n2 - Obter números por meio da leitura do arquivo de texto"
                + "\n\nEscolha a forma de obter");
        choice = s.nextInt();
        if (choice == 1 || choice == 2) {
            try {
                v.setNumbers(choice);
                System.out.println("\nVetor desorganizado = " + v.getNumbers()
                        + "\nQuantidade total de números = " + v.getNumbers().size()
                        + "\n\nTipos de ordenação:"
                        + "\n1 - Bubble Sort"
                        + "\n2 - Selection Sort"
                        + "\n3 - Insertion Sort"
                        + "\n\nEscolha o tipo de ordenação");
                choice = s.nextInt();
                // A variável "start" recebe o valor do tempo em milissegundos
                start = System.currentTimeMillis();
                if (choice == 1) {
                    System.out.println("\nOrdenação Bubble Sort = "
                            + o.runBubbleSort(v.getNumbers()));
                    status = true;
                } else if (choice == 2) {
                    System.out.println("\nOrdenação Selection Sort = "
                            + o.runSelectionSort(v.getNumbers()));
                    status = true;
                } else if (choice == 3) {
                    System.out.println("\nOrdenação Insertion Sort = "
                            + o.runInsertionSort(v.getNumbers()));
                    status = true;
                } else {
                    System.out.println("\nEscolha inválida!\nPrograma encerrado!");
                }
                // A variável "finish" também recebe o valor do tempo em milissegundos
                finish = System.currentTimeMillis();
                if (status == true) {
                    /* A variável "time" recebe o valor da diferença, ou seja, o valor 
                    do tempo gasto em milissgundos para a execução do método escolhido*/
                    time = finish - start;
                    System.out.println("\nTempo de execução = "
                            + time + " milissegundos (aproximadamente "
                            + time / 1000 + " segundos)");  
                }
            } catch (Exception e) {
                System.out.println("\nErro: " + e + "\nPrograma encerrado!");
            }
        } else {
            System.out.println("\nEscolha inválida!\nPrograma encerrado!");
        }
    }
}