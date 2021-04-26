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
public class CincinBola extends Bola{
//    k = panjang tali busur
//    t = tinggi cincin
    public double k,t,jariAtas,jariBawah;

     public void setTinggi(double inputTinggi)
    {
        t = inputTinggi;
    }
      public void setBusur(double inputBusur)
    {
        k = inputBusur;
    }

    public void setJariAtas(double inputjariAtas) {
        jariAtas = inputjariAtas;
    }

    public void setJariBawah(double inputjariBawah) {
        jariBawah = inputjariBawah;
    }
    
    @Override
    public double hitungVolume() {
        return (phi*t*k*k)/6;
    }

    @Override
    public double hitungLuasPermukaan() {
        return (2*phi*jariJari*t)+(phi*k*(jariBawah+jariAtas));
    }

  }
