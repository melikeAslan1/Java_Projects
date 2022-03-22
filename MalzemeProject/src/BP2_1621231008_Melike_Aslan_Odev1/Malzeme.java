/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BP2_1621231008_Melike_Aslan_Odev1;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Malzeme {

    public static ArrayList<Malzeme> malzemeler = new ArrayList();

   

    String adi;

    String tür;

    String ToplamKacAdet;

    String StokAdet;

    String DezenfekteyeGidenAdet;
    
    String SuanKullanılanAdet;
    
    
      static void defaultMalzemeEkle() {

        Malzeme x = new Malzeme();
        x.adi = "Neşter";
        x.tür = "Cerrahi";
        x.ToplamKacAdet= "100";
        x.DezenfekteyeGidenAdet= "89";
        x.SuanKullanılanAdet= "89";
        x.StokAdet= "89";
              
        Malzeme.malzemeler.add(x);

        Malzeme y = new Malzeme();
        y.adi = "Enjektör";
        y.tür = "Cerrahi";
        y.ToplamKacAdet= "89";
        y.DezenfekteyeGidenAdet= "89";
        y.SuanKullanılanAdet= "89";
        y.StokAdet= "89";
        
        Malzeme.malzemeler.add(y);

       
    }

// }
    @Override
    public String toString() {
        return adi; //To change body of generated methods, choose Tools | Templates.
    }

}
