/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TV_Program_Takibi;

import static TV_Program_Takibi.Kullanici.kullanicilar;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Yönetici {
    
    public static ArrayList<Yönetici> yöneticiler= new ArrayList(); 
    String ad_soyad;
    String sifre;
    
    public Yönetici(String adsoyad, String sifre){
     this.ad_soyad = adsoyad;
     this.sifre = sifre;
     yöneticiler.add(this); }
}
