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
public class TemberengBola extends Bola{
     public double tinggi, jariJariDasar, jariJariAtas;
    
    public void setTinggi(double inputTinggi)
    {
        tinggi = inputTinggi;
    }
    public void setJariJariDasar(double inputJariJariDasar)
    {
        jariJariDasar = inputJariJariDasar;
    }
    public void setJariJariAtas(double inputJariJariAtas)
    {
        jariJariAtas = inputJariJariAtas;
    }
    
    @Override
    public double hitungVolume() {
        return (phi*tinggi*((3*Math.pow(jariJariDasar, 2)+(3*Math.pow(jariJariAtas, 2)+Math.pow(tinggi, 2)))))/6;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return (2*phi*jariJari*tinggi)+(phi*Math.pow(jariJariDasar, 2));
    }
}
