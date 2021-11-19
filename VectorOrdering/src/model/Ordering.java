package model;

import java.util.ArrayList;

public final class Ordering {

    public ArrayList<Integer> runBubbleSort(ArrayList<Integer> numeros) {
        int i, aux = 0, tamanho = numeros.size();
        boolean status;
        do {
            tamanho--;
            status = false;
            for (i = 0; i < tamanho; i++) {
                if (numeros.get(i) > numeros.get(i + 1)) {
                    aux = numeros.get(i);
                    numeros.set(i, numeros.get(i + 1));
                    numeros.set(i + 1, aux);
                    status = true;
                }
            }
        } while (status);
        return numeros;
    }

    public ArrayList<Integer> runSelectionSort(ArrayList<Integer> numeros) {
        int i, j, min, aux, tamanho = numeros.size();
        for (i = 0; i < tamanho - 1; i++) {
            min = i;
            for (j = i + 1; j < tamanho; j++) {
                if (numeros.get(j) < numeros.get(min)) {
                    min = j;
                }
            }
            aux = numeros.get(i);
            numeros.set(i, numeros.get(min));
            numeros.set(min, aux);
        }
        return numeros;
    }

    public ArrayList<Integer> runInsertionSort(ArrayList<Integer> numeros) {
        int i, j, chave, tamanho = numeros.size();
        for (j = 1; j < tamanho; j++) {
            chave = numeros.get(j);
            i = j - 1;
            while (i >= 0 && numeros.get(i) > chave) {
                numeros.set(i + 1, numeros.get(i));
                i--;
            }
            numeros.set(i + 1, chave);
        }
        return numeros;
    }
}