package com.rizlahicha;


import java.io.Console;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String choice;
        Double hargaTemp;
        Console console = System.console();
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("'IDR. '##,###.##");

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

        if(choice.equals("1")){
            hargaTemp = 100000.00;
            System.out.println("Avenger Dengan Harga Tiket "+decimalFormat.format(hargaTemp));
        }else if(choice.equals("2")){
            hargaTemp = 50000.00;
            System.out.println("Final Destination Harga Tiket "+decimalFormat.format(hargaTemp));
        } else if(choice.equals("3")){
            hargaTemp = 40000.000;
            System.out.println("Terminator Harga Tiket "+decimalFormat.format(hargaTemp));
        } else if(choice.equals("4")){
            hargaTemp = 35000.00;
            System.out.println("AADC2 Harga Tiket "+decimalFormat.format(hargaTemp));
        } else if(choice.equals("5")){
            hargaTemp = 20000.00;
            System.out.println("Titanaic Harga Tiket "+decimalFormat.format(hargaTemp));
        } else {
            System.out.println("No Yang Anda Pilih Tidak Ada ....!");
        }


    }
}
