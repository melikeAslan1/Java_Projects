/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nothesaplayici;

/**
 *
 * @author Lenovo
 */
public class Ogrenci {

    private int VizeNotu;
    private int FinalNotu;
    private int LabNotu;

    double DonemSonuNotu;
    String HarfNotu;

    public Ogrenci(int VizeNotu, int FinalNotu, int LabNotu) {
        this.VizeNotu = VizeNotu;
        this.FinalNotu = FinalNotu;
        this.LabNotu = LabNotu;
    }

    public double getVizeNotu() {
        return VizeNotu;
    }

    public double getFinalNotu() {
        return FinalNotu;
    }

    public double getLabNotu() {
        return LabNotu;
    }

    public void setVizeNotu(int VizeNotu) {
        this.VizeNotu = VizeNotu;
    }

    public void setFinalNotu(int FinalNotu) {
        this.FinalNotu = FinalNotu;
    }

    public void setLabNotu(int LabNotu) {
        this.LabNotu = LabNotu;
    }

    public double DonemSonuNotHesaplama() {

        DonemSonuNotu = 0.3 * getVizeNotu() + 0.5 * getFinalNotu() + 0.2 * getLabNotu();

        return DonemSonuNotu;

    }

    public String HarfNotuHesaplama() {

        if (DonemSonuNotu <= 59) {

            HarfNotu = "FF";

        }

        if (DonemSonuNotu >= 60 && DonemSonuNotu <= 64) {

            HarfNotu = "DC";
        }

        if (DonemSonuNotu >= 65 && DonemSonuNotu <= 74) {

            HarfNotu = "CC";
        }

        if (DonemSonuNotu >= 75 && DonemSonuNotu <= 79) {

            HarfNotu = "CB";
        }

        if (DonemSonuNotu >= 80 && DonemSonuNotu <= 84) {

            HarfNotu = "BB";
        }

        if (DonemSonuNotu >= 85 && DonemSonuNotu <= 89) {

            HarfNotu = "BA";
        }

        if (DonemSonuNotu >= 90 && DonemSonuNotu <= 100) {

            HarfNotu = "AA";
        }
        return HarfNotu;
    }

}
