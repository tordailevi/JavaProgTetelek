
package program;

import java.util.Random;

public class Tombok {

    static final Random random = new Random();
    
    public static void main(String[] args) {
        final int HOSSZ = 10;
        int[] tomb = new int[HOSSZ];
        for (int i = 0; i <= HOSSZ; i++){
            if(i % 2 == 0){
                tomb[i] = 1;
            }else{
                tomb[i] = random.nextInt(0, 100);
            }
        }
        for (int i = 0; i <= HOSSZ; i++){
            System.out.printf("%d = %d\n", i, tomb[i]);
        }
    }
}
