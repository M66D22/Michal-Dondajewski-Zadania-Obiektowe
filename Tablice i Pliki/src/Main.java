import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws IOException {
        int ocena, i;
        Random r = new Random();
        System.out.println("Test");

        FileWriter fw = new FileWriter("Uczniowie.txt");
        Scanner sc = new Scanner(System.in);

        int tab[] = new int[6];
        for (i=0;i<tab.length;i++){
            tab[i] = r.nextInt(6)+1;
            System.out.println(tab[i]);
        }
        File file = new File("Uczniowie.txt");
        Scanner fs = new Scanner(file);

        String tabU[] = new String[10];
        while (fs.hasNext()) {
            tabU[i] = fs.nextLine();
            System.out.println(tabU[i]);
        }
    }
}
