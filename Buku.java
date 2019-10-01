/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensipbo;

/**
 *
 * @author lenovo
 */
public class Buku {
    private String namaPengarang;
    private String judulBuku;
    private int tahunTerbit;
    private int cetakanKe;
    private double hargaJual;
    
    public Buku(){
    }
    
    // Mengisi Nama Pengarang
    public void setNamaPengarang(String np){
        this.namaPengarang = np;
    }
    // Mengisi Judul Buku
    public void setJudulBuku(String jb){
        this.judulBuku = jb;
    }
    // Mengisi Tahun Terbit
    public void setTahunTerbit(int tt){
        this.tahunTerbit = tt;
    }
    // Mengisi Cetakan ke 
    public void setCetakanKe(int ck){
        this.cetakanKe = ck;
    }
    // Mengisi Harga Jual
    public void setHargaJual(double hj){
        this.hargaJual = hj;
    }
    // Mendapatkan Nama Pengarang
    public String getNamaPengarang(){
        return namaPengarang;
    }
    // Mendapatkan Judul Buku
    public String getJudulBuku(){
        return judulBuku;
    }
    // Mendapatkan Tahun Terbit
    public int getTahunTerbit(){
        return tahunTerbit;
    }
    // Mendapatkan Cetakan ke
    public int getCetakanKe(){
        return cetakanKe;
    }
    // Mendapatkan Harga Jual
    public double getHargaJual(){
        return hargaJual;
    }
    
    public void infoBuku(){
        System.out.println("Nama Pengarang\t : "+getNamaPengarang());
        System.out.println("Judul Buku\t : "+getJudulBuku());
        System.out.println("Tahun Terbit\t : "+getTahunTerbit());
        System.out.println("Cetakan ke\t : "+getCetakanKe());
        System.out.println("Harga Jual\t : Rp"+getHargaJual()+"0");
    }
}