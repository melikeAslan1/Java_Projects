/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BP2_1621231008_Melike_Aslan_Odev1;

import static BP2_1621231008_Melike_Aslan_Odev1.Kullanici.kullanicilar;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Yonetici {
    
    public static ArrayList<Yonetici> yöneticiler= new ArrayList(); 
    String ad_soyad;
    String sifre;
    
    
    public Yonetici(String adsoyad, String sifre){
     this.ad_soyad = adsoyad;
     this.sifre = sifre;
     yöneticiler.add(this); }
}
