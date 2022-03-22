/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nothesaplayici;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Lenovo
 */
public class NotHesaplayici extends JFrame {

    private JTextField jtfVizeNotu = new JTextField();
    private JTextField jtfFinalNotu = new JTextField();
    private JTextField jtfLabNotu = new JTextField();
    private JTextField jtfDonemSonuNotu = new JTextField();
    private JTextField jtfHarfNotu = new JTextField();

    private JButton jbtNotHesapla = new JButton("Not Hesapla");

    Random a = new Random();

    public NotHesaplayici() {

        JPanel p1 = new JPanel(new GridLayout(5, 2));

        p1.add(new JLabel("Vize Notu"));
        p1.add(jtfVizeNotu);
        p1.add(new JLabel("Final Notu"));
        p1.add(jtfFinalNotu);
        p1.add(new JLabel("Lab Notu"));
        p1.add(jtfLabNotu);
        p1.add(new JLabel("Dönem Sonu Notu"));
        p1.add(jtfDonemSonuNotu);
        p1.add(new JLabel("Harf Notu"));
        p1.add(jtfHarfNotu);
        p1.setBorder(new TitledBorder("Vize, Final ve Lab Notu Giriniz"));

        jtfDonemSonuNotu.setEditable(false); //elle değişmesin diye.
        jtfHarfNotu.setEditable(false);

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2.add(jbtNotHesapla);

        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        this.setFocusable(true);

        jbtNotHesapla.addActionListener(new ButonDinleyici()); //butona olay dinleme özelliği ekliyorum.  

        this.addKeyListener(new KeyDinleyici());

        jbtNotHesapla.addMouseListener(new MouseDinleyici());

        this.addWindowListener(new WindowDinleyici());
    }

    public class WindowDinleyici extends WindowAdapter {

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("Program küçültüldü");

            int a = Integer.parseInt(jtfVizeNotu.getText());

            jtfVizeNotu.setText(String.valueOf(a - 10));

        }

        /**
         *
         * @param e
         */
        @Override
        public void windowClosing(WindowEvent e) {

            System.out.println("Program kapatılıyor");

        }

    }

    private class MouseDinleyici implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {

        }

        @Override
        public void mousePressed(MouseEvent me) {

        }

        @Override
        public void mouseReleased(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {

            jbtNotHesapla.setForeground(Color.green);

        }

        @Override
        public void mouseExited(MouseEvent me) {

            jbtNotHesapla.setForeground(null);

        }

    }

    private class KeyDinleyici implements KeyListener {

        @Override
        public void keyTyped(KeyEvent ke) {

        }

        @Override
        public void keyPressed(KeyEvent ke) {

            if (ke.getKeyCode() == KeyEvent.VK_R) {

                jtfVizeNotu.setText(Integer.toString(a.nextInt(101)));
                jtfFinalNotu.setText(Integer.toString(a.nextInt(101)));
                jtfLabNotu.setText(Integer.toString(a.nextInt(101)));

            }

        }

        @Override
        public void keyReleased(KeyEvent ke) {

        }

    }

    private class ButonDinleyici implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            int vize = Integer.parseInt(jtfVizeNotu.getText());
            int finall = Integer.parseInt(jtfFinalNotu.getText());
            int lab = Integer.parseInt(jtfLabNotu.getText());

            Ogrenci ogrenci = new Ogrenci(vize, finall, lab);

            double donemSonuNotu = ogrenci.DonemSonuNotHesaplama();

            jtfDonemSonuNotu.setText(String.format("%.2f", donemSonuNotu));

            jtfHarfNotu.setText(ogrenci.HarfNotuHesaplama());

        }

    }

    public static void main(String[] args) {
        NotHesaplayici frame = new NotHesaplayici();

        frame.pack();
        frame.setTitle("Not Hesaplayici");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
