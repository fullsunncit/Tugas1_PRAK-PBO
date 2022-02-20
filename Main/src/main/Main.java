/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 *
 * @author acer
 */
package main;

import java.util.Scanner;
import main.Konversi;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int inputcelcius;
        int pilih;
        boolean pilihan = true;
        
        System.out.println("Nama : Nur Rosydatun Nafiah");
        System.out.println("NIM  : 123200001\n\n");
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Input Suhu dalam Celcius = ");
        inputcelcius = input.nextInt();
        
        
        Konversi dataKonversi = new Konversi(inputcelcius);
     
        while (pilihan){
            System.out.println("\nOpsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. EXIT\n");
            System.out.print("PILIH = ");
            pilih = input.nextInt();
            
            if(pilih == 1){
                dataKonversi.simpan();
            }
            else if (pilih == 2){
                System.out.println("\nInput Data");
                System.out.println("----------\n");
                System.out.print("Suhu dalam celcius = ");
                dataKonversi.inputcelcius = input.nextInt();
            }
            else if (pilih == 3){
                pilihan = false;
            }
            else{
                System.out.println("Pilihan Anda tidak ada,\n Silahkan Ulangi Kembali!!");
                pilihan = true;
            }
        }
        
    }
    
}
