
package program;

import java.util.Random;
import java.util.Scanner;

public class MetodusokHivasa {
    static final Random random = new Random();
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        /*Metodusok.kiirKonzolra("Kérek 1 egész számot: ");
        int a = sc.nextInt();
        int b = random.nextInt(0, 100);
        Metodusok.osszead(a, b);
        Metodusok.f2_KettoSzamOsszegeKiirva();*/
        
        Metodusok metodusok = new Metodusok();
        metodusok.eljaras();
        metodusok.fuggveny(1);
        
        
        
        
        
    }
}
