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
public class Kullanici {
    public static ArrayList<Kullanici> kullanicilar= new ArrayList(); 
    String ad_soyad;
   // String mail;
    String sifre;
   ArrayList<Kitap> KitapListesi;

    public Kullanici() {
    }
      
 public Kullanici(String adsoyad, String sifre){
     this.ad_soyad = adsoyad;
     this.sifre = sifre;
     kullanicilar.add(this);
     KitapListesi=new ArrayList<>();
 }

   // public static KullaniciEkle(){
    //Kullanici user1 = new Kullanici("Ahmet", "0000");
 // }
}
