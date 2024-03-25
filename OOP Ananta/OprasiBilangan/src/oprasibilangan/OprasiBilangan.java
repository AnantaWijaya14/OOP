/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oprasibilangan;

/**
 *
 * @author INSTIKI
 */
public class OprasiBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float b1,b2,tmbh,krg,bgi, kli;
        b1=20;
        b2=3;
        tmbh = b1+b2;
        krg = b1-b2;
        bgi = b1/b2;
        kli = b1*b2;
        
        //sederhana
        System.out.println("Sederhana\n");
        System.out.println("Hasil dari pengurangan ini adalah : " + tmbh);
        System.out.println("Hasil dari pengurangan ini adalah : " + krg);
        System.out.println("Hasil dari Pembagian ini adalah : " + bgi);
        System.out.println("Hasil dari pengurangan ini adalah : " + kli);
        
        //Ribet gis
        System.out.println("Ribet gis\n");
        System.out.println(b1 + " + " + b2 + "= " + tmbh);
        System.out.println(b1 + " - " + b2 + "= " + krg);
        System.out.println(b1 + " : " + b2 + "= " + String.format("%.2f",bgi));
        System.out.println(b1 + " x " + b2 + "= " + kli);
        
    }
    
}
