package clasesanidadas;

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

    public void amosarVentana() {
        marco = new JFrame("   ventanas anidadas   ");
        panel = new JPanel();
        boton = new JButton("Boton");
        marco.setSize(500, 500);
        panel.setSize(500, 500);
        boton.setSize(100, 200);
        panel.setLayout(null);
        panel.add(boton);
        marco.add(panel);
        boton.addActionListener(new Event());
//        marco.pack();
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
}
