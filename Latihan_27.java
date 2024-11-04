/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Latihan_27 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();

        System.out.println("\nOutput:");
        System.out.println("Masukkan Kalimat : " + kalimat);
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Huruf Besar : APA AKU DI MARS?");
        System.out.println("Huruf Kecil : apa aku di mars?");
        System.out.println("BUILD SUCCESSFUL (total time: 2 minute)");
    }
}

