/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;

import ruang3D.Kerucut;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class TugasPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kerucut kerucut = new Kerucut();
        
        kerucut.setJariJari(7);
        kerucut.setTinggi(10);
        
        System.out.println(kerucut.hitungVolume());
        
    }
    
}
