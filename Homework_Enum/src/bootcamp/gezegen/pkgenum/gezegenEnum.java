/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp.gezegen.pkgenum;

import java.util.Scanner;

public class gezegenEnum {

//  gezegenler yazılırken yerçekimi kuvvetleri de yapıcı metot sayesinde kaydedildi.
    public enum gezegenIsimleri {

        MERKUR(3.7), VENUS(8.87), MARS(3.7), JUPITER(25.8), SATURN(10.44), URANUS(8.69), NEPTUN(11.15);

        private double yerCekimi;

//getYercekimi metodu ile yercekimi kuvvetlerini kullanabileceğiz.
        public double getYerCekimi() {
            return yerCekimi;
        }

//      gezegenlerin yerçekimi kuvvetini atamak  için yapıcı metot kullanıyorum.
        private gezegenIsimleri(double yerCekimi) {
            this.yerCekimi = yerCekimi;
        }

    }

    public static void agırlıkHesabı(double agırlık) {

        double sonuc;

        double dunya_yercekimi_kuvveti = 9.8;

        // G=m*g (Ağırlık=kütle*yerçekimi kuvveti) formülünü kullanarak kütleyi hesaplıyorum.
        double kutle = agırlık / dunya_yercekimi_kuvveti;

//        bu döngü ile ağırlıkları hesaplayıp konsola yazdırıyorum.
        for (gezegenIsimleri g : gezegenIsimleri.values()) {

            sonuc = kutle * g.getYerCekimi();
            System.out.println(g.name() + ":  " + (float) sonuc);

        }

    }

    public static void main(String[] args) {

        //kullanıcıdan agırlık bilgisini alıyorum
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ağırlığınızı giriniz");

        double agırlık = scanner.nextDouble();

        agırlıkHesabı(agırlık);

    }

}
