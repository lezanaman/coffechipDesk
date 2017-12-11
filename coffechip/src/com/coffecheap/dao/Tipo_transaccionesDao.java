/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffecheap.dao;

import com.coffecheap.modelo.Tipo_transacciones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acier
 */
public class Tipo_transaccionesDao extends Dao {

  public String registrar(Tipo_transacciones Tt) throws Exception {
String respuesta=null;
    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("insert into tipo_transacciones values(?);");

    
      st.setString(1, Tt.getNombre());

      st.executeUpdate();
 respuesta = "Registro Exitoso";
    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();

    }
return respuesta;
  }

  public ResultSet listar() throws Exception {
    List<Tipo_transacciones> lista;
    ResultSet rs;

    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareCall("SELECT *FROM tipo_transacciones");
      rs = st.executeQuery();
      

    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();
    }

    return rs;

  }

  public String modificar(Tipo_transacciones tt) throws Exception {
    String respuesta=null;
    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("UPDATE  tipo_transacciones SET id_tipo_transacciones=?, nombre_trasaccion=? WHERE id_tipo_transacciones=?;");

      st.setInt(1, tt.getId_tipo_transacciones());
      st.setString(2, tt.getNombre());
      st.setInt(3, tt.getId_tipo_transacciones());

      st.executeUpdate();
 respuesta = "Modicado Correctamente";
    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();

    }
return respuesta;
  }

  public String eliminar(Tipo_transacciones pac) throws Exception {
String respuesta = null;
    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("DELETE FROM tipo_transacciones WHERE id_tipo_transacciones=?;");
      st.setInt(1, pac.getId_tipo_transacciones());
      st.executeUpdate();
 respuesta = "Registro Eliminado Exitosamente";
    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();

    }
 return respuesta;
  }

}
