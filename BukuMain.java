/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensipbo;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class BukuMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Pengarang\t : ");
        String namapengarang = input.nextLine();
        System.out.print("Masukkan Judul Buku\t : ");
        String judulbuku = input.nextLine();
        System.out.print("Masukkan Tahun Terbit\t : ");
        int tahunterbit = input.nextInt();
        System.out.print("Masukkan Cetakan ke\t : ");
        int cetakanke = input.nextInt();
        System.out.print("Masukkan Harga Jual\t : ");
        double hargajual = input.nextDouble();
        System.out.println();

        Buku b1 = new Buku();
        b1.setNamaPengarang(namapengarang);
        b1.setJudulBuku(judulbuku);
        b1.setTahunTerbit(tahunterbit);
        b1.setCetakanKe(cetakanke);
        b1.setHargaJual(hargajual);
        b1.infoBuku();
        
    }
}
