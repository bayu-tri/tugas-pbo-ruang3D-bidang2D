/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import bidang2D.*;
import ruang3D.*;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int pilih=0,pilih2;
        Scanner input = new Scanner (System.in);
            
        while(pilih!=3){
                System.out.println("\nMENU");
                System.out.println("1. Bidang ");
                System.out.println("2. Ruang");
                System.out.println("3. EXIT");
                System.out.print("PILIH : ");
                pilih = input.nextInt();
                
            if (pilih==1) {  
                
                System.out.println("\nMENU BIDANG");
                System.out.println("1. Lingkaran");
                System.out.println("2. Exit");
                System.out.print("PILIH : ");
                pilih2 = input.nextInt();
                switch(pilih2){ 
                case 1 -> {
                            double r;
                            System.out.println("\nLingkaran");
                            System.out.print("Masukkan Jari-Jari : ");
                            r = input.nextInt();
                            Lingkaran lk = new Lingkaran();
                            lk.setJariJari(r);
                            System.out.println("\nLuas Lingkaran : " + lk.hitungLuas());
                            System.out.println("\nKeliling Lingkaran : " + lk.hitungKeliling());                    
                        }
                case 2 -> {
                        } 
                }
            }
            else if (pilih==2) {
                System.out.println("\nMENU RUANG");
                System.out.println("1. Tabung");
                System.out.println("2. Kerucut");
                System.out.println("3. Kerucut Terpancung");
                System.out.println("4. Bola");
                System.out.println("5. Juring Bola");
                System.out.println("6. Temberen Bola");
                System.out.println("7. Keratan Bola");
                System.out.println("8. Cincin Bola");
                System.out.println("9. Exit");
                System.out.print("PILIH : ");
                pilih2 = input.nextInt();
                switch(pilih2){
                case 1 -> {  
                            double r,t;
                            System.out.println("\nTabung");
                            System.out.print("Masukkan Jari-Jari : ");
                            r = input.nextInt();
                            System.out.print("Masukkan Tinggi : ");
                            t = input.nextInt();
                            Tabung tbg = new Tabung();
                            tbg.setJariJari(r);
                            tbg.setTinggi(t); 
                            System.out.println("\nVolume Tabung : " + tbg.hitungVolume());
                            System.out.println("Luas Permukaan Tabung : " + tbg.hitungLuasPermukaan());
                            System.out.println();
                        }
                case 2 -> { 
                            double r,t;
                            System.out.println("\nKerucut ");
                            System.out.print("Masukkan Jari-Jari : ");
                            r = input.nextInt();
                            System.out.print("Masukkan Tinggi : ");
                            t = input.nextInt();
                            Kerucut kc = new Kerucut();
                            kc.setJariJari(r);
                            kc.setTinggi(t); 
                            System.out.println("\nVolume Kerucut : " + kc.hitungVolume());
                            System.out.println("Luas Permukaan Kerucut : " + kc.hitungLuasPermukaan());
                        }
                case 3 -> {
                            double r,t,rA;
                            System.out.println("\nKerucut Terpancung");
                            System.out.print("Masukkan Jari-Jari Alas : ");
                            r = input.nextInt();
                            System.out.print("Masukkan Tinggi : ");
                            t = input.nextInt();
                            System.out.print("Masukkan Jari-Jari Atas : ");
                            rA = input.nextInt();
                            KerucutTerpancung kt = new KerucutTerpancung();
                            kt.setJariJari(r);
                            kt.setTinggi(t); 
                            kt.setJariAtas(rA);
                            System.out.println("\nVolume Kerucut : " + kt.hitungVolume());
                            System.out.println("Luas Permukaan Kerucut : " + kt.hitungLuasPermukaan());
                        }
                case 4 -> {
                            double r;
                            System.out.println("\nBola");
                            System.out.print("Masukkan Jari-Jari : ");
                            r = input.nextInt();
                            Bola bola = new Bola();
                            bola.setJariJari(r);
                            System.out.println("\nVolume Bola : " + bola.hitungLuasPermukaan());
                            System.out.println("Luas Permukaan Bola : " + Math.pow(bola.jariJari, 3));
                        }
                case 5 -> {
                            double r,t,rD;
                            System.out.println("\nJuring Bola"); 
                            System.out.print("Masukkan Jari-Jari Bola : ");
                            r = input.nextInt();
                            System.out.print("Masukkan Tinggi : ");
                            t = input.nextInt();
                            System.out.print("Masukkan Jari-Jari Dasar : ");
                            rD = input.nextInt();
                            JuringBola jb = new JuringBola();
                            jb.setJariJari(r);
                            jb.setTinggi(t);
                            jb.setJariDasar(rD);
                            System.out.println("\nVolume Juring Bola : " + jb.hitungVolume());
                            System.out.println("Luas Permukaan Juring Bola : " + jb.hitungLuasPermukaan());
                        }
                case 6 -> {
                            double r,t,rD,rA;
                            System.out.println("\nTembereng Bola"); 
                            System.out.print("Masukkan Jari-Jari Bola : ");
                            r = input.nextInt();
                            System.out.print("Masukkan Tinggi : ");
                            t = input.nextInt();
                            System.out.print("Masukkan Jari-Jari Dasar : ");
                            rD = input.nextInt();
                            System.out.print("Masukkan Jari-Jari Atas : ");
                            rA = input.nextInt();
                            TemberengBola tb = new TemberengBola();
                            tb.setJariJari(r);
                            tb.setTinggi(t);
                            tb.setJariJariDasar(rD);
                            tb.setJariJariAtas(rA);
                            System.out.println("\nVolume Tembereng Bola : " + tb.hitungVolume());
                            System.out.println("Luas Permukaan Tembereng Bola : " + tb.hitungLuasPermukaan());
                        }
                case 7 -> {
                            double r,t,rA,rB;
                            System.out.println("\nKeratan Bola"); 
                            System.out.print("Masukkan Jari-Jari Bola : ");
                            r = input.nextInt();
                            System.out.print("Masukkan Tinggi : ");
                            t = input.nextInt();
                            System.out.print("Masukkan Jari-Jari Atas : ");
                            rA = input.nextInt();
                            System.out.print("Masukkan Jari-Jari Bawah : ");
                            rB = input.nextInt();
                            KeratanBola kb = new KeratanBola();
                            kb.setJariJari(r);
                            kb.setTinggi(t); 
                            kb.setJariAtas(rA);
                            kb.setJariBawah(rB);
                            System.out.println("\nVolume Keratan Bola : " + kb.hitungVolume());
                            System.out.println("Luas Permukaan Keratan Bola : " + kb.hitungLuasPermukaan());
                        }
                case 8 -> {
                            double r,t,b,rA,rB;
                            System.out.println("\nCincin Bola"); 
                            System.out.print("Masukkan Jari-Jari Bola : ");
                            r = input.nextInt();
                            System.out.print("Masukkan Tinggi : ");
                            t = input.nextInt();
                            System.out.print("Masukkan Panjang Tali Busur : ");
                            b = input.nextInt();
                            System.out.print("Masukkan Jari-Jari Atas : ");
                            rA = input.nextInt();
                            System.out.print("Masukkan Jari-Jari Bawah : ");
                            rB = input.nextInt();
                            CincinBola cb = new CincinBola();
                            cb.setJariJari(r);
                            cb.setTinggi(t);
                            cb.setBusur(b);
                            cb.setJariAtas(rA);
                            cb.setJariBawah(rB);
                            System.out.println("\nVolume Cincin Bola : " + cb.hitungVolume());
                            System.out.println("Luas Permukaan Cincin Bola : " + cb.hitungLuasPermukaan());
                        }
                case 9 -> {
                    }
                }
                } 
            } 
        }
}