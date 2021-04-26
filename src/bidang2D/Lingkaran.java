/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang2D;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class Lingkaran implements Bidang2D{
    public double phi = 3.14;
    public double jariJari;
    public double keliling;
    public double luas;
    
    public void setJariJari(double inputJariJari)
    {
        jariJari = inputJariJari;
    }
    @Override
    public double hitungLuas()
    {
        luas = phi*(Math.pow(jariJari, 2));
        return luas;
    }
    @Override
    public double hitungKeliling()
    {
        keliling = 2*phi*jariJari;
        return keliling;
    }
}
