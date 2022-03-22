/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KitapSatisFirmasi;

import static KitapSatisFirmasi.Kullanici.kullanicilar;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Yönetici extends Kullanici {
    
    public static ArrayList<Yönetici> yöneticiler= new ArrayList(); 

    
    public Yönetici(String adsoyad, String sifre){
     this.ad_soyad = adsoyad;
     this.sifre = sifre;
     yöneticiler.add(this); }
}
