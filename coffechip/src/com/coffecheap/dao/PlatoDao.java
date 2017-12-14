/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffecheap.dao;


import com.coffecheap.modelo.Plato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author medev
 */
public class PlatoDao extends Dao {
    
    
    public String registrar(Plato plat) throws Exception {
        System.out.println("*******Guardado Exitoso");
        String respuesta = null;
    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("insert into plato values(?,?,?,?,?);");
      st.setInt(1, plat.getId_plato());
      st.setString(2, plat.getNombre());
      st.setDouble(3, plat.getPrecio());
      st.setInt(4, plat.getPorciones());    
      st.setString(5, plat.getDescripcion());
      st.executeUpdate();
      respuesta = "Registro Exitoso";
    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();

    }
    return respuesta;
  }
    
    
  public ResultSet VerDatos() throws Exception {
        ResultSet rs;

        try {
            this.Conectar();
            PreparedStatement st = this.getCon().prepareStatement("select * from plato");
            rs = st.executeQuery();
        } catch (Exception e) {
            throw e;
        }
        return rs;
    }
  
  
  public List<Plato> listar() throws Exception {
    List<Plato> lista;
    ResultSet rs;

    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareCall("SELECT *FROM plato;");
      rs = st.executeQuery();
      lista = new ArrayList();
      while (rs.next()) {
        Plato plat = new Plato();

        plat.setId_plato(rs.getInt("id_plato"));
        plat.setNombre(rs.getString("nombre_platillo"));
        plat.setPrecio(rs.getDouble("precio_plato"));
        plat.setPorciones(rs.getInt("porciones"));
        plat.setDescripcion(rs.getString("descripcion_plato"));
        
        
        
        lista.add(plat);
      }

    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();
    }

    return lista;

  }

  public String modificar(Plato plat) throws Exception {
    System.out.println("*******************************************************modificar dao");
    String respuesta;
    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("UPDATE  plato SET id_plato=?, nombre_platillo=?, precio_plato=?, porciones=?, descripcion_plato=? WHERE id_plato=?;");

      st.setInt(1, plat.getId_plato());
      st.setString(2, plat.getNombre());
      st.setDouble(3, plat.getPrecio());
      st.setInt(4, plat.getPorciones());    
      st.setString(5, plat.getDescripcion());
      st.setInt(6, plat.getId_plato());
      st.executeUpdate();
      respuesta="Modificado correctamente";

    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();

    }
    return respuesta;
  }

  public String eliminar(Plato plat) throws Exception {
    System.out.println("*******************************************************eliminar dao");
    String respuesta;
    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("DELETE FROM plato WHERE id_plato=?;");
      st.setInt(1, plat.getId_plato());
      st.executeUpdate();
      respuesta="Eliminado Correctamente";
    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();

    }
    return respuesta;
  }
}
