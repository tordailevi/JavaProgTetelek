
package program;

public class Metodusok {
    
    public static void main(String[] args) {
        
        kiirKonzolra("********************************\nelső 10 N+ szám összege:");
        kiirKonzolra(f1_elso10SzamOsszege() + "\n********************************");
        kiirKonzolra("\nnéhány szám összege, gyöke:\n");

        f2_KettoSzamOsszegeKiirva();
        f3_HaromSzamOsszegenekGyokeKiirva();
        f4_NegySzamOsszegeKiirva();
        
        }
    
    public static void kiirKonzolra(String szoveg){
        System.out.println(szoveg + " ");
    }
    
    static int osszead(int a, int b){
        return a+b;
    }
    
    static int f1_elso10SzamOsszege(){
        int osszeg = 0;
         for (int i = 0; i <= 10; i++){
             osszeg += i;
         }
        return osszeg;
    }
    
    static void f2_KettoSzamOsszegeKiirva(){
        int a = 3;
        int b = 4;
        String text = "%d+%d=%d".formatted(a, b, osszead(a, b));
        kiirKonzolra(text);
        
    }
    
    static void f3_HaromSzamOsszegenekGyokeKiirva(){
        int a = 3;
        int b = 4;
        int c = 5;
        String text = "%d+%d+%d gyöke az".formatted(a,b,c);
        kiirKonzolra(text);
        c = c + osszead(a, b);
        double gyok = Math.sqrt(c);
        String str = "%.4f".formatted(gyok);
        kiirKonzolra(str);
    }
    
    static void f4_NegySzamOsszegeKiirva(){
        int a = 3;
        int b = 4;
        int c = 7;
        int d = -1;
        int osszeg = osszead(osszead(a, b),osszead(c, d));
        String text = "%d+%d+%d+%d=%d\n".formatted(a,b,c,d, osszeg);
        kiirKonzolra(text);
    }
    
    void eljaras(){
        System.out.println("Eljárás");
    }
    
    int fuggveny(int szam){
       
    return szam *2;
    }
        
}

