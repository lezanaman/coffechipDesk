package com.coffecheap.bean;

import com.coffecheap.modelo.Turno;
import com.coffecheap.vista.frmMesaControl;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Mesa_Control_Controlador implements ActionListener {

  frmMesaControl MC = new frmMesaControl();

  public void generarBotones() {

    int x = 1;

    while (x <= 10) {

      //En la parte izquierda de una asignación solo puede haber el nombre de una variable
      // Jbutton miboton + x = new Jbutton();
      Jbutton botonlocal = new Jbutton();
      //MC.add(botonlocal);

      HashMap<String, JButton> botones = new HashMap<String, JButton>();
      int i;

      for (i = 1; i <= 10; i++) {

        Jbutton boton = new Jbutton();
        //botones.put("boton" + i, boton);
        //MC.add(boton);
      }

      /* 
         * Se puede simplificar de esta otra manera
         *  frame.add(new Jbutton());
       */
      x++;
    }

    MC.setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String evento = e.getActionCommand();

    /*if (evento.equals("Guardar")) {
      Guardar();
    }

    if (evento.equals("Eliminar")) {
      Eliminar();
      MostrarD();
    }

    if (evento.equals("Modificar")) {
      ModificarD();
      MostrarDM();
    }*/

  }

  public void Limpiar() {
    //this.vistaturnoelim.txtCodigo.setText(null);

  }

}
