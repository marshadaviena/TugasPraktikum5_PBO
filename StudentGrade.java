/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marshapraktikum5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan NPM Mahasiswa: ");
        String npm = input.nextLine();
        System.out.print("Masukan Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukan Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Masukan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();
        System.out.print("Masukkan Nilai Akhir: ");
        double nilaiAkhir = input.nextDouble();
        double nilaiTotal = (0.10 * nilaiKehadiran) + (0.20 * nilaiUTS) + (0.30 * nilaiUAS) + (0.40 * nilaiAkhir);

        
        char grade;
        String keterangan;
        
        if (nilaiTotal >= 76 && nilaiTotal <= 100) {
            grade = 'A';
            keterangan = "ISTIMEWA";
        } else if (nilaiTotal >= 66 && nilaiTotal < 76) {
            grade = 'B';
            keterangan = "BAIK";
        } else if (nilaiTotal >= 56 && nilaiTotal < 66) {
            grade = 'C';
            keterangan = "CUKUP";
        } else if (nilaiTotal >= 46 && nilaiTotal < 56) {
            grade = 'D';
            keterangan = "KURANG";
        } else {
            grade = 'E';
            keterangan = "KURANG SEKALI";
        }
        
        System.out.println("\n=== TAMPILAN OUTPUT===");
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.printf("Nilai Rata-Rata : %.3f\n", nilaiTotal);
        System.out.println("Grade             : " + grade);
        System.out.println("Keterangan        : " + keterangan);
        
    }
    
}
