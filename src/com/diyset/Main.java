package com.diyset;


import java.io.Console;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String choice;
        Double hargaTemp;
        final String  TAMBAH_TIKET_YES = "YES";
        final String  TAMBAH_TIKET_NO = "NO";
        Console console = System.console();
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("'IDR. '##,###.##");
        ArrayList<String> daftarTiket = new ArrayList<>();
        ArrayList<Double> hargaTiket = new ArrayList<>();
        String tambahMenu = "";
        int konstMenu = 1;

        double totalHarga = 0.0;
        do {
            System.out.println("Selamat Datang Di Applikasi Informasi");
            System.out.println("---------Harga Bioskop----------");

            System.out.println("List Film Hari ini :");
            System.out.println("1.Avenger");
            System.out.println("2.Final Destination");
            System.out.println("3.Terminator");
            System.out.println("4.AADC2");
            System.out.println("5.Titanic");

            System.out.println("Pilih No Film :");
            choice = scanner.next();

            if (choice.equals("1")) {
                hargaTemp = 100000.00;
                System.out.println("Avenger Dengan Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Avenger");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("2")) {
                hargaTemp = 50000.00;
                System.out.println("Final Destination Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Final Destination");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("3")) {
                hargaTemp = 40000.000;
                System.out.println("Terminator Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Terminator");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("4")) {
                hargaTemp = 35000.00;
                System.out.println("AADC2 Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("ADDC2");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("5")) {
                hargaTemp = 20000.00;
                System.out.println("Titanic Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Titanic");
                hargaTiket.add(hargaTemp);
            } else {
                System.out.println("No Yang Anda Pilih Tidak Ada ....!");
                return;
            }
            boolean isTypo = false;
            do {
                System.out.println("Apakah anda ingin membeli tiket lagi (YES/NO)");
                tambahMenu = scanner.next();
                if(TAMBAH_TIKET_YES.equals(tambahMenu)){
                    isTypo = true;
                    konstMenu =1;
                }else if(TAMBAH_TIKET_NO.equals(tambahMenu)){
                    isTypo = true;
                    konstMenu = 0;
                }else {
                    System.out.println("Jangan Typo Periksa Kembali ...!");
                }
            } while (!isTypo);



        } while (1==konstMenu);


        System.out.println("Total Pembelian");
        int noIndex = 1;
        for (int i = 0; i <daftarTiket.size();i++){
            noIndex += i;
            System.out.println(noIndex+". "+daftarTiket.get(i));
            totalHarga = totalHarga + hargaTiket.get(i).intValue();
        }
        System.out.println("Total Harga "+decimalFormat.format(totalHarga));
    }
}
