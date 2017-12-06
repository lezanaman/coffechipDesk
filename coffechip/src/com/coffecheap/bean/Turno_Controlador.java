package com.coffecheap.bean;

import com.coffecheap.dao.TurnoDao;
import com.coffecheap.modelo.Turno;
import com.coffecheap.vista.frmTurnoEliminar;
import com.coffecheap.vista.frmTurnoGuardar;
import com.coffecheap.vista.frmTurnoModificar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Turno_Controlador implements ActionListener {

    frmTurnoGuardar vistaturno = new frmTurnoGuardar();
    frmTurnoEliminar vistaturnoelim = new frmTurnoEliminar();
    frmTurnoModificar vistaturnomodi = new frmTurnoModificar();
    TurnoDao turnodao = new TurnoDao();
    Turno turno = new Turno();
    JTable tblturno;
    ResultSet rs;

    public Turno_Controlador(frmTurnoGuardar vistaturno, frmTurnoEliminar vistaeliminar,
            frmTurnoModificar vistamodi, TurnoDao turnodao) {
        this.vistaturno = vistaturno;
        this.vistaturnoelim = vistaeliminar;
        this.vistaturnomodi = vistamodi;
        this.turnodao = turnodao;
        this.vistaturnomodi.btnModificar.addActionListener(this);
        this.vistaturnoelim.btnEliminar.addActionListener(this);
        this.vistaturno.btnGuardar.addActionListener(this);
    }

    public void MostrarD() {

        DefaultTableModel dfm = new DefaultTableModel();
        tblturno = this.vistaturnoelim.tblTurno;
        tblturno.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"No. Codigo", "Horario del Turno", "Observaciones"});

        try {
            rs = turnodao.VerDatos();

            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("idturno"), rs.getString("horario_turno"), rs.getString("observaciones")});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void MostrarDM() {

        DefaultTableModel dfm = new DefaultTableModel();
        tblturno = this.vistaturnomodi.tblTurnoModificar;
        tblturno.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"No. Codigo", "Horario del Turno", "Observaciones"});

        try {
            rs = turnodao.VerDatos();

            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("idturno"), rs.getString("horario_turno"), rs.getString("observaciones")});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void Guardar() {

        try {

            if (this.vistaturno.txtHorario.getText().equals("  :   a   :  ") || this.vistaturno.txtObservaciones.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
            } else {
                this.turno.setHorario_turno(this.vistaturno.txtHorario.getText());
                this.turno.setObservaciones(this.vistaturno.txtObservaciones.getText());
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

    public void ModificarD() {
        try {

            if (this.vistaturnomodi.txtHorarioMod.getText().equals("  :   a   :  ") || this.vistaturnomodi.txtObservacionesMod.getText().length() == 0 || this.vistaturnomodi.txtCodigoMod.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
            } else {
                this.turno.setId_turno(Integer.parseInt(this.vistaturnomodi.txtCodigoMod.getText()));
                this.turno.setHorario_turno(this.vistaturnomodi.txtHorarioMod.getText());
                this.turno.setObservaciones(this.vistaturnomodi.txtObservacionesMod.getText());
                String respuesta = turnodao.Modificar(turno);
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

    public void Eliminar() {

        try {
            
            if (this.vistaturnoelim.txtCodigo.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
            } else {
                this.turno.setId_turno(Integer.parseInt(this.vistaturnoelim.txtCodigo.getText()));
                String respuesta = turnodao.Eliminar(turno);
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

        if (e.getSource() == vistaturno.btnGuardar) {
            Guardar();
        }

        if (e.getSource() == vistaturnoelim.btnEliminar) {
            Eliminar();
            MostrarD();
        }

        if (e.getSource() == vistaturnomodi.btnModificar) {
            ModificarD();
            MostrarDM();
        }

    }

    public void Limpiar() {
        this.vistaturnoelim.txtCodigo.setText(null);
        this.vistaturnomodi.txtCodigoMod.setText(null);
        this.vistaturnomodi.txtObservacionesMod.setText(null);
        this.vistaturnomodi.txtHorarioMod.setText(null);
        this.vistaturno.txtHorario.setText(null);
        this.vistaturno.txtObservaciones.setText(null);
    }

}
