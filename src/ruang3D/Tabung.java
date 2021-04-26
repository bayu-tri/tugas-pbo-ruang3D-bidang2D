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
public class Tabung extends Lingkaran{
    public double tinggi;
    
    public void setTinggi(double inputTinggi)
    {
        tinggi = inputTinggi;
    }
    public double hitungLuasPermukaan()
    {
        return hitungKeliling()*(jariJari+tinggi);
    }
    public double hitungVolume()
    {
        return hitungLuas()*tinggi;
    }
}
