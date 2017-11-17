package com.coffecheap.bean;

import com.coffecheap.dao.TurnoDao;
import com.coffecheap.modelo.Turno;
import com.coffecheap.vista.frmTurnoGuardar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Turno_Controlador implements ActionListener {

    frmTurnoGuardar vistaturno = new frmTurnoGuardar();
    TurnoDao turnodao = new TurnoDao();
    Turno turno = new Turno();

    public Turno_Controlador(frmTurnoGuardar vistaturno, TurnoDao turnodao) {
        this.vistaturno = vistaturno;
        this.turnodao = turnodao;
        this.vistaturno.btnGuardar.addActionListener(this);
        this.vistaturno.btnGuardar.setActionCommand("Guardar");
    }

    public void Guardar() {

        try {
            this.turno.setHorario_turno(this.vistaturno.txtHorario.getText());
            this.turno.setObservaciones(this.vistaturno.txtObservaciones.getText());

            if (this.vistaturno.txtHorario.getText().equals("  :   a   :  ") || this.vistaturno.txtObservaciones.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
            } else {
                String respuesta = turnodao.Ingresar(turno);
                if (respuesta != null) {
                    JOptionPane.showMessageDialog(null, respuesta);
                    Limpiar();

                }
            }

        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(Turno_Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String evento = e.getActionCommand();

        if (evento.equals("Guardar")) {
            Guardar();
        }
    }

    public void Limpiar() {
        this.vistaturno.txtHorario.setText(null);
        this.vistaturno.txtObservaciones.setText(null);
    }

}
