/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KitapSatisFirmasi;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Kitap {

    public static ArrayList<Kitap> kitaplar = new ArrayList();

    String adi;

    String yazari;

    String sayfaSayisi;

    
  
    
    
    static void defaultKitapEkle() {

        Kitap x = new Kitap();
        x.adi = "Çalıkuşu";
        x.yazari = "Reşat Nuri Güntekin";
        x.sayfaSayisi = "300";
       
        Kitap.kitaplar.add(x);

        Kitap y = new Kitap();
        y.adi = "Kuyucaklı Yusuf";
        y.yazari = "Sabahattin Ali";
        y.sayfaSayisi = "350";
       
        Kitap.kitaplar.add(y);

        Kitap m = new Kitap();
        m.adi = "İntibah";
        m.yazari = "Namık Kemal";
        m.sayfaSayisi = "230";
       
        Kitap.kitaplar.add(m);
    }

// }
    @Override
    public String toString() {
        return adi; //To change body of generated methods, choose Tools | Templates.
    }

}
