/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TV_Program_Takibi;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Program {

    public static ArrayList<Program> programlar = new ArrayList();

    String adi;

    String tür;

    String saati;

    String günü;

    String kanal;
  
    
    
    static void defaultProgramEkle() {

        Program x = new Program();
        x.adi = "Ezel";
        x.tür = "Dizi";
        x.saati = "20:00";
        x.günü = "Carsamba";
        x.kanal = "Show Tv";
        Program.programlar.add(x);

        Program y = new Program();
        y.adi = "Leyla İle Mecnun";
        y.tür = "Komedi";
        y.saati = "20:00";
        y.günü = "Salı";
        y.kanal = "TRT 1";
        Program.programlar.add(y);

        Program m = new Program();
        m.adi = "İstanbullu Gelin";
        m.tür = "Dizi";
        m.saati = "20:00";
        m.günü = "Salı";
        m.kanal = "Star Tv";
        Program.programlar.add(m);
    }

// }
    @Override
    public String toString() {
        return adi; //To change body of generated methods, choose Tools | Templates.
    }

}
