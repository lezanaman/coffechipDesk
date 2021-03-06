package com.coffecheap.bean;

import com.coffecheap.dao.ClienteDao;
import com.coffecheap.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteBean {

  Cliente cliente = new Cliente();
  List<Cliente> lstCliente = new ArrayList();

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public List<Cliente> getLstCliente() {
    return lstCliente;
  }

  public void setLstCliente(List<Cliente> lstCliente) {
    this.lstCliente = lstCliente;
  }

  public void registrar() throws Exception {

    ClienteDao dao;
    try {
      dao = new ClienteDao();
      dao.registrar(cliente);

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void mostar() throws Exception {
    ClienteDao dao;

    try {
      dao = new ClienteDao();
      lstCliente = dao.mostrar();
    } catch (Exception e) {
      throw e;
    }
  }

  public void mostarPorParametro() throws Exception {
    ClienteDao dao;

    try {
      dao = new ClienteDao();
      lstCliente = dao.mostrarPorPrarametro(cliente);
    } catch (Exception e) {
      throw e;
    }
  }

  public void buscar() throws Exception {
    ClienteDao dao;
    Cliente temp;

    try {
      dao = new ClienteDao();
      temp = dao.leerParaModificar(cliente);

      if (cliente != null) {
        this.cliente = temp;
      }

    } catch (Exception e) {
      throw e;
    }
  }

  public void modificar() throws Exception {
    ClienteDao dao;

    try {
      dao = new ClienteDao();
      dao.modificar(cliente);
    } catch (Exception e) {
      throw e;
    }
  }

  public void eliminar() throws Exception {
    ClienteDao dao;

    try {
      dao = new ClienteDao();
      dao.eliminar(cliente);
    } catch (Exception e) {
      throw e;
    }
  }

}
