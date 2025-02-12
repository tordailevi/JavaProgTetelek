
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

    public static int megszamlalas(int[] sorozat) {
            int osszeg = 0;
            for (int i = 0; i < sorozat.length; i++) {
                if (sorozat[i] % 2 == 1) {
                    osszeg++;
                }
            }
            return osszeg;
        }

    public static int minKivalasztas(int[] sorozat) {
        int minIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if (sorozat[i] < sorozat[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int maxKivalasztas(int[] sorozat) {
        int maxIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if (sorozat[i] > sorozat[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int kivalasztas(int[] sorozat) {
        int i = 0;
        while (i < sorozat.length && !(sorozat[i] > 5)) {
            i++;
        }
        return i;
    }

    public static boolean eldontesEgy(int[] sorozat) {
        int i = 0;
        while (i < sorozat.length && !(sorozat[i] % 2 == 0 && sorozat[i] > 4)) {
            i++;
        }
        return i < sorozat.length;
    }

    public static boolean eldontesMind(int[] sorozat) {
        int i = 0;
        while (i < sorozat.length && sorozat[i] > 5) {
            i++;
        }
        return i >= sorozat.length;
    }

    public static int linearisKereses(int[] sorozat) {
        int i = 0;
        while (i < sorozat.length && sorozat[i] != 0) {
            i++;
        }
        return (i < sorozat.length) ? i : -1;
    }
}

