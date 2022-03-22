/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sıfrelemeyap;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SIFRELEMEYAP {

    public static String sifrele(String text, int key) {

        char[] buyukHarf = {'A', 'B', 'C', 'Ç', 'D', 'E', 'F', 'G', 'Ğ', 'H', 'I', 'İ', 'J', 'K', 'L', 'M', 'N', 'O', 'Ö',
            'P', 'R', 'S', 'Ş', 'T', 'U', 'Ü', 'V', 'Y', 'Z'};

        char[] kucukHarf = {'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'ğ', 'h', 'ı', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'ö',
            'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z'};

        String a = "";

        for (int i = 0; i < text.length(); i++) {

            int bul = 0;
            for (int j = 0; j < buyukHarf.length; j++) {

                if (text.charAt(i) == buyukHarf[j]) {

                    bul = 1;
                    if (j + key >= buyukHarf.length) {
                        int m = (j + key) % buyukHarf.length;
                        a += buyukHarf[m];
                    } else {
                        a += buyukHarf[j + key];
                    }

                } else if (text.charAt(i) == kucukHarf[j]) {

                    bul = 1;
                    if (j + key >= kucukHarf.length) {
                        int m = (j + key) % kucukHarf.length;
                        a += kucukHarf[m];

                    } else {
                        a += kucukHarf[j + key];
                    }

                }

            }
            if (bul == 0) {
                a+= text.charAt(i);
            }

        }

        return a;

    }

    public static String sifreCoz(String text, int key) {

        char[] buyukHarf = {'A', 'B', 'C', 'Ç', 'D', 'E', 'F', 'G', 'Ğ', 'H', 'I', 'İ', 'J', 'K', 'L', 'M', 'N', 'O', 'Ö',
            'P', 'R', 'S', 'Ş', 'T', 'U', 'Ü', 'V', 'Y', 'Z'};

        char[] kucukHarf = {'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'ğ', 'h', 'ı', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'ö',
            'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z'};

        String a = "";

        for (int i = 0; i < text.length(); i++) {
            int bul = 0;
            for (int j = 0; j < buyukHarf.length; j++) {

                if (text.charAt(i) == buyukHarf[j]) {
                    bul = 1;
                    int j2 = key % kucukHarf.length;
                    if (j - j2 < 0) {
                        int m = Math.abs(j - j2);
                        a += buyukHarf[buyukHarf.length - m];
                    } else {
                        a += buyukHarf[j - j2];
                    }

                } else if (text.charAt(i) == kucukHarf[j]) {
                    bul = 1;
                    int j2 = key % kucukHarf.length;
                    if (j - j2 < 0) {
                        int m = Math.abs(j - j2);
                        a += kucukHarf[kucukHarf.length - m];

                    } else {
                        a += kucukHarf[j - j2];
                    }

                }

            }

            if (bul == 0) {
                a += text.charAt(i);
            }
        }

        return a;

    }
    public static void main(String[] args) {

        System.out.println("1-Metin Şifrele\n"
                + "2-Şifrelenmiş Metni Çöz\n"
                + "3-Çıkış\n"
                + "Seçim ? = ");
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        String sifrelimesajim = "";

        while (secim != 3) {

            if (secim == 1) {
                System.out.println("metni giriniz :");
                String metin = input.next();
                System.out.println("Key değerini giriniz :");
                int key = input.nextInt();

                System.out.println("Şifreleme işlemi başarı ile tamamlandı !!");
                sifrelimesajim = sifrele(metin, key);
                System.out.println("sifreli mesaj= " + sifrelimesajim);
            }

            if (secim == 2) {

                if (sifrelimesajim == "") {
                    System.out.println("lütfen önce 1 numarayi secip sifreli mesaj oluşturunuz.");
                } else {
                    System.out.println("Key değerini giriniz :");
                    int key = input.nextInt();
                    System.out.println("Şifreli mesaj başarı ile çözülmüştür !!");
                    System.out.println("orjinal mesaj = " + sifreCoz(sifrelimesajim, key));
                  
                }

            }

            if (secim == 3) {

            }

            System.out.println("1-Metin Şifrele\n"
                    + "2-Şifrelenmiş Metni Çöz\n"
                    + "3-Çıkış\n"
                    + "Seçim ? = ");

            secim = input.nextInt();

        }

    }

    
    
    
    
    
}
