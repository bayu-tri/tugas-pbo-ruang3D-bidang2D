/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;

import ruang3D.Bola;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class TugasPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Just a testing
        Bola bola = new Bola();
        bola.setJariJari(7);
        System.out.println(bola.hitungLuasPermukaan());
        System.out.println(Math.pow(bola.jariJari, 3));
    }
    
}
