
package program;


public class ProgrTetelek {
    public static void main(String[] args) {
        
        int[] sorozat = {3,5,1,2,8,17,6};
        int hossz = sorozat.length;
        
    }
    public static int osszegzes(int [] sorozat, int hossz) {
            int osszeg = 0;
            for (int i = 0; i < hossz; i++) {
                osszeg += sorozat[i];
            }
            return osszeg;
    }
        
        
}

