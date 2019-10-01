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
public class Pelajar {
private String nama;
private int nip,nilaiujian1,nilaiujian2,nilaitugas;
public Pelajar(){
    this.nama = "RIFALZI";
    this.nip = 001;
    this.nilaiujian1 = 80;
    this.nilaiujian2 = 75;
    this.nilaitugas = 70;
}
public void setNama (String n){
    this.nama = n;
}
public void setNip (int nip){
    this.nip = nip;
}
public void setNilaiujian1 (int nil1){
    this.nilaiujian1 = nil1;
}
public void setNilaiujian2 (int nil2){
    this.nilaiujian2 = nil2;
}
public void setNilaitugas (int nilt){
    this.nilaitugas = nilt;
}
public String getNama(){
    return nama;
}
public int getNip(){
    return nip;
}
public int getNilaiujian1(){
    return nilaiujian1;
}
public int getNilaiujian2(){
    return nilaiujian2;
}
public int getNilaitugas(){
    return nilaitugas;
}
public double nilaiAkhir(){
    double na = 0.4*(double)getNilaiujian1()+0.4*(double)getNilaiujian2()+0.2*(double)getNilaitugas();
    return na;
}
public String isLulus(){
    String a;
    if(nilaiAkhir()>=60){
        a = "Lulus";
    } else {
        a = "Tidak lulus";
    }
    return a;
}
public void status(){
    System.out.println("Nama\t\t : "+getNama());
    System.out.println("NIP\t\t : "+getNip());
    System.out.println("Nilai Ujian 1\t : "+getNilaiujian1());
    System.out.println("Nilai Ujian 2\t : "+getNilaiujian2());
    System.out.println("Nilai Tugas\t : "+getNilaitugas());
    System.out.println("Status\t\t : "+isLulus());   
    }
}
