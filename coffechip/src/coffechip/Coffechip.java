package coffechip;

import com.coffecheap.bean.MenuAdmin_Controlador;
import com.coffecheap.vista.MenuAdmin;

import com.coffecheap.vista.MenuAdmin;
import com.sun.java.accessibility.util.AWTEventMonitor;
import static java.awt.Frame.MAXIMIZED_BOTH;

public class Coffechip {

    public static void main(String[] args) {

        MenuAdmin menu = new MenuAdmin();
        MenuAdmin_Controlador control = new  MenuAdmin_Controlador(menu);
        menu.setVisible(true);
        menu.setLocationRelativeTo(menu);
        menu.setExtendedState(MAXIMIZED_BOTH);

    }
}
