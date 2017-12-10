/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffecheap.dao;

import com.coffecheap.modelo.Estado_mesa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acier
 */
public class Estado_mesaDao extends Dao {

  public String registrar(Estado_mesa Tt) throws Exception {
    String respuesta = null;
    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("insert into estado_mesa values(?,?);");

      st.setInt(1, Tt.getId_estado());
      st.setString(2, Tt.getNombre());
      st.executeUpdate();
      respuesta = "Registro Exitoso";

    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();
      Tt.setId_estado(0);
      Tt.setNombre(null);

    }
    return respuesta;
  }

  public ResultSet listar() throws Exception {

    ResultSet rs;

    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("SELECT *FROM estado_mesa");
      rs = st.executeQuery();

    } catch (Exception e) {
      throw e;
    }
    return rs;
  }

  public String modificar(Estado_mesa tt) throws Exception {
    System.out.println("*******************************************************modificar dao");
    String respuesta = null;
    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("UPDATE  estado_mesa SET id_estado_mesa=?, nombre=? WHERE id_estado=?;");

      st.setInt(1, tt.getId_estado());
      st.setString(2, tt.getNombre());
      st.setInt(3, tt.getId_estado());
      st.executeUpdate();
      respuesta = "Modicado Correctamente";

    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();
      tt.setId_estado(0);
      tt.setNombre(null);
    }
    return respuesta;
  }

  public String eliminar(Estado_mesa pac) throws Exception {
    String respuesta = null;
    System.out.println("*******************************************************eliminar dao");
    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("DELETE FROM estado_mesa WHERE id_estado=?;");
      st.setInt(1, pac.getId_estado());
      st.executeUpdate();
      respuesta = "Registro Eliminado Exitosamente";

    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();
      pac.setId_estado(0);
    }
    return respuesta;
  }

}
