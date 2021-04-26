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
public class KerucutTerpancung extends Kerucut{
    public double jariAtas;
    
    public void setJariAtas(double inputJariAtas)
    {
        jariAtas = inputJariAtas;
    }
    
    @Override
    public double hitungLuasPermukaan()
    {
        s = Math.sqrt(Math.pow(jariJari, 2)+Math.pow(tinggi, 2));
        return (phi*s*(jariJari+jariAtas))+(phi*Math.pow(jariJari, 2))+(phi*Math.pow(jariAtas, 2));
    }
    @Override
    public double hitungVolume()
    {
        return (phi*tinggi*(Math.pow(jariJari, 2)*Math.pow(jariAtas, 2)+(jariJari*jariAtas)))/3;
    }
}
