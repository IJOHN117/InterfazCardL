package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        //Edicion de ventana
        JFrame miVentana = new JFrame();
        miVentana.setSize(1000, 800);
        miVentana.setTitle("Catalogo de clientes");
        miVentana.setBackground(Color.gray);
        miVentana.setLocation(480, 100);
        miVentana.setResizable(false);


        //Adicion del Card
        JPanel panelGeneral = new JPanel(new CardLayout());

        //Creacion y edicion de encabezado
        JPanel panelEncabezado = new JPanel();
        panelEncabezado.setBackground(Color.gray); // Cambios de color para diferenciar paneles
        JLabel lblEncabezado = new JLabel();
        lblEncabezado.setText("Catalogo de clientes");
        lblEncabezado.setFont(new Font("Arial",1,30));
        panelEncabezado.add(lblEncabezado);


        //Creacion y edicion de Cuerpo
        JPanel panelCuerpo = new JPanel();
        panelCuerpo.setBackground(Color.lightGray);

        JLabel lblClave = new JLabel("Clave");
        lblClave.setFont(new Font("Arial",1,15));
        JTextField jtxClave = new JTextField(10);

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setFont(new Font("Arial",1,15));
        JTextField jtxFNombre =new JTextField(10);

        JLabel lblDireccion = new JLabel("Direccion");
        lblDireccion.setFont(new Font("Arial",1,15));
        JTextField jtxDireccion =new JTextField(10);

        JLabel lblCiudad =new JLabel("Ciudad");
        lblCiudad.setFont(new Font("Arial",1,15));
        JComboBox <String> jCmbCiudad = new JComboBox<>();
        jCmbCiudad.addItem("Veracruz");
        jCmbCiudad.addItem("Xalapa");
        panelCuerpo.add(lblClave);
        panelCuerpo.add(jtxClave);
        panelCuerpo.add(lblNombre);
        panelCuerpo.add(jtxFNombre);
        panelCuerpo.add(lblDireccion);
        panelCuerpo.add(jtxDireccion);
        panelCuerpo.add(lblCiudad);
        panelCuerpo.add(jCmbCiudad);


        //Creacion y edicion de Pie
        JPanel panelPie = new JPanel();
        JButton jBtnEncabezdado = new JButton("panelEncabezdado");
        JButton jBtnCuerpo = new JButton("panelCuerpo");

        //Adicion de cacciones para los botones
        jBtnEncabezdado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                CardLayout cardLayout = (CardLayout) panelGeneral.getLayout();
                cardLayout.show(panelGeneral, "panelEncabezdado");
            }
        });


        jBtnCuerpo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                CardLayout cardLayout = (CardLayout) panelGeneral.getLayout();
                cardLayout.show(panelGeneral, "panelCuerpo");
            }
        });


        panelPie.add(jBtnEncabezdado);
        panelPie.add(jBtnCuerpo);


        //adicion de paneles al frame
        panelGeneral.add(panelEncabezado, "panelEncabezdado");
        panelGeneral.add(panelCuerpo, "panelCuerpo");

        miVentana.add(panelPie, BorderLayout.SOUTH);
        miVentana.add(panelGeneral, BorderLayout.CENTER);



        //sistema de muestra y cierre
        miVentana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        miVentana.setVisible(true);
    }
}