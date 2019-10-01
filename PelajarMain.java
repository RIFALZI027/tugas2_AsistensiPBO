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
public class PelajarMain {
public static void main(String[] args){
    Pelajar p1 = new Pelajar();
    Pelajar p2 = new Pelajar();
    p1.setNilaiujian1(30);
    p1.status();
    System.out.println();
    p2.setNilaiujian2(55);
    p2.status();
    }
}
