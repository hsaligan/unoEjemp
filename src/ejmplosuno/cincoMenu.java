package ejmplosuno;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cincoMenu extends JFrame implements ActionListener{
 
  private JMenuBar menubar;
  private JMenu menu1, menu10;
  private JMenuItem menuitem1, menuitem2, menuitem3;
  private JMenuItem menuitem10, menuitem20, menuitem30;

  public cincoMenu(){
    setLayout(null);
    menubar = new JMenuBar();
    setJMenuBar(menubar);

    menu1 = new JMenu("Opciones");
    menubar.add(menu1);

    menuitem1 = new JMenuItem("Rojo");
    menuitem1.addActionListener(this);
    menu1.add(menuitem1);

    menuitem2 = new JMenuItem("Verde");
    menuitem2.addActionListener(this);
    menu1.add(menuitem2);

    menuitem3 = new JMenuItem("Azul");
    menuitem3.addActionListener(this);
    menu1.add(menuitem3);
    
    /****************/
    menu10 = new JMenu("OpcionesDos");
    menubar.add(menu10);

    menuitem10 = new JMenuItem("RojoDos");
    menuitem10.addActionListener(this);
    menu10.add(menuitem10);

    menuitem20 = new JMenuItem("VerdeDos");
    menuitem20.addActionListener(this);
    menu10.add(menuitem20);

    menuitem30 = new JMenuItem("AzulDos");
    menuitem30.addActionListener(this);
    menu10.add(menuitem30);
    /****************/
  }

  public void actionPerformed(ActionEvent e){
    Container fondo = this.getContentPane();

    if(e.getSource() == menuitem1){
       fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource() == menuitem2){
       fondo.setBackground(new Color(0,255,0));
    }
    if(e.getSource() == menuitem3){
       fondo.setBackground(new Color(0,0,255));
    }
    
    /******************/
    if(e.getSource() == menuitem10){
       fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource() == menuitem20){
       fondo.setBackground(new Color(0,255,0));
    }
    if(e.getSource() == menuitem30){
       fondo.setBackground(new Color(0,0,255));
    }
    /******************/
    
  }  

  public static void main(String args[]){
   cincoMenu formulario1 = new cincoMenu();
   formulario1.setBounds(0,0,400,300);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
  }
}
