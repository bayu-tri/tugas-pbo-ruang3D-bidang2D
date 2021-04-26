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
public class JuringBola extends Bola{
    //    t = tinggi juring
    public double t,jariDasar;
   
     public void setTinggi(double inputTinggi)
    {
        t = inputTinggi;
    }

    public void setJariDasar(double inputjariDasar) {
        jariDasar = inputjariDasar;
    }
     
    @Override
    public double hitungVolume() {
        return (2*phi*Math.pow(jariJari,2)*t)/3;
    }

    @Override
    public double hitungLuasPermukaan() {
        return (2*phi*jariJari*t)+(phi*jariJari*jariDasar);
    }
     
     
}
