package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public final class Vector {

    private ArrayList<Integer> numbers = new ArrayList();

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(int choice) throws IOException {
        if (choice == 1) {
            for (int i = 1; i <= 100000; i++) {
                numbers.add(i);
            }
        } else if (choice == 2) {
            String line;
            int number;
            // O parâmetro da classe "File" é o caminho do arquivo "vector.txt"
            File f = new File("C:\\Users\\Felipe\\Documents\\NetBeans\\VectorOrdering\\src\\resoucer\\vector.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                line = br.readLine();
                number = Integer.parseInt(line);
                numbers.add(number);
            }
            br.close();
            fr.close();
        }
        Collections.shuffle(numbers);
    }
}