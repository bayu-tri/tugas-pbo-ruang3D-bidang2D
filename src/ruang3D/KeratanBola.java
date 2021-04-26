/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3D;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class KeratanBola extends Bola{
    
    public double tinggi,jariAtas,jariBawah;

    public void setTinggi(double inputTinggi) {
        tinggi = inputTinggi;
    }

    public void setJariAtas(double inputjariAtas) {
        jariAtas = inputjariAtas;
    }

    public void setJariBawah(double inputjariBawah) {
        jariBawah = inputjariBawah;
    }
    
    public double luasKeratan(){
        return (2*phi*jariJari*tinggi)+(phi*Math.pow(jariBawah, 2))+(phi*Math.pow(jariAtas,2));
    }
        
    public double volumeKeratan(){
       return ((phi*Math.pow(jariBawah, 2))/2)+ ((phi*Math.pow(jariAtas,2))/2) + ((phi*Math.pow(tinggi,3))/3);
    }
}
