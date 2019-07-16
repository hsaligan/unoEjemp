package ejmplosuno;

/****modificación***********************/

import javax.swing.*;
import java.awt.event.*;

public class Uno extends JFrame implements ActionListener{

    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3, etiquetaTexto;
    private JButton boton1, boton2, boton3, botonTexto, botonAgregar;
    private JTextField texto;
    private JTextArea textoLargo;
    private JScrollPane scrollTexto;
    private int sinUar = 0;
    
    String textoDos = "";
        
    public Uno(){
        //JLabel etiqueta1;
        //JLabel etiqueta2;
        //JButton boton1;
        setLayout(null);
        etiqueta3 = new JLabel("En espera...");
        etiqueta3.setBounds(10, 1, 300, 200);
        add(etiqueta3);
        etiqueta1 = new JLabel("Etiqueta uno");
        etiqueta1.setBounds(10, 20, 300, 200);
        add(etiqueta1);
        etiqueta2 = new JLabel("Etiqueta dos");
        etiqueta2.setBounds(10, 70, 300, 200);
        add(etiqueta2);
        
        etiquetaTexto = new JLabel("Usuario");
        etiquetaTexto.setBounds(10, 90, 300, 200);
        add(etiquetaTexto);
        
        textoLargo = new JTextArea();
        //textoLargo.setBounds(10, 240, 300, 200);
        //add(textoLargo);
        scrollTexto = new JScrollPane(textoLargo);
        scrollTexto.setBounds(10, 240, 300, 200);
        add(scrollTexto);
        
        texto = new JTextField();
        texto.setBounds(120, 97, 150, 20);
        add(texto);
        
        boton1 = new JButton("Cerrar");
        boton1.setBounds(10, 20, 90, 20);
        add(boton1);
        boton1.addActionListener(this);
        
        boton2 = new JButton("Boton 2");
        boton2.setBounds(110, 20, 90, 20);
        add(boton2);
        boton2.addActionListener(this);
        
        boton3 = new JButton("Boton 3");
        boton3.setBounds(210, 20, 90, 20);
        add(boton3);
        boton3.addActionListener(this);
        
        botonTexto = new JButton("Aceptar");
        botonTexto.setBounds(310, 20, 90, 20);
        add(botonTexto);
        botonTexto.addActionListener(this);
        
        botonAgregar = new JButton("Agregar");
        botonAgregar.setBounds(410, 20, 90, 20);
        add(botonAgregar);
        botonAgregar.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            System.exit(0);
        } else if (e.getSource() == boton2) {
            etiqueta3.setText("Presionado 2");
        }else if (e.getSource() == boton3) {
            etiqueta3.setText("Presionado 3");
        }else if (e.getSource() == botonTexto) {
            //etiqueta3.setText("Presionado 3");
            String textoUno = texto.getText();
            setTitle(textoUno);
        } else if (e.getSource() == botonAgregar) {
            //etiqueta3.setText("Presionado 3");
            //String textoUno = texto.getText();
            textoDos += texto.getText() + "\n";
            textoLargo.setText(textoDos);
            //textoAgregar.setText(textoLargo);
            texto.setText("");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("uno");
        Uno forma1 = new Uno();
        forma1.setBounds(0, 0, 550, 500);
        forma1.setLocationRelativeTo(null);
        forma1.setResizable(false);
        forma1.setVisible(true);
    }
    
}
