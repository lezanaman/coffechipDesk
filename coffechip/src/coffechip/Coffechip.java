package coffechip;

import com.coffecheap.bean.MenuAdmin_Controlador;
import com.coffecheap.vista.MenuAdmin;
import static java.awt.Frame.MAXIMIZED_BOTH;

public class Coffechip {

    public static void main(String[] args) {
        MenuAdmin menu = new MenuAdmin();
        MenuAdmin_Controlador controlador = new MenuAdmin_Controlador(menu);
        
        
        
        menu.setExtendedState(MAXIMIZED_BOTH);
        menu.setLocationRelativeTo(menu);
        menu.setVisible(true);

    }
}
