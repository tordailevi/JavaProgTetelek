
package program;

import java.util.Random;

public class Main {

    static final Random random = new Random();
    
    public static void main(String[] args) {
        System.out.println("program.Main.main()");
        int osszeg = 0;
        int szam = 0;
        int db = 0;
        while (db < 10){
            System.out.println("program.Main.main()");
            osszeg += szam;
            szam += 2;
            db++;
        }
        System.out.println("program.Main.main()");
        
        int n = random.nextInt(10, 16);
        while(n != 12){
            System.out.println(n + " ");
            n = random.nextInt(10, 16);
        }
        System.out.println("program.Main.main()");
        
        System.out.println("Egyjegyű számok: "+ "");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        for (int i = 0; i < 10; i+=2){
            System.out.print(i + " ");            
        }
        
        System.out.println("");
        
        for (int i = 3; i >= -4; i--){
            System.out.printf("|%2d| = %2d\n", i, Math.abs(i));
        }
        
        System.out.println("");
        
        
    }
    
}
