/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffecheap.dao;

import com.coffecheap.modelo.Tipo_producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acier
 */
public class Tipo_productoDao extends Dao {

    public String registrar(Tipo_producto Tt) throws Exception {
        String respuesta = null;
        try {
            this.Conectar();
            PreparedStatement st = this.getCon().prepareStatement("insert into tipo_producto values(?);");

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
        List<Tipo_producto> lista;
        ResultSet rs;

        try {
            this.Conectar();
            PreparedStatement st = this.getCon().prepareCall("SELECT *FROM tipo_producto");
            rs = st.executeQuery();

        } catch (Exception ex) {
            throw ex;
        }

        return rs;

    }

    public String modificar(Tipo_producto tt) throws Exception {
        String respuesta = null;
        try {
            this.Conectar();
            PreparedStatement st = this.getCon().prepareStatement("UPDATE  tipo_producto SET id_tipo=?, nombre_tipo=? WHERE id_tipo=?;");

            st.setInt(1, tt.getId_tipo());
            st.setString(2, tt.getNombre());
            st.setInt(3, tt.getId_tipo());

            st.executeUpdate();
            respuesta = "Modicado Correctamente";
        } catch (Exception ex) {
            throw ex;
        } finally {
            this.Desconecar();
            tt.setId_tipo(0);
            tt.setNombre(null);

        }
        return respuesta;
    }

    public String eliminar(Tipo_producto pac) throws Exception {
        String respuesta = null;
        try {
            this.Conectar();
            PreparedStatement st = this.getCon().prepareStatement("DELETE FROM tipo_producto WHERE id_tipo_producto=?;");
            st.setInt(1, pac.getId_tipo());
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
