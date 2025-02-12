
package program;

import java.util.Scanner;

public class Szamjegyek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg a típust (i/n): ");
        
        boolean ism =scanner.nextLine().equals("i");
        System.out.println("2, 3, 4 jegyekből a számok:");
        String ki = ism ? "Ismétléssel" : "Ismétlés nélkül";
        System.out.println(ki);
        int db_ism = 0;
        int db_ism_nlk = 0;

        for (int i = 2; i < 5; i++) {
            for (int j = 2; j < 5; j++) {
                for (int k = 2; k < 5; k++) {
                    if (ism) {
                        db_ism++;
                        System.out.printf("\n%d%d%d ", i, j, k);
                    } else if (i != j && i != k && j != k) {
                        db_ism_nlk++;
                        System.out.printf("\n%d%d%d ", i, j, k);
                    }
                }
            }
        }
        if (ism) {
            System.out.println("\nAz esetek száma ismétléssel: " + db_ism);
        } else {
            System.out.println("\nAz esetek száma ismétlés nélkül: " + db_ism_nlk);
        }
    }
}