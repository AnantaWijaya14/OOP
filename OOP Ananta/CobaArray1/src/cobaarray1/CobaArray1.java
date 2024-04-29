/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaarray1;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class CobaArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int i;
        int[] a = new int[5];
        int sum = 0;
        int max = a[0];
        float avg;
        

        for (i = 0; i < 5; i++) {
            System.out.print("Masukan Angka ke-" + i + " :");
            a[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.println("Angka Yang di Input");
        System.out.println("---------------------");

        for (i = 0; i < 5; i++) {
            System.out.println("Angka ke - " + i + ": " + a[i]);
        }
        for (i =0; i < 5; i++) {
            sum += a[i];
            if (a[i]> max){
                max= a[i];
            }
            
        }
        int min =a[0];
        for(i=0; i<5;i++){
        if (a[i]<min){
            min = a[i];
        }
        }
        avg =sum/5;
         System.out.println("Total = " + sum);
         System.out.println("Total = " + avg);
         System.out.println("Nilai Maximum adalah = " + max);
         System.out.println("Nilai Min adalah = " + min);
         
//         System.out.println("Mencari nilai maxsimum pada array = " + avg);
//         System.out.println("Mencari nilai minimum pada array = " + avg);
    }
}
