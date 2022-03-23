package boletin26;

import javax.swing.*;
import java.awt.*;

public class Compoñentes {
    JFrame ventana;
    JPanel panel;
    JButton boton1, boton2;
    JLabel etiqueta1, etiqueta2;
    JTextField texto1,texto2;
    JTextArea cuadroArea;



    public void compoñentes(){
        // establecemos la ventana
        ventana = new JFrame("VENTANA");

        // establecemos el panel
        panel = new JPanel();

        // establecemos los botones
        boton1 = new JButton( " PREMER");
        boton2 = new JButton(" LIMPAR");


        //establecemos las etiquetas
        etiqueta1 = new JLabel(" NAME");
        etiqueta2 = new JLabel(" PASSWORD");

        //establecemos los cuadros de texto para las etiquetas
        texto1 = new JTextField(20);
        texto2 = new JTextField(20);
        texto1.setText("");
        texto2.setText("");


        //establecemos el area de texto
        cuadroArea = new JTextArea("AREA DE TEXTO",10,15);


        // establecemos un tamaño para la ventana
        ventana.setSize(660,500);

        panel.add(boton1);
        panel.add(boton2);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(texto1);
        panel.add(texto2);
        panel.add(cuadroArea);
        ventana.add(panel);


        this.pecharVentana();

    }
    public void pecharVentana(){

            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setVisible(true); // hacemos visible la ventana
            ventana.setLocationRelativeTo(null); // establecemos la ventana en el medio



    }




}
