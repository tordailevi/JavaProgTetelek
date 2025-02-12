
package program;


public class Sarkanyok {
    
    public static void main(String[] args) {
        
        //SÁRKÁNYOK FELADAT
        
        /*int sarkany1 = 7;
        int sarkany2 = 11;
        int osszeg = 145;
        int sarkany1Szamlalo = 0;
        int sarkany2Szamlalo = 0;
        
        for (int i = 0; i < 20; i++){
            for (int j = 0; i < 13; i++){
                if ((i*sarkany1) + (j*sarkany2) == osszeg){
                    sarkany1Szamlalo += i;
                    sarkany2Szamlalo += j;
                    System.out.printf("7 fejű sárkányból: %d 11 fejű sárkányból: %d", sarkany1Szamlalo, sarkany2Szamlalo);
                }
            }
        }*/

        //VÁSÁR FELADAT
        
        double sertes = 3.5;
        double kecske = 1.33;
        double juh = 0.5;
        for(int i = 0; i < 28; i++){
            for(int j = 0; j < 72; j++){
                for(int k = 0; k < 100; k++){
                    if(i*3.5 + j*1.33 + k*0.5 == 100){
                        if(i >= 1 && j >= 1 && k >= 1){
                            int db = 100;
                            double arany = i*3.5 + j*1.33 + k*0.5;
                            if(db == 100 && arany == 100){
                            System.out.printf("Sertésből: %d Kecskéből: %d Juhból: %d\n",i,j,k);
                            }
                        }
                    }
                }
            }
        }
        
                    
        
        
        
        
        
        
    }
}
