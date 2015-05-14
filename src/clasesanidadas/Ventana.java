package clasesanidadas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Alex Urcera
 */
public class Ventana {

    JFrame marco;
    JPanel panel;
    JButton boton;
    JButton botonR;
    JButton botonG;
    JButton botonB;
    FlowLayout dis = new FlowLayout();

    public void amosarVentana() {
        marco = new JFrame("   ventanas anidadas   ");
        panel = new JPanel();
        boton = new JButton("Boton");
        botonR = new JButton("ROjo");
        botonG = new JButton("Verde");
        botonB = new JButton("Azul");
        marco.setSize(500, 500);
        panel.setSize(500, 500);
        boton.setSize(100, 200);
        panel.setLayout(dis);
        panel.add(botonB);
        panel.add(botonR);
        panel.add(botonG);

        panel.add(boton);
        marco.add(panel);
        //Con clases anidadas
        boton.addActionListener(new Event());
        botonR.addActionListener(new Erojo());
        botonB.addActionListener(new Eazul());
        //Con clase anonima
        botonG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                panel.setBackground(Color.GREEN);
            }

        });
        botonG.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.red);
            }
        });
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class Event implements ActionListener {

        public Event() {
            JFrame mar = new JFrame("csdvsdc");
            mar.setSize(300, 300);
            mar.setVisible(true);
            mar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Event obx = new Event();

        }

    }

    class Erojo implements ActionListener {

        public Erojo() {
            panel.setBackground(Color.RED);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Erojo roj = new Erojo();

        }

    }

    class Eazul implements ActionListener {

        public Eazul() {
            panel.setBackground(Color.BLUE);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Eazul blu = new Eazul();

        }

    }

}
