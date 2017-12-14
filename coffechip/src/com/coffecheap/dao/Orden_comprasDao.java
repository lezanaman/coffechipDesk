package com.coffecheap.dao;

import com.coffecheap.modelo.Orden_compras;
import com.coffecheap.modelo.Proveedor_productos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acier
 */
public class Orden_comprasDao extends Dao {

  public String registrar(Orden_compras Tt) throws Exception {
    String respuesta = null;
    try {

      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("insert into orden_compras values(?,?,?,?,?,?,?);");
      st.setInt(1, Tt.getId_orden_compras());
      st.setString(2, Tt.getTemp_fecha_orden());

      st.setString(3, Tt.getTemp_fecha_entrega());
      st.setInt(4, Tt.getCantidad());
      st.setInt(5, Tt.getPproductos().getProducto().getId_producto());
      st.setInt(6, Tt.getPproductos().getProveedor().getId_proveedor());
      st.setDouble(7, Tt.getPrecio());

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
    List<Orden_compras> lista;
    ResultSet rs;

    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareCall("SELECT *FROM orden_compras");
      rs = st.executeQuery();

    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();
    }

    return rs;

  }

  public String modificar(Orden_compras tt) throws Exception {
    System.out.println("*******************************************************modificar dao");
    String respuesta = null;

    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("UPDATE  orden_compras SET id_orden_compras=?, fecha_orden=?, fecha_entrega=?, cantidad_orden=?, id_producto=?, id_proveedor=?, precio=? WHERE id_orden_compras=?;");

      st.setInt(1, tt.getId_orden_compras());
      //st.setDate(2, tt.getFecha_orden());
      // st.setDate(3, tt.getFecha_entrega());
      st.setInt(4, tt.getCantidad());
      st.setInt(5, tt.getPproductos().getProducto().getId_producto());
      st.setInt(6, tt.getPproductos().getProveedor().getId_proveedor());
      st.setDouble(7, tt.getPrecio());
      st.setInt(8, tt.getId_orden_compras());
      st.executeUpdate();
      respuesta = "Modicado Correctamente";

    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();

    }
    return respuesta;
  }

  public String eliminar(Orden_compras pac) throws Exception {
    System.out.println("*******************************************************eliminar dao");
    String respuesta = null;
    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("DELETE FROM orden_compras WHERE id_Orden_compras=?;");
      st.setInt(1, pac.getId_orden_compras());
      st.executeUpdate();
       respuesta = "Registro Eliminado Exitosamente";
    } catch (Exception ex) {
      throw ex;
    } finally {
      this.Desconecar();

    }
  return respuesta;
  }

  public List<Proveedor_productos> ListarProveedor_Produ(Orden_compras ordenid) throws Exception {

    List<Proveedor_productos> lista;
    ResultSet rs;
    try {
      this.Conectar();
      PreparedStatement st = this.getCon().prepareStatement("select proveedor.id_proveedor, producto.id_producto,"
              + "producto.nombre_producto, prov_prod.precio_insumo\n"
              + "from proveedor \n"
              + "inner join proveedor_productos as prov_prod\n"
              + "on(proveedor.id_proveedor = prov_prod.id_proveedor)\n"
              + "inner join producto \n"
              + "on(prov_prod.id_producto = producto.id_producto) where proveedor.id_proveedor=?;");
      st.setInt(1, ordenid.getPproductos().getProveedor().getId_proveedor());
      rs = st.executeQuery();
      lista = new ArrayList();
      while (rs.next()) {
        Proveedor_productos prove_pro = new Proveedor_productos();
        prove_pro.getProveedor().setId_proveedor(rs.getInt("proveedor.id_proveedor"));
        prove_pro.getProducto().setId_producto(rs.getInt("producto.id_producto"));
        prove_pro.getProducto().setNombre(rs.getString("producto.nombre_producto"));
        prove_pro.setPrecio(rs.getInt("prov_prod.precio_insumo"));
        lista.add(prove_pro);
      }
    } catch (Exception e) {
      throw e;
    } finally {
      this.Desconecar();
    }
    return lista;
  }

}
