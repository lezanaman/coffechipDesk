package coffechip;

import com.coffecheap.bean.MenuAdmin_Controlador;
import com.coffecheap.vista.MenuAdmin;

import com.coffecheap.vista.MenuAdminDos;
import com.sun.java.accessibility.util.AWTEventMonitor;
import static java.awt.Frame.MAXIMIZED_BOTH;

public class Coffechip {

    public static void main(String[] args) {

        MenuAdminDos menu = new MenuAdminDos();
        MenuAdmin_Controlador control;
        menu.addMouseListener(new MenuAdmin_Controlador());        
        menu.setVisible(true);
        menu.setLocationRelativeTo(menu);
        menu.setExtendedState(MAXIMIZED_BOTH);

    }
}
