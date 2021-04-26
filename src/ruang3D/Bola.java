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
public class Bola extends Lingkaran{
    public double hitungLuasPermukaan()
    {
        return 4*phi*(Math.pow(jariJari, 2));
    }
    public double hitungVolume()
    {
        return (4*phi*Math.pow(jariJari, 3))/3;
    }
}
