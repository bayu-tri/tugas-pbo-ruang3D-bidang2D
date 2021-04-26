/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3D;

import bidang2D.Lingkaran;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class Kerucut extends Lingkaran{
    public double tinggi;
    public double s;
    
    public void setTinggi(double inputTinggi)
    {
        tinggi = inputTinggi;
    }
    
    public double hitungLuasPermukaan()
    {
        s = Math.sqrt(Math.pow(jariJari, 2)+Math.pow(tinggi, 2));
        return hitungLuas()+(phi*jariJari*s);
    }
    public double hitungVolume()
    {
        return (hitungLuas()*tinggi)/3;
    }
}
